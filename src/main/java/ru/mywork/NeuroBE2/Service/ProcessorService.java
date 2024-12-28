package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.Processor;
import ru.mywork.NeuroBE2.Persistance.Repository.ProcessorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProcessorService {

    // Внедрение репозитория с помощью @Autowired
    @Autowired
    private ProcessorRepository processorRepository;

    // Метод для получения всех процессоров
    public List<Processor> getAllProcessors() {
        return processorRepository.findAll();
    }

    // Метод для получения всех имен процессоров (Nname)
    public List<String> getAllProcessorModels() {
        return processorRepository.findAllModels();
    }

    // Метод для получения данных процессора по точному имени
    public List<Processor> getProcessorByExactModel(String model) {
        return processorRepository.findByExactModel(model);
    }


}

