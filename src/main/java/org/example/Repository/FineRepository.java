package org.example.Repository;

import org.example.Model.Fine;

public class FineRepository extends FileRepository<Fine, Integer> {

    public FineRepository(String filename) {
        super(filename, Fine.class);
    }
}