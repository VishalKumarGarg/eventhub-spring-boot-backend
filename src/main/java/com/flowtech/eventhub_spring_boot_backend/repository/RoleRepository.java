package com.flowtech.eventhub_spring_boot_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowtech.eventhub_spring_boot_backend.entity.Role;



public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByName(String name);
	boolean existsByName(String name);
}
