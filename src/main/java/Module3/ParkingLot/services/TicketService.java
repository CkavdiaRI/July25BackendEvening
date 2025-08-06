package Module3.ParkingLot.services;

import Module3.ParkingLot.models.*;
import Module3.ParkingLot.repositories.GateRepository;
import Module3.ParkingLot.repositories.ParkingLotRepository;
import Module3.ParkingLot.repositories.VehicleRepository;

import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository
        ) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket issueTicket(
            String licensePlate,
            VehicleType vehicleType,
            String ownerName,
            int gateId,
            int parkingLotId
    ){
        // Talk to database
        // 1. Get gate by gateId
        Optional<Gate> gateOptional = gateRepository.findById(gateId);
        if(gateOptional.isEmpty()) {
            throw new RuntimeException("No such gate exists !!");
        }
        Gate gate = gateOptional.get();

        // 2. Check if the vechicle is already there in the db
        Vehicle vehicle = null;
        Optional<Vehicle> vehicleOptional = vehicleRepository.findByLicensePlate(licensePlate);
        if(vehicleOptional.isEmpty()) {
            // Create a new vehicle object
            vehicle = new Vehicle();
            vehicle.setLicensePlate(licensePlate);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);

            // Save the vehicle to the database
            vehicleRepository.save(vehicle);
        }else{
            vehicle = vehicleOptional.get();
        }

        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findById(parkingLotId);
        if(parkingLotOptional.isEmpty()) {
            throw new RuntimeException("No such parking lot exists !!");
        }
        ParkingLot parkingLot = parkingLotOptional.get();

        // Call allocation strategy
        ParkingSlot parkingSlot = parkingLot.getSlotAllotcationStrategy().allotSlot(parkingLot, vehicle.getVehicleType());

        if(parkingSlot == null) {
            throw new RuntimeException("No slot available for this vehicle type !!");
        }

        // Create a new ticket
        Ticket ticket  = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new java.util.Date());
        ticket.setGate(gate);
        ticket.setParkingSlot(parkingSlot);
        ticket.setOperator(gate.getCurrentOperator());

        // Save the ticket to the database
            // Create ticketRepository
        return ticket;
    }
}
