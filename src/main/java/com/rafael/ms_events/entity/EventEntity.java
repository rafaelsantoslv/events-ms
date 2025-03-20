package com.rafael.ms_events.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="event")
@Table(name="event")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private String data;
    private String title;
    private String description;

}
