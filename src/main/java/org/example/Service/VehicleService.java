package org.example.Service;

import org.example.Model.Vehicle;
import org.example.Repository.IRepository;

import java.util.*;

public class VehicleService {
    private final IRepository<Vehicle, Integer> repo;

    public VehicleService(IRepository<Vehicle, Integer> repo) { this.repo = repo; }

    public List<Vehicle> getAll() {return repo.findAll();}


    public void task2_filterByTypeAndStatus(String type, String status) {
        repo.findAll().stream()
                .filter(v -> v.getType().toString().equalsIgnoreCase(type))
                .filter(v -> v.getStatus().toString().equalsIgnoreCase(status))
                .forEach(System.out::println);
    }




}
