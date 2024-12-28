package ru.mywork.NeuroBE2.Persistance.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
    @Table(name = "coolersockets")
public class CoolerSocket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cooler_id", nullable = false)
    @JsonBackReference
    private Cooler cooler;

    @Column(name = "socket", length = 20, nullable = false)
    private String socket;
}
