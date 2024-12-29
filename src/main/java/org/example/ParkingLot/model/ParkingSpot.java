package org.example.ParkingLot.model;

public class ParkingSpot extends BaseModel{
    private int spotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private SpotType spotType;
    private Vehicle vehicle;

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
