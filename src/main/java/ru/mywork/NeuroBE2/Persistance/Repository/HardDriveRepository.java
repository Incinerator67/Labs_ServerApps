package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mywork.NeuroBE2.Persistance.Entity.HardDrive;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface HardDriveRepository extends JpaRepository<HardDrive, Long> {

    // Получить все записи
    @Query("SELECT h FROM HardDrive h")
    List<HardDrive> findAll();

    // Найти все модели накопителей
    @Query("SELECT h.model FROM HardDrive h")
    List<String> findAllModels();

    // Найти накопитель по точной модели
    @Query("SELECT h FROM HardDrive h WHERE h.model = :model")
    List<HardDrive> findByExactModel(@Param("model") String model);

    // Найти накопитель по типу
    @Query("SELECT h FROM HardDrive h WHERE h.type = :type")
    List<HardDrive> findByType(@Param("type") String type);

    // Найти накопитель по интерфейсу подключения
    @Query("SELECT h FROM HardDrive h WHERE h.driveInterface = :interface")
    List<HardDrive> findByInterface(@Param("interface") String driveInterface);

    // Найти все накопители, отсортированные по цене
    @Query("SELECT h FROM HardDrive h ORDER BY h.price ASC")
    List<HardDrive> findAllOrderByPriceAsc();

    @Query("SELECT h FROM HardDrive h WHERE " +
            "(:model IS NULL OR h.model LIKE %:model%) AND " +
            "(:minPrice IS NULL OR h.price >= :minPrice) AND " +
            "(:maxPrice IS NULL OR h.price <= :maxPrice) AND " +
            "(:capacity IS NULL OR h.capacity = :capacity) AND " +
            "(:driveInterface IS NULL OR h.driveInterface = :driveInterface)")
    List<HardDrive> findHardDrivesByFilters(
            @Param("model") String model,
            @Param("minPrice") BigDecimal minPrice,
            @Param("maxPrice") BigDecimal maxPrice,
            @Param("capacity") Integer capacity,
            @Param("driveInterface") String driveInterface
    );

}
