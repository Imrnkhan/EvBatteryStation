package com.example.evbatterystation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int station_id;
    private String station_name;
    private String sation_image;
    private int station_price;

    public Station() {

    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getSation_image() {
        return sation_image;
    }

    public void setSation_image(String sation_image) {
        this.sation_image = sation_image;
    }

    public int getStation_price() {
        return station_price;
    }

    public void setStation_price(int station_price) {
        this.station_price = station_price;
    }

    public String getStation_address() {
        return station_address;
    }

    public void setStation_address(String station_address) {
        this.station_address = station_address;
    }

    public Station(int station_id, String station_name, String sation_image, int station_price, String station_address) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.sation_image = sation_image;
        this.station_price = station_price;
        this.station_address = station_address;
    }

    private String station_address;

}
