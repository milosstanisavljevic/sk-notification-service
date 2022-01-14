package com.raf.notifiationservice.controller;

import com.raf.notifiationservice.dto.NotificationDto;
import com.raf.notifiationservice.service.NotificationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private NotificationService notificationService;
    public NotificationController(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    @GetMapping("/getAllNotifications")
    public ResponseEntity<List<NotificationDto>> findAll() {
        return new ResponseEntity<>(notificationService.findAll(), HttpStatus.OK);
    }
}
