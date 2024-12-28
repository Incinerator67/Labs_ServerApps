package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mywork.NeuroBE2.Persistance.Entity.*;

import org.springframework.data.domain.Pageable;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface PCBuildRepository extends JpaRepository<Processor, Long> {

    @Query(value = """
    SELECT new ru.mywork.NeuroBE2.Persistance.Entity.PCBuild(
        p.model, m.model, r.model, v.model, ps.model, c.model
    )
    FROM Processor p
    JOIN Motherboard m ON p.socket = m.socket
    JOIN RAM r ON r.frequency <= m.memoryFrequency
    JOIN Video_card v ON m.pciVersion >= v.pciInterface
    JOIN PowerSupply ps ON ps.powerW >= (p.energyConsumption + v.energyConsumption)
    JOIN CoolerSocket cs ON cs.socket = p.socket
    JOIN Cooler c ON cs.cooler.id = c.id
    WHERE (:processorModel IS NULL OR p.model = :processorModel)
      AND (:videoCardModel IS NULL OR v.model = :videoCardModel)
      AND (:ramCapacity IS NULL OR r.capacityGB >= :ramCapacity)
      AND (:budget IS NULL OR (p.price + m.price + r.price + v.price + ps.price + c.price) <= :budget)
    ORDER BY p.model
    """)
    List<PCBuild> findCompatibleComponents(
            @Param("processorModel") String processorModel,
            @Param("videoCardModel") String videoCardModel,
            @Param("ramCapacity") Integer ramCapacity,
            @Param("budget") BigDecimal budget,
            Pageable pageable
    );

}


