package org.example.Repository;

import org.example.Model.Vehicle;

public class VehicleRepository extends FileRepository<Vehicle, Integer> {

    public VehicleRepository(String filename) {
        super(filename, Vehicle.class);
    }
}