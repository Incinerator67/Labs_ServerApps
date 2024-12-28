package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.PowerSupply;
import ru.mywork.NeuroBE2.Service.PowerSupplyService;

import java.util.List;

@RestController
@RequestMapping("/api/power-supplies")
public class PowerSupplyController {

    @Autowired
    private PowerSupplyService powerSupplyService;

    // Получить все блоки питания
    @GetMapping("/all")
    public List<PowerSupply> getAllPowerSupplies() {
        return powerSupplyService.getAllPowerSupplies();
    }

    // Получить все модели блоков питания
    @GetMapping("/models")
    public List<String> getAllPowerSupplyModels() {
        return powerSupplyService.getAllPowerSupplyModels();
    }

    // Найти блок питания по точной модели
    @GetMapping("/model/{model}")
    public List<PowerSupply> getPowerSupplyByExactModel(@PathVariable("model") String model) {
        return powerSupplyService.getPowerSupplyByExactModel(model);
    }

    // Найти блок питания по мощности
    @GetMapping("/power/{powerW}")
    public List<PowerSupply> getPowerSupplyByPowerW(@PathVariable("powerW") Integer powerW) {
        return powerSupplyService.getPowerSupplyByPowerW(powerW);
    }

    // Получить все блоки питания, отсортированные по цене
    @GetMapping("/order-by-price")
    public List<PowerSupply> getAllPowerSuppliesOrderByPriceAsc() {
        return powerSupplyService.getAllPowerSuppliesOrderByPriceAsc();
    }
}
