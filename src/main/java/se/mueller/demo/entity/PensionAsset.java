package se.mueller.demo.entity;


import javax.persistence.*;

@Entity
@Table(name="pension")
public class PensionAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nameOfAsset")
    private String nameOfAsset;
    @Column(name="typeOfAsset")
    private String typeOfAsset;
    @Column(name="currentValue")
    private double currentValue;

    public PensionAsset() {
    }

    public PensionAsset(long id, String nameOfAsset, String typeOfAsset, double currentValue) {
        this.id = id;
        this.nameOfAsset = nameOfAsset;
        this.typeOfAsset = typeOfAsset;
        this.currentValue = currentValue;
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

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
}
