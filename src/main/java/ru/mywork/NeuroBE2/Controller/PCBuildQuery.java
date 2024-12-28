package ru.mywork.NeuroBE2.Controller;

import java.math.BigDecimal;

public class PCBuildQuery {
    private String processorModel;
    private String videoCardModel;
    private Integer ramCapacity;
    private BigDecimal budget;
    private int limit;

    // Геттеры и сеттеры

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getVideoCardModel() {
        return videoCardModel;
    }

    public void setVideoCardModel(String videoCardModel) {
        this.videoCardModel = videoCardModel;
    }

    public Integer getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(Integer ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

