package org.example.Service;

import org.example.Model.Vehicle;
import org.example.Repository.IRepository;

import java.util.*;

public class VehicleService {
    private final IRepository<Vehicle, Integer> repo;

    public VehicleService(IRepository<Vehicle, Integer> repo) { this.repo = repo; }

    public List<Vehicle> getAll() {return repo.findAll();}



}
