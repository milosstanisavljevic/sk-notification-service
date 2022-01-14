package com.raf.notifiationservice.scheduler;

import com.raf.notifiationservice.dto.NotificationCreateDto;
import com.raf.notifiationservice.service.NotificationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpleScheduler {

    private NotificationService notificationService;

    public SimpleScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1000000000, initialDelay = 1000000000)
    public void reservationReminder(NotificationCreateDto notificationCreateDto){
        notificationService.sendNotification(notificationCreateDto);
    }
}
