package com.miguelortega.beebags.users.repository;

import com.miguelortega.beebags.employees.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<EmployeeEntity, String> {
}
