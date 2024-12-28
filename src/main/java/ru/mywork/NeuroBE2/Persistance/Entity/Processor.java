package ru.mywork.NeuroBE2.Persistance.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "processor")
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "model", nullable = false, length = 100)
    private String model;

    @Column(name = "description")
    private String description;

    @Column(name = "socket", nullable = false, length = 50)
    private String socket;

    @Column(name = "Cores")
    private Integer cores;

    @Column(name = "Flows")
    private Integer flows;

    @Column(name = "Base_frequency", precision = 10)
    private Double baseFrequency;

    @Column(name = "Maximum_frequency", precision = 10)
    private Double maximumFrequency;

    @Column(name = "Level_1_cache", length = 50)
    private String level1Cache;

    @Column(name = "Level_2_cache", length = 50)
    private String level2Cache;

    @Column(name = "Level_3_cache", length = 50)
    private String level3Cache;

    @Column(name = "Max_core_temperature", length = 50)
    private String maxCoreTemperature;

    @Column(name = "Energy_consumption")
    private Integer energyConsumption;

    @Column(name = "pcie_version", precision = 10, columnDefinition = "DECIMAL(10, 1) DEFAULT 0.0")
    private Double pcieVersion;

    @Column(name = "Types_of_RAM", length = 255)
    private String typesOfRAM;

    @Column(name = "price", nullable = false, precision = 10)
    private Double price;
}
