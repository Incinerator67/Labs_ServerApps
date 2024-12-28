package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.Cooler;
import ru.mywork.NeuroBE2.Service.CoolerService;

import java.util.List;

@RestController
@RequestMapping("/api/coolers")
public class CoolerController {

    @Autowired
    private CoolerService coolerService;

    @GetMapping("/all")
    public List<Cooler> getAllCoolers() {
        return coolerService.getAllCoolers();
    }

    @GetMapping("/models")
    public List<String> getAllCoolerModels() {
        return coolerService.getAllCoolerModels();
    }

    @GetMapping("/model/{model}")
    public List<Cooler> getCoolerByModel(@PathVariable("model") String model) {
        return coolerService.getCoolerByModel(model);
    }
}
