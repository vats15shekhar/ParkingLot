package org.example.ParkingLot.model;

public class Bill extends BaseModel{

    private Ticket ticket;
    private ExitGate exitGate;
    private int billAmount;
    private BillStatus billStatus;
    private Operator operator;
    private String exitTime;
    private Payment payment;

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setExitGate(ExitGate exitGate) {
        this.exitGate = exitGate;
    }
    public ExitGate getExitGate() {
        return exitGate;
    }
    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }
    public int getBillAmount() {
        return billAmount;
    }
    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
    public BillStatus getBillStatus() {
        return billStatus;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public Operator getOperator() {
        return operator;
    }
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }
    public String getExitTime() {
        return exitTime;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Payment getPayment() {
        return payment;
    }
}
