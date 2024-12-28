package ru.mywork.NeuroBE2.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.mywork.NeuroBE2.Persistance.Entity.Video_card;
import ru.mywork.NeuroBE2.Persistance.Entity.Video_card;

import java.util.List;
import java.util.Optional;

public interface VideoCardRepository extends JpaRepository<Video_card, Integer> {

    // Метод для получения всех видеокарт
    List<Video_card> findAll();

    List<Video_card> findAllByPriceLessThan(Double price);

    // Метод для получения всех моделей видеокарт
    @Query("SELECT v.model FROM Video_card v")
    List<String> findAllModels();

    // Метод для точного поиска видеокарты по названию модели
    @Query("SELECT v FROM Video_card v WHERE v.model = :model")
    List<Video_card> findByExactModel(@Param("model") String model);

}
