package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.Motherboard;
import ru.mywork.NeuroBE2.Service.MotherboardService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/motherboards")
public class MotherboardController {

    @Autowired
    private MotherboardService motherboardService;

    // Получить все материнские платы
    @GetMapping("/all")
    public List<Motherboard> getAllMotherboards() {
        return motherboardService.getAllMotherboards();
    }

    // Получить все модели материнских плат
    @GetMapping("/models")
    public List<String> getAllMotherboardModels() {
        return motherboardService.getAllMotherboardModels();
    }

    // Получить материнскую плату по точной модели
    @GetMapping("/model/{model}")
    public List<Motherboard> getMotherboardByExactModel(@PathVariable("model") String model) {
        return motherboardService.getMotherboardByExactModel(model);
    }

    // Поиск материнских плат по сокету
    @GetMapping("/socket/{socket}")
    public List<Motherboard> searchMotherboardsBySocket(@PathVariable("socket") String socket) {
        return motherboardService.searchMotherboardsBySocket(socket);
    }

    // Поиск материнских плат по чипсету
    @GetMapping("/chipset/{chipset}")
    public List<Motherboard> searchMotherboardsByChipset(@PathVariable("chipset") String chipset) {
        return motherboardService.searchMotherboardsByChipset(chipset);
    }

    // Поиск материнских плат по максимальному объему памяти
    @GetMapping("/maxRamCapacity/{maxRamCapacityGB}")
    public List<Motherboard> searchMotherboardsByMaxRamCapacityGB(@PathVariable("maxRamCapacityGB") Integer maxRamCapacityGB) {
        return motherboardService.searchMotherboardsByMaxRamCapacityGB(maxRamCapacityGB);
    }

    // Получить все материнские платы, отсортированные по цене
    @GetMapping("/orderByPrice")
    public List<Motherboard> getAllMotherboardsOrderByPriceAsc() {
        return motherboardService.getAllMotherboardsOrderByPriceAsc();
    }



}
