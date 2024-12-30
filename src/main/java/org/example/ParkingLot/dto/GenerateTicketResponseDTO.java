package org.example.ParkingLot.dto;
import org.example.ParkingLot.model.Ticket;

public class GenerateTicketResponseDTO {

    private Ticket ticket;
    public GenerateTicketResponseDTO(Ticket ticket) {
        this.ticket = ticket;
    }

    public GenerateTicketResponseDTO(){}

    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
