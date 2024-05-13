package com.example.palsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // return HTTP responses as JSON
public class PalsController {
    @Autowired
    private PalsService palsService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/pals")
    public ResponseEntity<List<Pals>> getAllPals() {
        return new ResponseEntity<List<Pals>>(palsService.findAllPals(),HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Pals>> getPalsByName(@PathVariable String name) {
        return new ResponseEntity<List<Pals>>(palsService.findPalsByName(name), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/type/{typeName}")
    public ResponseEntity<List<Pals>> getPalsByType(@PathVariable String typeName) {
        return new ResponseEntity<List<Pals>>(palsService.findPalsByType(typeName), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/types/{typeName1}-{typeName2}")
    public ResponseEntity<List<Pals>> getPalsByMultipleTypes(@PathVariable String typeName1, @PathVariable String typeName2) {
        return new ResponseEntity<List<Pals>>(palsService.findPalsByMultipleTypes(typeName1, typeName2), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/suitability/{suitabilityName}")
    public ResponseEntity<List<Pals>> getPalsBySuitability(@PathVariable String suitabilityName) {
        return new ResponseEntity<List<Pals>>(palsService.findsPalsBySuitability(suitabilityName), HttpStatus.OK);
    }
}
