package se.mueller.demo.entity;


import javax.persistence.*;

@Entity
@Table(name="portfolio")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nameOfAsset")
    private String nameOfAsset;
    @Column(name="typeOfAsset")
    private String typeOfAsset;
    @Column(name="initialValue")
    private double initialValue;
    @Column(name="currentValue")
    private double currentValue;
    @Column(name="gain")
    private double gain;
    @Column(name="bucket")
    private String bucket;

    public Asset(long id, String nameOfAsset, String typeOfAsset, double initialValue, double currentValue, double gain, String bucket) {
        this.id = id;
        this.nameOfAsset = nameOfAsset;
        this.typeOfAsset = typeOfAsset;
        this.initialValue = initialValue;
        this.currentValue = currentValue;
        this.gain = gain;
        this.bucket = bucket;
    }

    public Asset() {

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

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", nameOfAsset='" + nameOfAsset + '\'' +
                ", typeOfAsset='" + typeOfAsset + '\'' +
                ", initialValue=" + initialValue +
                ", currentValue=" + currentValue +
                ", gain=" + gain +
                ", bucket='" + bucket + '\'' +
                '}';
    }
}
