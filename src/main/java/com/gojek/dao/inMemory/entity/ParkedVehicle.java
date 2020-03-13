package com.gojek.dao.inMemory.entity;

import java.util.Date;

public class ParkedVehicle {
    private Integer id;
    private String registrationNumber;
    private String make;
    private String model;
    private String contact;
    private ParkingVehicleType parkingVehicleType;
    private Date entryTimeStamp = new Date();
    private Date exitTimeStamp;
    private Integer parkingSpot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ParkingVehicleType getParkingVehicleType() {
        return parkingVehicleType;
    }

    public void setParkingVehicleType(ParkingVehicleType parkingVehicleType) {
        this.parkingVehicleType = parkingVehicleType;
    }

    public Date getEntryTimeStamp() {
        return entryTimeStamp;
    }

    public void setEntryTimeStamp(Date entryTimeStamp) {
        this.entryTimeStamp = entryTimeStamp;
    }

    public Date getExitTimeStamp() {
        return exitTimeStamp;
    }

    public void setExitTimeStamp(Date exitTimeStamp) {
        this.exitTimeStamp = exitTimeStamp;
    }

    public Integer getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(Integer parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}