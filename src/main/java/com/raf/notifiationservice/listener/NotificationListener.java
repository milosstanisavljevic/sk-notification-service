package com.raf.notifiationservice.listener;

import com.raf.notifiationservice.listener.helper.MessageHelper;
import com.raf.notifiationservice.service.NotificationService;

public class NotificationListener {

    private MessageHelper messageHelper;
    private NotificationService notificationService;

    public NotificationListener(MessageHelper messageHelper, NotificationService notificationService) {
        this.messageHelper = messageHelper;
        this.notificationService = notificationService;
    }
}
