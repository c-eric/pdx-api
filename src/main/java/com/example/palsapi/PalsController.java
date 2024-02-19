package com.example.palsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // return HTTP responses as JSON
public class PalsController {
    @Autowired
    private PalsService palsService;

    @GetMapping
    public ResponseEntity<List<Pals>> getAllPals() {
        return new ResponseEntity<List<Pals>>(palsService.findAllPals(),HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Pals>> getPalsByName(@PathVariable String name) {
        return new ResponseEntity<List<Pals>>(palsService.findPalsByName(name), HttpStatus.OK);
    }

    @GetMapping("/type/{typeName}")
    public ResponseEntity<List<Pals>> getPalsByType(@PathVariable String typeName) {
        return new ResponseEntity<List<Pals>>(palsService.findPalsByType(typeName), HttpStatus.OK);
    }

    @GetMapping("/suitability/{suitabilityName}")
    public ResponseEntity<List<Pals>> getPalsBySuitability(@PathVariable String suitabilityName) {
        return new ResponseEntity<List<Pals>>(palsService.findsPalsBySuitability(suitabilityName), HttpStatus.OK);
    }
}
