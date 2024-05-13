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

    public List<Pals> findPalsByName(String name) {
        return palsRepository.findPalsByName(name);
    }

    public List<Pals> findPalsByType(String typeName) {
        return palsRepository.findPalsByTypesName(typeName);
    }

    public List<Pals> findPalsByMultipleTypes(String typeName1, String typeName2) {
        return palsRepository.findPalsByTypesName(typeName1, typeName2);
    }

    public List<Pals> findsPalsBySuitability(String suitabilityName) {
        return palsRepository.findPalsBySuitabilityType(suitabilityName);
    }
}
