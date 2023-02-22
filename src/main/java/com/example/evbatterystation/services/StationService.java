package com.example.evbatterystation.services;

import com.example.evbatterystation.Model.Station;

import java.util.List;

public interface StationService {
    public Station saveStation(Station station);

    public Station getStationbyid(Integer station_id);

//    public List<Station> getAllStudents();

    public Station deleteStationbyid(Integer station_id);

    public Station updateStation(Station station);

//    public Station updatestation(Integer station_id, Integer station_idupdated);

}

//         A GET request to the base URL should list all the charging stations in the city.
//
//        A GET request to /show/:id should respond to single charging station details.
//
//        A POST request to / should add charging station details to the database.
//
//        A PUT request to /:id/edit, changes the appropriate details in the database.
//
//        A DELETE request to /delete/:id should delete that particular charging station from the database.