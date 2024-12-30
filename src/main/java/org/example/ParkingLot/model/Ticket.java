package org.example.ParkingLot.model;

public class Ticket extends BaseModel{
    private String EntryTime;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;
    private ParkingSpot parkingSpot;
    private ParkingLot parkingLot;
    private Operator operator;
    private EntryGate entryGate;

    public Ticket(Vehicle vehicle, EntryGate entryGate) {
        this.vehicle = vehicle;
        this.entryGate = entryGate;
    }
    public Ticket()
    {}

    public void setEntryTime(String EntryTime) {
        this.EntryTime = EntryTime;
    }
    public String getEntryTime() {
        return EntryTime;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
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
     public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
     }
     public EntryGate getEntryGate() {
        return entryGate;
     }
}
