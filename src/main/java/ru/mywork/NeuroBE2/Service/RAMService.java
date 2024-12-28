package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.RAM;
import ru.mywork.NeuroBE2.Persistance.Repository.RAMRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RAMService {

    // Внедрение репозитория с помощью @Autowired
    @Autowired
    private RAMRepository ramRepository;

    // Метод для получения всех записей RAM
    public List<RAM> getAllRAM() {
        return ramRepository.findAll();
    }

    // Метод для получения всех моделей RAM
    public List<String> getAllRAMModels() {
        return ramRepository.findAllModels();
    }

    // Метод для получения RAM по точной модели
    public List<RAM> getRAMByExactModel(String model) {
        return ramRepository.findByExactModel(model);
    }

    // Метод для поиска RAM по типу
    public List<RAM> searchRAMByType(String type) {
        return ramRepository.findByType(type);
    }

    // Метод для поиска RAM по объему памяти
    public List<RAM> searchRAMByCapacityGB(Integer capacityGB) {
        return ramRepository.findByCapacityGB(capacityGB);
    }

    // Метод для получения всех RAM, отсортированных по цене
    public List<RAM> getAllRAMOrderByPriceAsc() {
        return ramRepository.findAllOrderByPriceAsc();
    }
}
