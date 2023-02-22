package com.example.evbatterystation.controller;

import com.example.evbatterystation.Model.Station;
import com.example.evbatterystation.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class stationcontol {



    @Autowired
    private StationService stationService;






    @PostMapping("/station")
    public ResponseEntity<Station> saveStationHandler(@RequestBody Station station){

        Station saveStation= stationService.saveStation(station);


        return new ResponseEntity<Station>(saveStation, HttpStatus.CREATED);

    }

    @GetMapping("/station/{station_id}")
    public Station getStationbyid(@PathVariable("station_id") Integer stationid) {

        return stationService.getStationbyid(stationid);

    }




    @DeleteMapping("/staion/{station_id}")
    public Station deleteStationHandler(@PathVariable("station_id") Integer stationid){

        return stationService.deleteStationbyid(stationid);


    }


    @PutMapping("/station")
    public ResponseEntity<Station> updateStationHandler(@RequestBody Station station){

        Station updatedStation= stationService.updateStation(station);

        return new ResponseEntity<Station>(updatedStation,HttpStatus.ACCEPTED);


    }




}
