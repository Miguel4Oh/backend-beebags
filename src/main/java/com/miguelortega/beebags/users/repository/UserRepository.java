package com.miguelortega.beebags.users.repository;

import com.miguelortega.beebags.employees.entity.EmployeeEntity;
import com.miguelortega.beebags.users.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    Optional<UserEntity> findByUserId(String username);
}
