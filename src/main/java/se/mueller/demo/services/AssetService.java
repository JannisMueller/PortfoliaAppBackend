package se.mueller.demo.services;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import se.mueller.demo.entity.*;
import se.mueller.demo.repository.AssetRepository;
import se.mueller.demo.repository.KetMetricAssetRepository;
import se.mueller.demo.repository.PensionAssetRepository;

import java.util.List;
import java.util.Optional;

@Component
public class AssetService implements Service{

    private final AssetRepository repository;
    private final KetMetricAssetRepository ketMetricAssetRepository;
    private final PensionAssetRepository pensionAssetRepository;

    public AssetService(AssetRepository repository, KetMetricAssetRepository ketMetricAssetRepository, PensionAssetRepository pensionAssetRepository) {
        this.repository = repository;
        this.ketMetricAssetRepository = ketMetricAssetRepository;
        this.pensionAssetRepository = pensionAssetRepository;
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

    @Override
    public List<PensionAsset> getAllPensionAssets() {
        return pensionAssetRepository.findAll(Sort.by(Sort.Direction.DESC, "currentValue"));
    }

    @Override
    public PensionAsset addPensionAsset(PensionAsset pensionAsset) {
        return pensionAssetRepository.save(pensionAsset);
    }

    @Override
    public PensionAsset updatePensionAsset(UpdatedAssetPension updatedAssetPension, Long id) {
        Optional<PensionAsset> pensionAsset = pensionAssetRepository.findById(id);
        if (pensionAsset.isPresent()) {
            PensionAsset assetThatWillBeUpdated = pensionAsset.get();

            assetThatWillBeUpdated.setCurrentValue(updatedAssetPension.currentValue);


            return pensionAssetRepository.save(assetThatWillBeUpdated);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Id " + id + " not found.");
        }
    }

    @Override
    public void deletePensionAsset(Long id) {
        pensionAssetRepository.deleteById(id);

    }
}



