package com.lestnica.releaseassistant.entity;

import java.time.LocalDateTime;
import java.util.Set;

import com.lestnica.releaseassistant.entity.contract.AbstractEntity;

import ch.qos.logback.core.joran.action.Action;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Builder
@Setter
@Getter
@Entity
@Table(name = "bot_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AbstractEntity{

    @Column(name = "chat_id", unique = true, nullable = false)
    Long chatId;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "registered_at")
    LocalDateTime registeredAt;

    @Enumerated(EnumType.STRING)
    Action action;

    @OneToMany
    Set<Notification> Notifications;
    
}
