package org.example.Service;

import org.example.Model.Fine;
import org.example.Repository.IRepository;

import java.util.*;

public class FineService {
    private final IRepository<Fine, Integer> repo;

    public FineService(IRepository<Fine, Integer> repo) { this.repo = repo; }

    public List<Fine> getAll() { return repo.findAll(); }

}
