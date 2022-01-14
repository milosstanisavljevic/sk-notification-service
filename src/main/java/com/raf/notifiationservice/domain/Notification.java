package com.raf.notifiationservice.domain;

import javax.persistence.*;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Type type;
    @Column
    private String text;
    @Column
    private String userEmail;

    public Notification(){

    }
    public Notification(Type type,String text,String userId){
        this.text = text;
        this.type = type;
        this.userEmail = userId;
    }

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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userId) {
        this.userEmail = userId;
    }
}
