package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.HardDrive;
import ru.mywork.NeuroBE2.Service.HardDriveService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/hard-drives")
public class HardDriveController {

    @Autowired
    private HardDriveService hardDriveService;

    // Получить все накопители
    @GetMapping("/all")
    public List<HardDrive> getAllHardDrives() {
        return hardDriveService.getAllHardDrives();
    }

    // Получить все модели накопителей
    @GetMapping("/models")
    public List<String> getAllHardDriveModels() {
        return hardDriveService.getAllHardDriveModels();
    }

    // Найти накопитель по точной модели
    @GetMapping("/model/{model}")
    public List<HardDrive> getHardDriveByExactModel(@PathVariable("model") String model) {
        return hardDriveService.getHardDriveByExactModel(model);
    }

    // Найти накопитель по типу
    @GetMapping("/type/{type}")
    public List<HardDrive> getHardDriveByType(@PathVariable("type") String type) {
        return hardDriveService.getHardDriveByType(type);
    }

    // Найти накопитель по интерфейсу подключения
    @GetMapping("/interface/{interface}")
    public List<HardDrive> getHardDriveByInterface(@PathVariable("interface") String driveInterface) {
        return hardDriveService.getHardDriveByInterface(driveInterface);
    }

    // Получить все накопители, отсортированные по цене
    @GetMapping("/order-by-price")
    public List<HardDrive> getAllHardDrivesOrderByPriceAsc() {
        return hardDriveService.getAllHardDrivesOrderByPriceAsc();
    }

    @GetMapping("/filter")
    public List<HardDrive> filterHardDrives(
            @RequestParam(required = false) String model,
            @RequestParam(required = false) BigDecimal minPrice,
            @RequestParam(required = false) BigDecimal maxPrice,
            @RequestParam(required = false) Integer capacity,
            @RequestParam(required = false) String driveInterface) {
        return hardDriveService.getHardDrivesByFilters(model, minPrice, maxPrice, capacity, driveInterface);
    }
}
