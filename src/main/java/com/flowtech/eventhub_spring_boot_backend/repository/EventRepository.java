package com.flowtech.eventhub_spring_boot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowtech.eventhub_spring_boot_backend.entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
