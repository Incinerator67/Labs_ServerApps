package ru.mywork.NeuroBE2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.mywork.NeuroBE2.Persistance.Entity.*;
import ru.mywork.NeuroBE2.Persistance.Repository.*;

import org.springframework.data.domain.Pageable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PCBuildService {
    private final PCBuildRepository pcBuildRepository;

    public PCBuildService(PCBuildRepository pcBuildRepository) {
        this.pcBuildRepository = pcBuildRepository;
    }

    public List<PCBuild> getCompatibleBuilds(String processorModel, String videoCardModel, Integer ramCapacity, BigDecimal budget, int limit) {
        Pageable pageable =  PageRequest.of(0, limit); // 0 - страница, limit - размер
        return pcBuildRepository.findCompatibleComponents(processorModel, videoCardModel, ramCapacity, budget, pageable);
    }
}



