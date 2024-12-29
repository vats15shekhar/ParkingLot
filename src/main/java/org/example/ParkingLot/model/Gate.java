package org.example.ParkingLot.model;

public class Gate extends BaseModel{
    private int gateNumber;
    private GateType gateType;
    private Operator operator;

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }
    public int getGateNumber() {
        return gateNumber;
    }
    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
    public GateType getGateType() {
        return gateType;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public Operator getOperator() {
        return operator;
    }
}
