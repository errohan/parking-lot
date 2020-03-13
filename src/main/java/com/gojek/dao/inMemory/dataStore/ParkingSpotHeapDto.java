package com.gojek.dao.inMemory.dataStore;

public class ParkingSpotHeapDto implements Comparable<ParkingSpotHeapDto> {

    private Integer distance;
    private Integer id;

    public ParkingSpotHeapDto(Integer distance, Integer id) {
        this.distance = distance;
        this.id = id;
    }

    public Integer getDistance() {
        return distance;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(ParkingSpotHeapDto o) {
        return this.id.compareTo(o.getDistance());
    }
}