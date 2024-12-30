package org.example.ParkingLot.model;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
    public List<Gate> getGates() {
        return gates;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }
}

