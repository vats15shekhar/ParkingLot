package org.example.ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    int id;
    String name;
    String address;
    int baseRate;
    List<ParkingFloor> parkingFloors;
    List<ParkingSpot> parkingSpots;
    Map<VehicleType, Integer> vehicleNum = new HashMap<>();

}
