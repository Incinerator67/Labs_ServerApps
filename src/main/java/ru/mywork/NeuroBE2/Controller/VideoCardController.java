package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.Processor;
import ru.mywork.NeuroBE2.Persistance.Entity.Video_card;
import ru.mywork.NeuroBE2.Service.VideoCardService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/videocards")
public class VideoCardController {

    @Autowired
    private VideoCardService videoCardService;

    // Получить все видеокарты
    @GetMapping("/all")
    public List<Video_card> getAllVideoCards() {
        return videoCardService.getAllVideoCards();
    }

    // Получить все имена видеокарт
    @GetMapping("/models")
    public List<String> getAllVideoCardNames() {
        return videoCardService.getAllVideoCardModels();
    }

    // Маршрут для получения данных процессора по точному названию
    @GetMapping("/model/{model}")
    public List<Video_card> getVideoCardByModel (@PathVariable("model") String model) {
        return videoCardService.getVideoCardByExactModel(model);
    }
}
