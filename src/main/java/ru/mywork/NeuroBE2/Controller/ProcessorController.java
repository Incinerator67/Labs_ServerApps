package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.Processor;
import ru.mywork.NeuroBE2.Service.ProcessorService;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*") // Разрешает запросы с любого источника
@RestController
@RequestMapping("/api/processors")
public class ProcessorController {

    // Внедрение сервиса с помощью @Autowired
    @Autowired
    private ProcessorService processorService;

    // Получить все процессоры
    @GetMapping("/all")
    public List<Processor> getAllProcessors() {
        return processorService.getAllProcessors();
    }

    // Получить все имена процессоров (Nname)
    @GetMapping("/models")
    public List<String> getAllProcessorModels() {
        return processorService.getAllProcessorModels();
    }

    // Маршрут для получения данных процессора по точному названию
    @GetMapping("/model/{model}")
    public List<Processor> getProcessorByModel(@PathVariable("model") String model) {
        return processorService.getProcessorByExactModel(model);
    }

}
