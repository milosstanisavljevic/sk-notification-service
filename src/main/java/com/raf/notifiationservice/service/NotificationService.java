package com.raf.notifiationservice.service;

import com.raf.notifiationservice.dto.NotificationCreateDto;
import com.raf.notifiationservice.dto.NotificationDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationService {

    List<NotificationDto> findAll();
    void sendNotification(NotificationCreateDto notificationCreateDto);
}
