package se.mueller.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.mueller.demo.entity.PensionAsset;

public interface PensionAssetRepository extends JpaRepository <PensionAsset, Long> {
}
