package com.lestnica.releaseassistant.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lestnica.releaseassistant.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    User findByChatId(Long chatId);
    boolean existsByChatId(Long chatId);
    
} 