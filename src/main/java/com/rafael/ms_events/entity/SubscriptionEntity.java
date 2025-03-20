package com.rafael.ms_events.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="subscription")
@Table(name="subscription")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class SubscriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private EventEntity event;

    private String participantEmail;
}
