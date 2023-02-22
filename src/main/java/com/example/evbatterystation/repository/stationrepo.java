package com.example.evbatterystation.repository;

import com.example.evbatterystation.Model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface stationrepo  extends JpaRepository<Station,Integer> {
}

