package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.Cooler;
import ru.mywork.NeuroBE2.Persistance.Entity.Motherboard;
import ru.mywork.NeuroBE2.Persistance.Repository.CoolerRepository;

import java.util.List;

@Service
public class CoolerService {

    @Autowired
    private CoolerRepository coolerRepository;

    public List<Cooler> getAllCoolers() {
        return coolerRepository.findAll();
    }

    public List<String> getAllCoolerModels() {
        return coolerRepository.findAllModels();
    }


    public List<Cooler> getCoolerByModel(String model) {
        return coolerRepository.findByModel(model);
    }
}
