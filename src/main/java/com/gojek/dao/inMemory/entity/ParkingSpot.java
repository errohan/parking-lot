package com.gojek.dao.inMemory.entity;

public class ParkingSpot {
    private Integer parkingId;
    private ParkingSpotStatusEnum parkingSpotStatus = ParkingSpotStatusEnum.EMPTY;
    private ParkingTypeEnum parkingTypeEnum;
    private Integer distanceFromEntry;
    private ParkedVehicle parkedVehicle;

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

    public ParkingSpotStatusEnum getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatusEnum parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public Integer getDistanceFromEntry() {
        return distanceFromEntry;
    }

    public void setDistanceFromEntry(Integer distanceFromEntry) {
        this.distanceFromEntry = distanceFromEntry;
    }

    public ParkedVehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(ParkedVehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public ParkingTypeEnum getParkingTypeEnum() {
        return parkingTypeEnum;
    }

    public void setParkingTypeEnum(ParkingTypeEnum parkingTypeEnum) {
        this.parkingTypeEnum = parkingTypeEnum;
    }
}