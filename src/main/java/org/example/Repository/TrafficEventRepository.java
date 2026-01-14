package org.example.Repository;

import org.example.Model.TrafficEvent;

public class TrafficEventRepository extends FileRepository<TrafficEvent, Integer> {

    public TrafficEventRepository(String filename) {
        super(filename, TrafficEvent.class);
    }
}