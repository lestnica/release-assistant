package com.lestnica.releaseassistant.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lestnica.releaseassistant.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, UUID> {
    
}
