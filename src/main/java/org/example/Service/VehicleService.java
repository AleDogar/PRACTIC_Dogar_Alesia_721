package org.example.Service;

import org.example.Model.Vehicle;
import org.example.Repository.IRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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


    public void task3And4SortAndSave(){
        List<Vehicle> sorted = repo.findAll().stream()
                .sorted(Comparator.comparing(Vehicle::getOwnerCity)
                        .thenComparing(Vehicle::getId).reversed())
                .toList();
        sorted.forEach(System.out::println);

        try (PrintWriter pw = new PrintWriter(new FileWriter("tributes_sorted.txt"))) {
            for (Vehicle v : sorted) pw.println(v);
                 } catch (IOException e) { e.printStackTrace(); }
}
}
