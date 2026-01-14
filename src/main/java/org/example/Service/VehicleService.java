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

    //. (0.5 Punkte) Sortierung der Fahrzeuge
    //Sortieren Sie die Liste aller Fahrzeuge wie folgt:
    //● aufsteigend nach ownerCity
    //● bei gleichem ownerCity absteigend nach id
    //Geben Sie die sortierte Liste anschließend auf der
    //Konsole aus. Die Ausgabe erfolgt im gleichen Format wie
    //in Aufgabe 1.
    //. (1 Punkt)  Schreiben in eine Datei
    //Schreiben Sie die in Aufgabe 3 sortierte Liste der
    //Fahrzeuge in die Datei vehicles_sorted.txt. Jeder
    //Fahrzeuge soll in einer eigenen Zeile gespeichert werden,
    //im selben Format wie bei der Konsolenausgabe.

    // public void task3And4SortAndSave() {
    ////        List<Tribut> sorted = repo.findAll().stream()
    ////                .sorted(Comparator.comparing(Tribut::getSkillLevel).reversed()
    ////                        .thenComparing(Tribut::getName))
    ////                .toList();
    ////
    ////        sorted.forEach(System.out::println);
    ////
    ////        try (PrintWriter pw = new PrintWriter(new FileWriter("tributes_sorted.txt"))) {
    ////            for (Tribut t : sorted) pw.println(t);
    ////        } catch (IOException e) { e.printStackTrace(); }
    ////    }
    //

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
