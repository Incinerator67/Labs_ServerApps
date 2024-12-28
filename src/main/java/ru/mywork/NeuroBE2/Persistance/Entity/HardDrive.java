package ru.mywork.NeuroBE2.Persistance.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "harddrives")
public class HardDrive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "model", length = 100, nullable = false)
    private String model;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "interface", length = 50)
    private String driveInterface;

    @Column(name = "read_speed")
    private Integer readSpeed;

    @Column(name = "form_factor", length = 50)
    private String formFactor;

    @Column(name = "power_consumption", precision = 10, scale = 1)
    private BigDecimal powerConsumption;

    @Column(name = "price", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;
}
