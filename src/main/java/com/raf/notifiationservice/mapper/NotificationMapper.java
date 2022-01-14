package com.raf.notifiationservice.mapper;

import com.raf.notifiationservice.domain.Notification;
import com.raf.notifiationservice.dto.NotificationCreateDto;
import com.raf.notifiationservice.dto.NotificationDto;
import org.springframework.stereotype.Component;

@Component
public class NotificationMapper {

    public NotificationDto notificationToNotificationDto(Notification notification){
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setId(notification.getId());
        notificationDto.setText(notification.getText());
        notificationDto.setType(notification.getType());
        notification.setUserEmail(notification.getUserEmail());
        return notificationDto;
    }
    public Notification notificationCreateDtoToNotification(NotificationCreateDto notificationCreateDto){
        Notification notification = new Notification();
        notification.setType(notificationCreateDto.getType());
        notification.setUserEmail(notificationCreateDto.getUserEmail());
        notification.setText(notificationCreateDto.getText());
        return notification;
    }
}
