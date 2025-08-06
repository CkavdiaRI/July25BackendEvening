package Module3.ParkingLot.dtos;

public class IssueTicketResponseDTO {
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getSlotNUmber() {
        return slotNUmber;
    }

    public void setSlotNUmber(String slotNUmber) {
        this.slotNUmber = slotNUmber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private int ticketId;
    private String slotNUmber;
    private String floorNumber;
    private ResponseStatus responseStatus;
    private String message;
}
