package org.example.Service;

import org.example.Model.TrafficEvent;
import org.example.Repository.IRepository;

import java.util.*;

public class TrafficEventService {
    private final IRepository<TrafficEvent, Integer> repo;

    public TrafficEventService(IRepository<TrafficEvent, Integer> repo) { this.repo = repo; }

    public List<TrafficEvent> getAll() { return repo.findAll(); }
    

}
