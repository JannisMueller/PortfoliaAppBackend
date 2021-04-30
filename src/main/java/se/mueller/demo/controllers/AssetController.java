package se.mueller.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.mueller.demo.entity.Asset;
import se.mueller.demo.repository.AssetRepository;
import se.mueller.demo.services.AssetService;
import se.mueller.demo.services.Service;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5050/assets")

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

    @PostMapping("/assets")
    Asset addAsset(@RequestBody Asset asset) {
        return service.addAsset(asset);
    }
}

