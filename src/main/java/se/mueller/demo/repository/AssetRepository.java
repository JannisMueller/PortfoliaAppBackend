package se.mueller.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.mueller.demo.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset,Long> {
}
