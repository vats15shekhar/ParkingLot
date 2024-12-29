package org.example.ParkingLot.repository;

import org.example.ParkingLot.exception.ParkingLotAlreadyExistsException;
import org.example.ParkingLot.exception.ParkingLotNotAvailableException;
import org.example.ParkingLot.model.Gate;
import org.example.ParkingLot.model.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Long, ParkingLot> parkingLotMap;
    private HashMap<Gate, ParkingLot> gateParkingLotMap;
    // ParkingLot1 -> G1, G2, G3
    // ParkingLot2 -> G4, G5, G6
    // G1, ParkingLot1
    // G2, ParkingLot1
    // G3, ParkingLot1
    // G4, ParkingLot2
    // G5, ParkingLot2
    // G6, ParkingLot2

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
        this.gateParkingLotMap = new HashMap<>();
    }

    public ParkingLot save(ParkingLot parkingLot) throws ParkingLotAlreadyExistsException {
        if(parkingLotMap.containsKey(parkingLot.getId())){
            throw new ParkingLotAlreadyExistsException();
        }
        //creating the mapping for gate to parkingLot.
        //Verify that Gate is not a collection type.
        //If Gate is a single object and not a collection (e.g., a List<Gate>),
        //you cannot use forEach on it.
        for(Gate gate : parkingLot.getGates()){
            gateParkingLotMap.put(gate, parkingLot);
        }
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot get(long parkingLotId){
        return parkingLotMap.get(parkingLotId);
    }

    public ParkingLot update(ParkingLot parkingLot){
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot getParkingLotFromGate(Gate gate) throws ParkingLotNotAvailableException {
        if(gateParkingLotMap.containsKey(gate))
            return gateParkingLotMap.get(gate);
        else
            throw new ParkingLotNotAvailableException();
    }
}
