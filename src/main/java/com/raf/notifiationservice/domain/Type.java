package com.raf.notifiationservice.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String notifacionType;

    public Type(){}
    public Type(String notifacionType){
        this.notifacionType = notifacionType;
    }

    public String getNotifacionType() {
        return notifacionType;
    }

    public void setNotifacionType(String notifacionType) {
        this.notifacionType = notifacionType;
    }
}
