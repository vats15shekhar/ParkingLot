package org.example.ParkingLot.service;

import org.example.ParkingLot.exception.ParkingLotNotAvailableException;
import org.example.ParkingLot.exception.ParkingSpotNotAvailable;
import org.example.ParkingLot.model.*;
import org.example.ParkingLot.repository.ParkingLotRepository;
import org.example.ParkingLot.strategy.spotFindingStrategy.ParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {
    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;
    private ParkingLotRepository parkingLotRepository;

    public TicketService() {
    }

    public TicketService(ParkingLotRepository parkingLotRepository, ParkingSpotFindingStrategy parkingSpotFindingStrategy) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
    }

    public Ticket getTicket(Vehicle vehicle, EntryGate entryGate) throws ParkingLotNotAvailableException, ParkingSpotNotAvailable {
        // as soon as the TicketService is called, we will first check is
        // there is an available spot. If there is an available spot,
        // only then we generate a ticket

        ParkingSpot availableSpot = parkingSpotFindingStrategy.findParkingSpot(vehicle.getVehicleType(), parkingLotRepository.getParkingLotFromGate(entryGate));

        Ticket ticket = new Ticket();
        ticket.setEntryGate(entryGate);
        ticket.setOperator(entryGate.getOperator());
        ticket.setEntryTime(new Date().toString());
        ticket.setParkingSpot(availableSpot);
        ticket.setVehicle(vehicle);
        return ticket;
        //TODO : create ticket repository and save this ticket before returning to user

    }

    //Steps
    // 1. Find available Spot
    // 2. Generate ticket object
    // 3. Add all the details in ticket object
    // 4. Save and return

    /*
    We want our parking lot app to be used across the country.
    In the below code, if the parking spot of a parking lot gets occupied, we update it's status to UNAVAILABLE
    and if the vehicle is leaving the parking lot, we update the status to AVAILABLE again,
    And this update will function for all the parking lots across the country
     */
    public void updateParkingSpotStatus(ParkingLot parkingLot, ParkingSpot parkingSpot) {
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for (ParkingSpot spot : parkingFloor.getParkingSpots()) {

                // Check if the parkingspot that is being passed is same as the parking spot of a parking floor in the parkingLotthat is passed
                // After that check if the status of the parking spot is AVAILABLE.
                // Set it to UNAVAILABLE because the vehicle is now leaving the parking lot.
                // That is why it was set to UNAVAILABLE
                if (spot.equals(parkingSpot)) {
                    if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) {
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.UNAVAILABLE);
                    } else {
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                    }
                }
            }
        }
    }
}

/*
The Service layer will handle all the business logic
 */
