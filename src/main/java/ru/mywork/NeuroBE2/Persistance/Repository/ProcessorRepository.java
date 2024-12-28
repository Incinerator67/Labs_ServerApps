package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mywork.NeuroBE2.Persistance.Entity.Processor;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProcessorRepository extends JpaRepository<Processor,String> {
    // Получение всех записей
    List<Processor> findAll();

    List<Processor> findAllByPriceLessThan(Double price);


    // Получение всех моделей процессоров
    @Query("SELECT p.model FROM Processor p")
    List<String> findAllModels();

    // Новый метод для точного поиска по модели процессора
    @Query("SELECT p FROM Processor p WHERE p.model = :model")
    List<Processor> findByExactModel(@Param("model") String model);



}
