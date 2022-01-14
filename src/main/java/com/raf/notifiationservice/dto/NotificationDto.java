package com.raf.notifiationservice.dto;

import com.raf.notifiationservice.domain.Type;

public class NotificationDto {

    private Integer id;
    private Type type;
    private String text;
    private Integer userEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Integer userEmail) {
        this.userEmail = userEmail;
    }
}
