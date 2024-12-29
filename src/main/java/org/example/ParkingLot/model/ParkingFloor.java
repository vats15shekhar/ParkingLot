package org.example.ParkingLot.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseModel {

    private List<ParkingSpot> parkingSpots;
    private int floorNo;

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public List<ParkingSpot> getParkingSpots() {
       return parkingSpots;
    }
    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
    public int getFloorNo() {
        return floorNo;
    }
}
