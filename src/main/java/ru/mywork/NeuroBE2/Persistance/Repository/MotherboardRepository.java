package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import ru.mywork.NeuroBE2.Persistance.Entity.Motherboard;

import java.util.List;
import java.util.Optional;

@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard, Long> {

    // Получить все записи
    @Query("SELECT m FROM Motherboard m")
    List<Motherboard> findAll();

    List<Motherboard> findAllByPriceLessThan(Double price);

    // Найти все названия моделей материнских плат
    @Query("SELECT m.model FROM Motherboard m")
    List<String> findAllModels();

    // Найти материнскую плату по модели (точное совпадение)
    @Query("SELECT m FROM Motherboard m WHERE m.model = :model")
    List<Motherboard> findByExactModel(@Param("model") String model);

    // Найти материнскую плату по сокету процессора
    @Query("SELECT m FROM Motherboard m WHERE m.socket = :socket")
    List<Motherboard> findBySocket(@Param("socket") String socket);

    // Найти материнскую плату по чипсету
    @Query("SELECT m FROM Motherboard m WHERE m.chipset = :chipset")
    List<Motherboard> findByChipset(@Param("chipset") String chipset);

    // Найти материнскую плату по максимальному объему памяти
    @Query("SELECT m FROM Motherboard m WHERE m.maxRamCapacityGB = :maxRamCapacityGB")
    List<Motherboard> findByMaxRamCapacityGB(@Param("maxRamCapacityGB") Integer maxRamCapacityGB);

    // Найти все материнские платы, отсортированные по цене (возрастающая)
    @Query("SELECT m FROM Motherboard m ORDER BY m.price ASC")
    List<Motherboard> findAllOrderByPriceAsc();
}
