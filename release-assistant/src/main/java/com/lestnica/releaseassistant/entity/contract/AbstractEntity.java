package com.lestnica.releaseassistant.entity.contract;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.UUID;

@MappedSuperclass
@Getter
public abstract class AbstractEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
}
