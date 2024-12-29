package org.example.ParkingLot.model;

public class Ticket extends BaseModel{
    private String EntryTime;
    private Vehicle Vehicle;
    private ParkingFloor parkingFloor;
    private ParkingSpot parkingSpot;
    private ParkingLot parkingLot;
    private Operator operator;

    public void setEntryTime(String EntryTime) {
        this.EntryTime = EntryTime;
    }
    public String getEntryTime() {
        return EntryTime;
    }
    public void setVehicle(Vehicle Vehicle) {
        this.Vehicle = Vehicle;
    }
    public Vehicle getVehicle() {
        return Vehicle;
    }
    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }
     public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
     }
     public ParkingSpot getParkingSpot() {
        return parkingSpot;
     }
     public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
     }
     public ParkingLot getParkingLot() {
        return parkingLot;
     }
     public void setOperator(Operator operator) {
        this.operator = operator;
     }
     public Operator getOperator() {
        return operator;
     }
}
