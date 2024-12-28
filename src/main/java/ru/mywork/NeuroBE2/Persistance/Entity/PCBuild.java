package ru.mywork.NeuroBE2.Persistance.Entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;


public class PCBuild {

    private String processorModel;
    private String motherboardModel;
    private String ramModel;
    private String videoCardModel;
    private String powerSupplyModel;
    private String coolerModel;

    public PCBuild(String processorModel, String motherboardModel, String ramModel, String videoCardModel,String powerSupplyModel, String coolerModel) {
        this.processorModel = processorModel;
        this.motherboardModel = motherboardModel;
        this.ramModel = ramModel;
        this.videoCardModel = videoCardModel;
        this.powerSupplyModel = powerSupplyModel;
        this.coolerModel = coolerModel;
    }


    public String getCoolerModel() {return coolerModel;}

    public void setCoolerModel(String coolerModel) {this.coolerModel = coolerModel;}

    public String getPowerSupplyModel() {return powerSupplyModel;}

    public void setPowerSupplyModel(String powerSupplyModel) {this.powerSupplyModel = powerSupplyModel;}

    public String getVideoCardModel() {return videoCardModel;}

    public void setVideoCardModel(String videoCardModel) {this.videoCardModel = videoCardModel;}

    public String getRamModel() {return ramModel;}

    public void setRamModel(String ramModel) {this.ramModel = ramModel;}

    public String getMotherboardModel() {return motherboardModel;}

    public void setMotherboardModel(String motherboardModel) {this.motherboardModel = motherboardModel;}

    public String getProcessorModel() {return processorModel;}

    public void setProcessorModel(String processorModel) {this.processorModel = processorModel;}

}

