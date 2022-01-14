package com.raf.notifiationservice.scheduler;

import com.raf.notifiationservice.dto.NotificationCreateDto;
import com.raf.notifiationservice.service.EmailService;
import com.raf.notifiationservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpleScheduler {

    @Autowired
    EmailService emailService;

    @Scheduled(fixedDelay = 1000000000, initialDelay = 1000000000)
    public void reservationReminder(){
        emailService.sendSimpleMessage("mstanic5819rn@raf.rs","subject","sk2");

    }
}
