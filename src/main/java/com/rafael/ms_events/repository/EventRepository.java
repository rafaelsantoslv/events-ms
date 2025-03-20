package com.rafael.ms_events.repository;


import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<EventRepository, String> {
    @Query(value = "SELECT * FROM events e WHERE PARSE(e.date AS TIMESTAMP) > :currentDate", nativeQuery = true)
    List<EventRepository> findUpcomingEvents(@Param("currentDate") LocalDateTime currentDate);

    @Nonnull
    Optional<EventRepository> findById(@Nonnull String id);
}
