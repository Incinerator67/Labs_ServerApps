package ru.mywork.NeuroBE2.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mywork.NeuroBE2.Persistance.Entity.PCBuild;
import ru.mywork.NeuroBE2.Service.PCBuildService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/pc-builds")
public class PCBuildController {
    private final PCBuildService pcBuildService;

    public PCBuildController(PCBuildService pcBuildService) {
        this.pcBuildService = pcBuildService;
    }

    @PostMapping("/compatible")
    public ResponseEntity<List<PCBuild>> getCompatibleBuilds(@RequestBody PCBuildQuery query) {
        List<PCBuild> builds = pcBuildService.getCompatibleBuilds(
                query.getProcessorModel(),
                query.getVideoCardModel(),
                query.getRamCapacity(),
                query.getBudget(),
                query.getLimit()
        );
        return ResponseEntity.ok(builds);
    }

}




