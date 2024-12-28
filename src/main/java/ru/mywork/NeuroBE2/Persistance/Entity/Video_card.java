package ru.mywork.NeuroBE2.Persistance.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "video_card")
public class Video_card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "model", nullable = false, length = 100)
    private String model;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "pci_interface", precision = 10,  columnDefinition = "DECIMAL(10, 1) DEFAULT 0.0")
    private Double pciInterface;

    @Column(name = "Number_of_stream_processors")
    private Integer numberOfStreamProcessors;

    @Column(name = "Energy_consumption")
    private Integer energyConsumption;

    @Column(name = "Memory_type", length = 50)
    private String memoryType;

    @Column(name = "memory_size_GB")
    private Integer memorySizeGB;

    @Column(name = "Core_frequency")
    private Integer coreFrequency;

    @Column(name = "length_mm")
    private Integer lengthMm;

    @Column(name = "price", nullable = false, precision = 10)
    private Double price;
}
