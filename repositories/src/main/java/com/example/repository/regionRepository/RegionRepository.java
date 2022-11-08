package com.example.repository.regionRepository;

import com.example.entiry.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface RegionRepository extends JpaRepository<Regions, Long> {
}
