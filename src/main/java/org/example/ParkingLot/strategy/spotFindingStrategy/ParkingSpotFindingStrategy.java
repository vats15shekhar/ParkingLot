package org.example.ParkingLot.strategy.spotFindingStrategy;

import org.example.ParkingLot.model.ParkingLot;
import org.example.ParkingLot.model.ParkingSpot;
import org.example.ParkingLot.model.VehicleType;

public interface ParkingSpotFindingStrategy {
    ParkingSpot findParkingSpot(VehicleType vehicleType, ParkingLot parkingLot);
}
