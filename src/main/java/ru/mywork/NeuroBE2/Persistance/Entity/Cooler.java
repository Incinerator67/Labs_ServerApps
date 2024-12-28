package ru.mywork.NeuroBE2.Persistance.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Cooler")
public class Cooler {

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

    @Column(name = "length", precision = 10, scale = 1)
    private BigDecimal length;

    @Column(name = "width", precision = 10, scale = 1)
    private BigDecimal width;

    @Column(name = "height", precision = 10, scale = 1)
    private BigDecimal height;

    @Column(name = "weight", precision = 10, scale = 1)
    private BigDecimal weight;

    @Column(name = "tdp_rating")
    private Integer tdpRating;

    @Column(name = "fan_size", length = 20)
    private String fanSize;

    @Column(name = "rgb_support", length = 20)
    private String rgbSupport;

    @Column(name = "price", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @OneToMany(mappedBy = "cooler", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CoolerSocket> sockets;
}
