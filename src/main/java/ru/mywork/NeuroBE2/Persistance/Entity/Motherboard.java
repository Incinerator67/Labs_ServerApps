package ru.mywork.NeuroBE2.Persistance.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "Motherboards")
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "model", length = 100, nullable = false)
    private String model;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "socket", length = 50)
    private String socket;

    @Column(name = "chipset", length = 50)
    private String chipset;

    @Column(name = "usb_ports", length = 50)
    private String usbPorts;

    @Column(name = "form_factor", length = 50)
    private String formFactor;

    @Column(name = "form_factor_RAM", length = 50)
    private String formFactorRAM;

    @Column(name = "pci_version", precision = 3, scale = 1)
    private BigDecimal pciVersion;

    @Column(name = "max_ram_capacity_GB")
    private Integer maxRamCapacityGB;

    @Column(name = "memory_frequency")
    private Integer memoryFrequency;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;
}

