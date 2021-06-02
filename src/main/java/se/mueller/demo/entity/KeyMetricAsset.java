package se.mueller.demo.entity;



import jdk.jfr.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="KeyMetricAssets")

public class KeyMetricAsset {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "totalGain")
    private double totalGain;
    @Column(name = "totalValue")
    private double totalValue;


    public KeyMetricAsset() {
    }

    public KeyMetricAsset(Long id, double totalGain, double totalValue) {
        this.id = id;
        this.totalGain = totalGain;
        this.totalValue = totalValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotalGain() {
        return totalGain;
    }

    public void setTotalGain(double totalGain) {
        this.totalGain = totalGain;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }


    @Override
    public String toString() {
        return "KeyMetricAsset{" +
                "id=" + id +
                ", totalGain=" + totalGain +
                ", totalValue=" + totalValue +
                '}';
    }
}
