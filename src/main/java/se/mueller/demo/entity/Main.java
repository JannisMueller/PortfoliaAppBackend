package se.mueller.demo.entity;

public class Main {

    public static void main(String[] args) {

        Asset asset = new Asset(1L,"mueller","stock", 23.4,34,5,2);
        KeyMetricAsset keyMetricAsset = new KeyMetricAsset(1l,10.3,30.4);

        System.out.println(keyMetricAsset.getTotalGain());

        System.out.println(asset.getBucket());


    }
}
