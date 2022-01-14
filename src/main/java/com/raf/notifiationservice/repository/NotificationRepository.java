package com.raf.notifiationservice.repository;

import com.raf.notifiationservice.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Integer> {
}
