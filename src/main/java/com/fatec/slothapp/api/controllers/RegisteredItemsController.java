package com.fatec.slothapp.api.controllers;

import com.fatec.slothapp.api.models.RegisteredItemsModel;
import com.fatec.slothapp.domain.services.RegisteredItemsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/registeredItems")
public class RegisteredItemsController {

    private final RegisteredItemsService registeredItemsService;

    public RegisteredItemsController(RegisteredItemsService registeredItemsService){
        this.registeredItemsService = registeredItemsService;
    }

    @GetMapping
    public ResponseEntity<List<RegisteredItemsModel>> getAllRegisteredItems(){
        try{
            return new ResponseEntity<>(this.registeredItemsService.getAllRegisteredItems(), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
