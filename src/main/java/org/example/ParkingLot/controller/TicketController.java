package org.example.ParkingLot.controller;

import org.example.ParkingLot.dto.ErrorResponseDTO;
import org.example.ParkingLot.dto.GenerateTicketRequestDTO;
import org.example.ParkingLot.dto.GenerateTicketResponseDTO;
import org.example.ParkingLot.dto.ResponseDTO;
import org.example.ParkingLot.exception.ParkingLotNotAvailableException;
import org.example.ParkingLot.exception.ParkingSpotNotAvailable;
import org.example.ParkingLot.model.Ticket;
import org.example.ParkingLot.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDTO getTicket(GenerateTicketRequestDTO generateTicketRequestDTO) {
        try{
            Ticket ticket = new Ticket(generateTicketRequestDTO.getVehicle(), generateTicketRequestDTO.getEntryGate());
            GenerateTicketResponseDTO generateTicketResponseDTO = new GenerateTicketResponseDTO();
            generateTicketResponseDTO.setTicket(ticket);
            return generateTicketResponseDTO;
        }
        catch(ParkingLotNotAvailableException e)
        {

        }
        catch(ParkingSpotNotAvailable e){


        }
    }
}
