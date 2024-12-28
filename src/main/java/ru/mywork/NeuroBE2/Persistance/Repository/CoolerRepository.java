package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import ru.mywork.NeuroBE2.Persistance.Entity.Cooler;

import java.util.List;

@Repository
public interface CoolerRepository extends JpaRepository<Cooler, Long> {

    @Query("SELECT c FROM Cooler c")
    List<Cooler> findAll();

    List<Cooler> findAllByPriceLessThan(Double price);

    @Query("SELECT c.model FROM Cooler c")
    List<String> findAllModels();


    @Query("SELECT c FROM Cooler c LEFT JOIN FETCH c.sockets WHERE c.model = :model")
    List<Cooler> findByModel(@Param("model") String model);


}
