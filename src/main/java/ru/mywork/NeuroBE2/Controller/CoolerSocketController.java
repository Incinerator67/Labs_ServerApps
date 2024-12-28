package ru.mywork.NeuroBE2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.CoolerSocket;
import ru.mywork.NeuroBE2.Service.CoolerSocketService;

import java.util.List;

@RestController
@RequestMapping("/api/cooler-sockets")
public class CoolerSocketController {

    @Autowired
    private CoolerSocketService coolerSocketService;

    // Получить сокеты по модели кулера
    @GetMapping("/by-cooler-model/{model}")
    public List<CoolerSocket> getSocketsByCoolerModel(@PathVariable("model") String model) {
        return coolerSocketService.getSocketsByCoolerModel(model);
    }
}
