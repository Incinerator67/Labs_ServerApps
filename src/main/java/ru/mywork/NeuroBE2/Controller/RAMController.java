package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.RAM;
import ru.mywork.NeuroBE2.Service.RAMService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ram")
public class RAMController {

    @Autowired
    private RAMService ramService;

    // Получить все записи RAM
    @GetMapping("/all")
    public List<RAM> getAllRAM() {
        return ramService.getAllRAM();
    }

    // Получить все модели RAM
    @GetMapping("/models")
    public List<String> getAllRAMModels() {
        return ramService.getAllRAMModels();
    }

    // Получить RAM по точной модели
    @GetMapping("/model/{model}")
    public List<RAM> getRAMByExactModel(@PathVariable("model") String model) {
        return ramService.getRAMByExactModel(model);
    }

    // Поиск RAM по типу
    @GetMapping("/type/{type}")
    public List<RAM> searchRAMByType(@PathVariable("type") String type) {
        return ramService.searchRAMByType(type);
    }

    // Поиск RAM по объему памяти
    @GetMapping("/capacity/{capacityGB}")
    public List<RAM> searchRAMByCapacityGB(@PathVariable("capacityGB") Integer capacityGB) {
        return ramService.searchRAMByCapacityGB(capacityGB);
    }

    // Получить все RAM, отсортированные по цене
    @GetMapping("/orderByPrice")
    public List<RAM> getAllRAMOrderByPriceAsc() {
        return ramService.getAllRAMOrderByPriceAsc();
    }
}

