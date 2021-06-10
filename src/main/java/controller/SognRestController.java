package controller;

import model.Sogn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.SognRepository;


@RestController
public class SognRestController {

    @Autowired
    SognRepository sognRepository;


    @PostMapping(value = "/newSogn", consumes = "application/json")
    public ResponseEntity<Sogn> newSogn(@RequestBody Sogn sogn){
        System.out.println("test");
        sognRepository.save(sogn);
        return new ResponseEntity<>(sogn, HttpStatus.CREATED);
    }

}
