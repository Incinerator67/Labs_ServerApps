package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mywork.NeuroBE2.Persistance.Entity.CoolerSocket;

import java.util.List;

@Repository
public interface CoolerSocketRepository extends JpaRepository<CoolerSocket, Long> {



    // Найти все сокеты по модели кулера
    @Query("SELECT cs FROM CoolerSocket cs WHERE cs.cooler.model = :model")
    List<CoolerSocket> findSocketsByCoolerModel(@Param("model") String model);

}
