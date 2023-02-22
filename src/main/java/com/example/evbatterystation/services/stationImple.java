package com.example.evbatterystation.services;

import com.example.evbatterystation.Model.Station;
import com.example.evbatterystation.exceptionhandle.stationException;
import com.example.evbatterystation.repository.stationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class stationImple implements StationService{





    @Autowired
    private stationrepo stationrepo;



    @Override
    public Station saveStation(Station station) {
        return stationrepo.save(station);
    }

    @Override
    public Station getStationbyid(Integer station_id) {
        Optional<Station> opt = stationrepo.findById(station_id);
        if(opt.isPresent()){
            Station station = opt.get();
            return station;
        }
        else
            throw new stationException("does not find and dont exixt");
    }

//    @Override
//    public List<Station> getAllStudents() {
//        return null;
//    }

    @Override
    public Station deleteStationbyid(Integer station_id) {

        Station existstation = stationrepo.findById(station_id).orElseThrow(()->new RuntimeException("station is does not exit"+station_id));
        stationrepo.delete(existstation);
        return existstation;
    }

    @Override
    public Station updateStation(Station station) {
        Optional<Station> opt = stationrepo.findById(station.getStation_id());

        if(opt.isPresent()){
            Station existstaion = opt.get();
            return stationrepo.save(station);
        }
        else
            throw new stationException("invalid station datalis");
    }

//    @Override
//    public Station updatestation(Integer station_id, Integer station_idupdated) {
//        Optional<Station> opt = stationrepo.findById(station_id);
//        if(opt.isPresent()){
//            Station existstation = opt.get();
//            existstation.getStation_id(existstation.getStation_id()+station_idupdated);
//            return stationrepo.save(existstation);
//        }
//        else
//            throw new RuntimeException("station does not exist this id"+station_id);
//    }
}
