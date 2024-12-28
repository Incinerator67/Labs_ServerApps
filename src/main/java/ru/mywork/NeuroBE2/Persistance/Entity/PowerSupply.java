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
@Table(name = "powersupply")
public class PowerSupply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "model", length = 100, nullable = false)
    private String model;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "length", precision = 10, scale = 2)
    private BigDecimal length;

    @Column(name = "width", precision = 10, scale = 2)
    private BigDecimal width;

    @Column(name = "height", precision = 10, scale = 2)
    private BigDecimal height;

    @Column(name = "weight", precision = 10, scale = 2)
    private BigDecimal weight;

    @Column(name = "power_W", nullable = false)
    private Integer powerW;

    @Column(name = "form_factor", length = 50)
    private String formFactor;

    @Column(name = "modularity", length = 30)
    private String modularity;

    @Column(name = "noise_level_dB", precision = 5, scale = 2)
    private BigDecimal noiseLevelDb;

    @Column(name = "pci_connectors")
    private Integer pciConnectors;

    @Column(name = "sata_connectors")
    private Integer sataConnectors;

    @Column(name = "price", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;
}
