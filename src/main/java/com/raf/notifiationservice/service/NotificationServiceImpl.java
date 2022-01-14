package com.raf.notifiationservice.service;

import com.raf.notifiationservice.domain.Notification;
import com.raf.notifiationservice.domain.Type;
import com.raf.notifiationservice.dto.NotificationCreateDto;
import com.raf.notifiationservice.dto.NotificationDto;
import com.raf.notifiationservice.mapper.NotificationMapper;
import com.raf.notifiationservice.repository.NotificationRepository;
import com.raf.notifiationservice.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService{

    private NotificationRepository notificationRepository;
    private NotificationMapper notificationMapper;
    private TypeRepository typeRepository;
    private EmailService emailService;
    private RestTemplate userServiceRestTemplate;
    private RestTemplate reservationServiceRestTemplate;

    public NotificationServiceImpl(NotificationRepository notificationRepository,NotificationMapper notificationMapper,TypeRepository typeRepository,EmailService emailService
    ,RestTemplate userServiceRestTemplate,RestTemplate reservationServiceRestTemplate){
        this.notificationRepository = notificationRepository;
        this.notificationMapper = notificationMapper;
        this.typeRepository = typeRepository;
        this.emailService = emailService;
        this.userServiceRestTemplate = userServiceRestTemplate;
        this.reservationServiceRestTemplate = reservationServiceRestTemplate;

    }

    @Override
    public List<NotificationDto> findAll() {
        List<NotificationDto> list = new ArrayList<>();

        for (Notification notification : notificationRepository.findAll()){

            list.add(notificationMapper.notificationToNotificationDto(notification));
        }
        return list;
    }

    @Override
    public void sendNotification(NotificationCreateDto notificationCreateDto) {
        Type type = null;
        if (typeRepository.findTypeByNotifacionType(notificationCreateDto.getType().getNotifacionType()).isPresent()){
            type = typeRepository.findTypeByNotifacionType(notificationCreateDto.getType().getNotifacionType()).get();
          }
        String poruka = null;

//
        Notification notification = notificationMapper.notificationCreateDtoToNotification(notificationCreateDto);
        notification.setText(poruka);
        notificationRepository.save(notification);
        emailService.sendSimpleMessage(notification.getUserEmail(), notification.getType().getNotifacionType(), notification.getText());

    }
}
