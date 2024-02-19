package com.example.palsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PalsService {
    @Autowired
    private PalsRepository palsRepository;

    public List<Pals> findAllPals() {
        return palsRepository.findAll();
    }

    public List<Pals> findPalsByType(String name) {
        return palsRepository.findPalsByTypesName(name);
    }
}
