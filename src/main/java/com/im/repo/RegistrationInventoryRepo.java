package com.im.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.entity.Register;

public interface RegistrationInventoryRepo extends JpaRepository<Register, Integer> {

}
