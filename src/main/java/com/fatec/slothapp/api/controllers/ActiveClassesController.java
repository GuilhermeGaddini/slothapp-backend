package com.fatec.slothapp.api.controllers;

import com.fatec.slothapp.api.models.ActiveClassesModel;
import com.fatec.slothapp.domain.services.ActiveClassesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activeClasses")
public class ActiveClassesController {

    private final ActiveClassesService activeClassesService;

    public ActiveClassesController(ActiveClassesService activeClassesService){
        this.activeClassesService = activeClassesService;
    }

    @GetMapping
    public ResponseEntity<List<ActiveClassesModel>> getAllActiveClasses(){
        try{
            return new ResponseEntity<>(this.activeClassesService.getAllActiveClasses(), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
