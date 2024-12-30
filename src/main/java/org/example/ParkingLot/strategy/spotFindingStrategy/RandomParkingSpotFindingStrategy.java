package org.example.ParkingLot.strategy.spotFindingStrategy;

import org.example.ParkingLot.exception.ParkingSpotNotAvailable;
import org.example.ParkingLot.model.*;
import org.example.ParkingLot.service.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindingStrategy implements ParkingSpotFindingStrategy{

   ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;


    @Override
    public ParkingSpot findParkingSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        return null;
    }

    public ParkingSpot getAvailableParkingSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingSpotNotAvailable {
        // Iterate of the parking floors of the parking lot
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors())
        {
            // Now iterate on the parking spots on the parking floor of the parkingLot
            // to find out an available one for the vehicle which is looking for an available spot
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots())
            {

                // If a parkingSpot is available and is also of the size of the vehicle. Then we return that parking spot
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                && parkingSpotVehicleTypeMatchingService.matches(parkingSpot.getSpotType(), vehicleType))
                {
                    return parkingSpot;
                }
            }
        }

        throw new ParkingSpotNotAvailable();

    }
}
