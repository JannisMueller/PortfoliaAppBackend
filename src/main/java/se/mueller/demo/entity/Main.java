package se.mueller.demo.entity;

public class Main {

    public static void main(String[] args) {
        Asset asset = new Asset(1L,"Handlesbanken fund","Stock",100,200);
        Asset asset1 = new Asset(2L,"Handlesbanken fund2","Stock",100,200);

        System.out.println(asset1.getId());
    }
}
