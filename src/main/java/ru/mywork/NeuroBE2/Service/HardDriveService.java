package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.HardDrive;
import ru.mywork.NeuroBE2.Persistance.Repository.HardDriveRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class HardDriveService {

    @Autowired
    private HardDriveRepository hardDriveRepository;

    // Получить все накопители
    public List<HardDrive> getAllHardDrives() {
        return hardDriveRepository.findAll();
    }

    // Получить все модели накопителей
    public List<String> getAllHardDriveModels() {
        return hardDriveRepository.findAllModels();
    }

    // Найти накопитель по точной модели
    public List<HardDrive> getHardDriveByExactModel(String model) {
        return hardDriveRepository.findByExactModel(model);
    }

    // Найти накопитель по типу
    public List<HardDrive> getHardDriveByType(String type) {
        return hardDriveRepository.findByType(type);
    }

    // Найти накопитель по интерфейсу подключения
    public List<HardDrive> getHardDriveByInterface(String driveInterface) {
        return hardDriveRepository.findByInterface(driveInterface);
    }

    // Получить все накопители, отсортированные по цене
    public List<HardDrive> getAllHardDrivesOrderByPriceAsc() {
        return hardDriveRepository.findAllOrderByPriceAsc();
    }

    public List<HardDrive> getHardDrivesByFilters(String model, BigDecimal minPrice, BigDecimal maxPrice, Integer capacity, String driveInterface) {
        return hardDriveRepository.findHardDrivesByFilters(
                model == null || model.isEmpty() ? null : model,
                minPrice,
                maxPrice,
                capacity,
                driveInterface
        );
    }

}
