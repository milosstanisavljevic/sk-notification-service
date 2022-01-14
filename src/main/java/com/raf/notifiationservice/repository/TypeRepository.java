package com.raf.notifiationservice.repository;

import com.raf.notifiationservice.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type,Integer> {

    Optional<Type>findTypeByNotifacionType(String type);
}
