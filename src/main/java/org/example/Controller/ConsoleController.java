package org.example.Controller;

import com.fasterxml.jackson.databind.cfg.EnumFeature;
import org.example.Model.VehicleStatus;
import org.example.Model.VehicleType;
import org.example.Service.FineService;
import org.example.Service.TrafficEventService;
import org.example.Service.VehicleService;

import java.util.Scanner;

public class ConsoleController {
    private final VehicleService vs;
    private final TrafficEventService tes;
    private final FineService fs;
    private final Scanner sc = new Scanner(System.in);

    public ConsoleController(VehicleService vs, TrafficEventService tes, FineService fs) {
        this.vs = vs;
        this.tes = tes;
        this.fs = fs;
    }
    public void start() {
        System.out.println("Tributes loaded: " + vs.getAll().size());
        System.out.println("Events loaded: " + tes.getAll().size());
        System.out.println("Gifts loaded: " + fs.getAll().size());
        vs.getAll().forEach(System.out::println);

        while(true) {
            System.out.println("\nSelect: 2.Filter, 3.SortandFile, 5.points, 6.Ranking, 7.Abschlussbericht, 0.Exit");
            String choice = sc.nextLine();
            switch (choice) {
                case "2" -> {
                    System.out.print("Input : ");
                    String type = sc.nextLine();
                    String status = sc.nextLine();
                    vs.task2_filterByTypeAndStatus(type, status);
                }
                case "3" -> vs.task3And4SortAndSave();
                case "5" -> tes.task5ComputeRisk();
                case "7" -> tes.task7CountEventsByType();
                case "0" -> System.exit(0);
            }

        }

    }

}
