package se.mueller.demo.services;


import se.mueller.demo.entity.*;

import java.util.List;

public interface Service {


    List<Asset> getAllAssets();

    Asset addAsset(Asset asset);

    Asset updateAsset(UpdatedAsset updatedAsset, Long id);

    void delete (Long id);

    void deleteMetric(Long id);

    List<KeyMetricAsset> getAllMetrics();

    KeyMetricAsset addMetric (KeyMetricAsset keyMetricAsset);

    List <PensionAsset> getAllPensionAssets();

    PensionAsset addPensionAsset (PensionAsset pensionAsset);

    PensionAsset updatePensionAsset (UpdatedAssetPension updatedAssetPension, Long id);

    void deletePensionAsset(Long id);



}
