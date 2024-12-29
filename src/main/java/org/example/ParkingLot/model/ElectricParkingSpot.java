package org.example.ParkingLot.model;

public class ElectricParkingSpot extends ParkingSpot{
    private ElectricCharger electricCharger;

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }
    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
