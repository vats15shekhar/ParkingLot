package org.example.ParkingLot.service;

import org.example.ParkingLot.model.SpotType;
import org.example.ParkingLot.model.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {
    public boolean matches(SpotType spotType, VehicleType vehicleType){
        //TODO : read about switch case added in java 14
        return switch (spotType) {
            case LARGE ->  vehicleType.equals(VehicleType.LARGE);
            case MEDIUM -> vehicleType.equals(VehicleType.MEDIUM);
            case SMALL -> vehicleType.equals(VehicleType.SMALL);
            case ELECTRIC ->  vehicleType.equals(VehicleType.ELECTRIC);
        };
    }
}
