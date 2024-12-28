package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.PowerSupply;
import ru.mywork.NeuroBE2.Persistance.Repository.PowerSupplyRepository;

import java.util.List;

@Service
public class PowerSupplyService {

    @Autowired
    private PowerSupplyRepository powerSupplyRepository;

    // Получить все блоки питания
    public List<PowerSupply> getAllPowerSupplies() {
        return powerSupplyRepository.findAll();
    }

    // Получить все модели блоков питания
    public List<String> getAllPowerSupplyModels() {
        return powerSupplyRepository.findAllModels();
    }

    // Найти блок питания по точной модели
    public List<PowerSupply> getPowerSupplyByExactModel(String model) {
        return powerSupplyRepository.findByExactModel(model);
    }

    // Найти блок питания по мощности
    public List<PowerSupply> getPowerSupplyByPowerW(Integer powerW) {
        return powerSupplyRepository.findByPowerW(powerW);
    }

    // Получить все блоки питания, отсортированные по цене
    public List<PowerSupply> getAllPowerSuppliesOrderByPriceAsc() {
        return powerSupplyRepository.findAllOrderByPriceAsc();
    }
}
