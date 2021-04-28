package se.mueller.demo.dto;

public class AssetDto {

    private long id;

    private String nameOfAsset;
    private String typeOfAsset;
    private double initialValue;
    private double currentValue;
    private double gain;

    public AssetDto(long id, String nameOfAsset, String typeOfAsset, double initialValue, double currentValue, double gain) {
        this.id = id;
        this.nameOfAsset = nameOfAsset;
        this.typeOfAsset = typeOfAsset;
        this.initialValue = initialValue;
        this.currentValue = currentValue;
        this.gain = gain;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfAsset() {
        return nameOfAsset;
    }

    public void setNameOfAsset(String nameOfAsset) {
        this.nameOfAsset = nameOfAsset;
    }

    public String getTypeOfAsset() {
        return typeOfAsset;
    }

    public void setTypeOfAsset(String typeOfAsset) {
        this.typeOfAsset = typeOfAsset;
    }

    public double getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(double initialValue) {
        this.initialValue = initialValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }
}
