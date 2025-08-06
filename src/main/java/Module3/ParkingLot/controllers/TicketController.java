package Module3.ParkingLot.controllers;

import Module3.ParkingLot.dtos.IssueTicketRequestDTO;
import Module3.ParkingLot.dtos.IssueTicketResponseDTO;
import Module3.ParkingLot.dtos.ResponseStatus;
import Module3.ParkingLot.models.Ticket;
import Module3.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        // Always have a try catch block becuase you want to handle the errors gracefully
        // You don't want users to see the internal data
        try{
            Ticket ticket = ticketService.issueTicket(
                    request.getLicensePlate(),
                    request.getVehicleType(),
                    request.getOwnerName(),
                    request.getGateId(),
                    request.getParkingLot()
                    );

            response.setTicketId(ticket.getId());
            response.setSlotNUmber(ticket.getParkingSlot().getNumber());
            response.setFloorNumber(ticket.getParkingSlot().getParkingFloor().getNumber());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setMessage("Ticket generated successfully");

        } catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(e.getMessage());

        }
        return response;
    }
}
