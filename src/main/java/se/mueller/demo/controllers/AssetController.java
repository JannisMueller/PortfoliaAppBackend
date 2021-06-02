package se.mueller.demo.controllers;

import org.springframework.web.bind.annotation.*;
import se.mueller.demo.entity.*;
import se.mueller.demo.services.AssetService;

import java.util.List;

@CrossOrigin(origins =
        {"http://localhost:5050/assets", "http://localhost:5050/metrics","http://localhost:5050/pension" })

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

    @GetMapping("/pension")
    List<PensionAsset> findAllPensionAssets() {
        return service.getAllPensionAssets();
    }

    @PostMapping("/pension")
    PensionAsset addPensionAsset(@RequestBody PensionAsset pensionAsset) {
        return service.addPensionAsset(pensionAsset);
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

    @PatchMapping("/pension/{id}")
    PensionAsset updatePensionAsset(@RequestBody UpdatedAssetPension updatedAssetPension, @PathVariable Long id){
        return service.updatePensionAsset(updatedAssetPension, id);
    }


    @DeleteMapping("/assets/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

   @DeleteMapping("/metrics/{id}")
    public void deleteMetrics(@PathVariable Long id){
        service.deleteMetric(id);
    }

    @DeleteMapping("/pension/{id}")
    public void deletePensionAsset(@PathVariable Long id){
        service.deletePensionAsset(id);
    }
}

