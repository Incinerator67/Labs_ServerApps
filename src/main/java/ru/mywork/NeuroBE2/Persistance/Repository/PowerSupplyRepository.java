package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mywork.NeuroBE2.Persistance.Entity.PowerSupply;

import java.util.List;

@Repository
public interface PowerSupplyRepository extends JpaRepository<PowerSupply, Long> {

    // Получить все записи
    @Query("SELECT p FROM PowerSupply p")
    List<PowerSupply> findAll();

    List<PowerSupply> findAllByPriceLessThan(Double price);

    // Найти все модели блоков питания
    @Query("SELECT p.model FROM PowerSupply p")
    List<String> findAllModels();

    // Найти блок питания по точной модели
    @Query("SELECT p FROM PowerSupply p WHERE p.model = :model")
    List<PowerSupply> findByExactModel(@Param("model") String model);

    // Найти блок питания по мощности
    @Query("SELECT p FROM PowerSupply p WHERE p.powerW = :powerW")
    List<PowerSupply> findByPowerW(@Param("powerW") Integer powerW);

    // Найти все блоки питания, отсортированные по цене
    @Query("SELECT p FROM PowerSupply p ORDER BY p.price ASC")
    List<PowerSupply> findAllOrderByPriceAsc();
}
