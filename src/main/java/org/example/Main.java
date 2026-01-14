package org.example;

import org.example.Controller.ConsoleController;
import org.example.Model.Fine;
import org.example.Model.TrafficEvent;
import org.example.Model.Vehicle;
import org.example.Repository.FineRepository;
import org.example.Repository.IRepository;
import org.example.Repository.TrafficEventRepository;
import org.example.Repository.VehicleRepository;
import org.example.Service.FineService;
import org.example.Service.TrafficEventService;
import org.example.Service.VehicleService;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        IRepository<Vehicle, Integer> vehicleRepository = new VehicleRepository("vehicles.json");
        IRepository<TrafficEvent,Integer> trafficeventRepository = new TrafficEventRepository("events.json");
        IRepository<Fine, Integer> fineRepository = new FineRepository("fines.json");


        VehicleService tributService = new VehicleService(vehicleRepository);
        TrafficEventService trafficeventService = new TrafficEventService(trafficeventRepository);
        FineService fineService = new FineService(fineRepository);

        ConsoleController controller = new ConsoleController (tributService,trafficeventService,fineService);
        controller.start();
        }

    }

