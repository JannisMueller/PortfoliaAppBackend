package se.mueller.demo.services;


import se.mueller.demo.entity.Asset;

import java.util.List;

public interface Service {

    List<Asset> getAllAssets();

    Asset addAsset(Asset asset);

}
