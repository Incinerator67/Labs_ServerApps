package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.Video_card;
import ru.mywork.NeuroBE2.Persistance.Repository.VideoCardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VideoCardService {

    @Autowired
    private VideoCardRepository videoCardRepository;

    // Метод для получения всех видеокарт
    public List<Video_card> getAllVideoCards() {
        return videoCardRepository.findAll();
    }

    // Метод для получения всех имен видеокарт
    public List<String> getAllVideoCardModels() {
        return videoCardRepository.findAllModels();
    }

    // Метод для точного поиска видеокарты по имени
    public List<Video_card> getVideoCardByExactModel(String model) {
        return videoCardRepository.findByExactModel(model);
    }
}

