package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.CoolerSocket;
import ru.mywork.NeuroBE2.Persistance.Repository.CoolerSocketRepository;

import java.util.List;

@Service
public class CoolerSocketService {

    @Autowired
    private CoolerSocketRepository coolerSocketRepository;



    // Найти все сокеты по модели кулера
    public List<CoolerSocket> getSocketsByCoolerModel(String model) {
        return coolerSocketRepository.findSocketsByCoolerModel(model);
    }
}
