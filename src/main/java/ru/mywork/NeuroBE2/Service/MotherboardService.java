package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.Motherboard;
import ru.mywork.NeuroBE2.Persistance.Repository.MotherboardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MotherboardService {

    // Внедрение репозитория с помощью @Autowired
    @Autowired
    private MotherboardRepository motherboardRepository;

    // Метод для получения всех материнских плат
    public List<Motherboard> getAllMotherboards() {
        return motherboardRepository.findAll();
    }

    // Метод для получения всех моделей материнских плат
    public List<String> getAllMotherboardModels() {
        return motherboardRepository.findAllModels();
    }

    // Метод для получения материнской платы по точной модели
    public List<Motherboard> getMotherboardByExactModel(String model) {
        return motherboardRepository.findByExactModel(model);
    }

    // Метод для поиска материнских плат по сокету
    public List<Motherboard> searchMotherboardsBySocket(String socket) {
        return motherboardRepository.findBySocket(socket);
    }

    // Метод для поиска материнских плат по чипсету
    public List<Motherboard> searchMotherboardsByChipset(String chipset) {
        return motherboardRepository.findByChipset(chipset);
    }

    // Метод для поиска материнских плат по максимальному объему памяти
    public List<Motherboard> searchMotherboardsByMaxRamCapacityGB(Integer maxRamCapacityGB) {
        return motherboardRepository.findByMaxRamCapacityGB(maxRamCapacityGB);
    }

    // Метод для получения всех материнских плат, отсортированных по цене
    public List<Motherboard> getAllMotherboardsOrderByPriceAsc() {
        return motherboardRepository.findAllOrderByPriceAsc();
    }
}
