package se.mueller.demo.entity;

public class Main {

    public static void main(String[] args) {

        Asset asset = new Asset(1L,"mueller","stock", 23.4,34,5,"1");

        System.out.println(asset.getBucket());


    }
}
