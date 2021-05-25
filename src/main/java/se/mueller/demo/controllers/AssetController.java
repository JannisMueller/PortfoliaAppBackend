package se.mueller.demo.controllers;

import org.springframework.web.bind.annotation.*;
import se.mueller.demo.entity.Asset;
import se.mueller.demo.entity.KeyMetricAsset;
import se.mueller.demo.entity.UpdatedAsset;
import se.mueller.demo.services.AssetService;

import java.util.List;

@CrossOrigin(origins =
        {"http://localhost:5050/assets", "http://localhost:5050/metrics"})

@RestController

public class AssetController {

    private AssetService service;

    public AssetController(AssetService service) {
        this.service = service;
    }

    @GetMapping("/assets")
    List<Asset> findAll() {
        return service.getAllAssets();
    }
    @GetMapping("/metrics")
    List<KeyMetricAsset> findAllMetrics() {
        return service.getAllMetrics();
    }
    @PostMapping("/metrics")
    KeyMetricAsset addMetric(@RequestBody KeyMetricAsset keyMetricAsset) {
        return service.addMetric(keyMetricAsset);
    }

    @PostMapping("/assets")
    Asset addAsset(@RequestBody Asset asset) {
        return service.addAsset(asset);
    }
    @PatchMapping("/assets/{id}")
    Asset updateAsset(@RequestBody UpdatedAsset updatedAsset, @PathVariable Long id){

        return service.updateAsset(updatedAsset, id);
    }

    @DeleteMapping("/assets/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}

