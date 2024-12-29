package org.example.ParkingLot.model;

public class Vehicle extends BaseModel {
    private String vehicleNum;
    private VehicleType vehicleType;

    public void setVehicleNum(String vehicleNum) {
            this.vehicleNum = vehicleNum;
    }
    public String getVehicleNum() {
        return vehicleNum;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
