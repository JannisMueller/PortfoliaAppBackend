package se.mueller.demo.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import se.mueller.demo.entity.Asset;
import se.mueller.demo.entity.CurrentValue;
import se.mueller.demo.repository.AssetRepository;

import java.util.List;
import java.util.Optional;

@Component
public class AssetService implements Service{

    private final AssetRepository repository;

    public AssetService(AssetRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Asset> getAllAssets() {
        return repository.findAll();
    }

    @Override
    public Asset addAsset(Asset asset) {
        return repository.save(asset);
    }

    @Override
    public Asset updateAsset(CurrentValue currentValue , Long id) {
        Optional<Asset> asset = repository.findById(id);
        if (asset.isPresent()) {
            Asset assetThatWillBeUpdated = asset.get();

            assetThatWillBeUpdated.setCurrentValue(currentValue.currentValue);

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
}


