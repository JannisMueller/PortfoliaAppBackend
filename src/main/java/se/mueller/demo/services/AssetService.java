package se.mueller.demo.services;

import org.springframework.stereotype.Component;
import se.mueller.demo.entity.Asset;
import se.mueller.demo.repository.AssetRepository;

import java.util.List;

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
}


