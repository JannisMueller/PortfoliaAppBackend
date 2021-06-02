package se.mueller.demo.entity;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        Asset asset = new Asset(1L,"mueller","stock", 23.4,34,5,2);



        System.out.println(asset.getBucket());


    }
}
