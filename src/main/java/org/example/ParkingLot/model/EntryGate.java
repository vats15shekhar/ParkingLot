package org.example.ParkingLot.model;

public class EntryGate extends Gate{
    private DisplayBoard displayBoard;

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }

   public DisplayBoard getDisplayBoard() {
        return displayBoard;
   }
}
