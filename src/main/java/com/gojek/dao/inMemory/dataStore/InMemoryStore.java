package com.gojek.dao.inMemory.dataStore;

import com.gojek.dao.inMemory.entity.ParkedVehicle;
import com.gojek.dao.inMemory.entity.ParkingSpot;
import com.gojek.dao.inMemory.entity.ParkingSpotStatusEnum;
import com.gojek.dao.inMemory.entity.ParkingTypeEnum;

import java.util.*;

public class InMemoryStore {
    private static InMemoryStore INSTANCE = null;

    //Entity
    private Map<Integer , ParkingSpot> parkingSpotMap = new HashMap<>();
    private Map<Integer, ParkedVehicle> parkedVehicleMap = new HashMap<>();

    //Index
    private Map<ParkingTypeEnum , Set<Integer>> parkingTypeIndex= new HashMap<>();
    private Map<ParkingSpotStatusEnum , Set<Integer>> parkingSpotStatusIndex = new HashMap<>();
    private Map<ParkingTypeEnum , PriorityQueue<ParkingSpotHeapDto>> emptyParkingSpotIndex = new HashMap<>();

    private InMemoryStore(){

    }

    private void init(){
        for (ParkingTypeEnum value : ParkingTypeEnum.values()) {
            parkingTypeIndex.put(value,new HashSet<>());
            emptyParkingSpotIndex.put(value,new PriorityQueue<>());
        }
        for (ParkingSpotStatusEnum value : ParkingSpotStatusEnum.values()) {
            parkingSpotStatusIndex.put(value,new HashSet<>());
        }

    }

    public synchronized static InMemoryStore getInstance(){
        if(INSTANCE == null)
            INSTANCE = new InMemoryStore();
        return INSTANCE;
    }

    public void registerNewParking(ParkingTypeEnum parkingType , Integer distanceFromEntry){
        int size = parkingSpotMap.size();
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setParkingId(size);
        parkingSpot.setDistanceFromEntry(distanceFromEntry);
        parkingSpot.setParkingTypeEnum(parkingType);
        //putting in entity
        parkingSpotMap.put(size,parkingSpot);
        //indexing
        //indexing in type parking index
        parkingTypeIndex.get(parkingType).add(size);
        //indexing in status
        parkingSpotStatusIndex.get(ParkingSpotStatusEnum.EMPTY).add(size);
        //indexing empty parking in priority queue
        ParkingSpotHeapDto parkingSpotHeapDto = new ParkingSpotHeapDto(distanceFromEntry,size);
        emptyParkingSpotIndex.get(parkingType).add(parkingSpotHeapDto);
    }


}