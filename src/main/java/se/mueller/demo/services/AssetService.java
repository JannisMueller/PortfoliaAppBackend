package se.mueller.demo.services;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import se.mueller.demo.entity.Asset;
import se.mueller.demo.entity.KeyMetricAsset;
import se.mueller.demo.entity.UpdatedAsset;
import se.mueller.demo.repository.AssetRepository;
import se.mueller.demo.repository.KetMetricAssetRepository;

import java.util.List;
import java.util.Optional;

@Component
public class AssetService implements Service{

    private final AssetRepository repository;
    private final KetMetricAssetRepository ketMetricAssetRepository;

    public AssetService(AssetRepository repository, KetMetricAssetRepository ketMetricAssetRepository) {
        this.repository = repository;
        this.ketMetricAssetRepository = ketMetricAssetRepository;
    }

    @Override
    public List<Asset> getAllAssets() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "currentValue"));
    }

    @Override
    public Asset addAsset(Asset asset) {

        return repository.save(asset);
    }

    @Override
    public Asset updateAsset(UpdatedAsset updatedAsset, Long id) {
        Optional<Asset> asset = repository.findById(id);
        if (asset.isPresent()) {
            Asset assetThatWillBeUpdated = asset.get();

            assetThatWillBeUpdated.setCurrentValue(updatedAsset.currentValue);
            assetThatWillBeUpdated.setGain(updatedAsset.gain);


            return repository.save(assetThatWillBeUpdated);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Id " + id + " not found.");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteMetric(Long id) {
        ketMetricAssetRepository.deleteById(id);
    }
    @Override
    public List<KeyMetricAsset> getAllMetrics() {
        return ketMetricAssetRepository.findAll();
    }

    @Override
    public KeyMetricAsset addMetric(KeyMetricAsset keyMetricAsset) {
        return ketMetricAssetRepository.save(keyMetricAsset);
    }
}




