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
@Table(name = "RAM")
public class RAM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "model", length = 100)
    private String model;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "frequency")
    private Integer frequency;

    @Column(name = "capacity_GB")
    private Integer capacityGB;

    @Column(name = "form_factor", length = 50)
    private String formFactor;

    @Column(name = "Supply_voltage", precision = 3, scale = 1)
    private BigDecimal supplyVoltage;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

}
