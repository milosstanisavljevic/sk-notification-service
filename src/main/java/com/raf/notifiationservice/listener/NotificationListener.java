package com.raf.notifiationservice.listener;

import com.raf.notifiationservice.listener.helper.MessageHelper;
import com.raf.notifiationservice.service.EmailService;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {

    private MessageHelper messageHelper;
    private EmailService emailService;

    public NotificationListener(MessageHelper messageHelper, EmailService emailService) {
        this.messageHelper = messageHelper;
        this.emailService = emailService;
    }
    //@JmsListener(destination = "${destination.sendEmails}", concurrency = "5-10")
//    public void addOrder(Message message) throws JMSException {
//        MatchesDto matchesDto = messageHelper.getMessage(message, MatchesDto.class);
//        emailService.sendSimpleMessage("mradovic01011111@gmail.com", "subject", matchesDto.toString());
//    }
}
