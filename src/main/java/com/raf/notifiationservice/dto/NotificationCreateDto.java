package com.raf.notifiationservice.dto;

import com.raf.notifiationservice.domain.Type;

public class NotificationCreateDto {
    private Type type;
    private String text;
    private String userEmail;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
