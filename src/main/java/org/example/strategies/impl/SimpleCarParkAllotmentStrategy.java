package org.example.strategies;

import org.example.models.ParkingSlot;
import org.example.models.VehicleType;

public class SimpleCarParkAllotmentStrategy implements ParkingPlaceAllotmentStrategy{
    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId) {
        // Get all the floor of this parking lot which are free
        // go through the free floor and then return the free slot.
        return null;
    }
}
