package com.flowtech.eventhub_spring_boot_backend.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.flowtech.eventhub_spring_boot_backend.entity.User;



public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);
}
