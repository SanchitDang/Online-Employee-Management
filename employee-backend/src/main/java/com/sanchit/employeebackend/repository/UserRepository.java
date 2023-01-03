package com.sanchit.employeebackend.repository;

import com.sanchit.employeebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
