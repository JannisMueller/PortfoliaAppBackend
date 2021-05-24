package se.mueller.demo.services;


import se.mueller.demo.entity.Asset;
import se.mueller.demo.entity.UpdatedAsset;

import java.util.List;

public interface Service {


    List<Asset> getAllAssets();

    Asset addAsset(Asset asset);

    Asset updateAsset(UpdatedAsset updatedAsset, Long id);

    void delete (Long id);

}
