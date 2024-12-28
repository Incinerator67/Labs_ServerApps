package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import ru.mywork.NeuroBE2.Persistance.Entity.RAM;

import java.util.List;
import java.util.Optional;

@Repository
public interface RAMRepository extends JpaRepository<RAM, Long> {

    // Получить все записи
    @Query("SELECT r FROM RAM r")
    List<RAM> findAll();

    List<RAM> findAllByPriceLessThan(Double price);

    // Найти все названия моделей RAM
    @Query("SELECT r.model FROM RAM r")
    List<String> findAllModels();

    // Найти RAM по модели (точное совпадение)
    @Query("SELECT r FROM RAM r WHERE r.model = :model")
    List<RAM> findByExactModel(@Param("model") String model);

    // Найти RAM по типу (например, DDR4 или DDR5)
    @Query("SELECT r FROM RAM r WHERE r.type = :type")
    List<RAM> findByType(@Param("type") String type);

    // Найти RAM по объему памяти
    @Query("SELECT r FROM RAM r WHERE r.capacityGB = :capacityGB")
    List<RAM> findByCapacityGB(@Param("capacityGB") Integer capacityGB);

    // Найти все RAM, отсортированные по цене (возрастающая)
    @Query("SELECT r FROM RAM r ORDER BY r.price ASC")
    List<RAM> findAllOrderByPriceAsc();
}
