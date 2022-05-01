package com.fatec.slothapp.api.controllers;

import com.fatec.slothapp.api.models.UserItemsModel;
import com.fatec.slothapp.domain.services.UserItemsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/userItem")
public class UserItemController {

    private final UserItemsService userItemsService;

    public UserItemController(UserItemsService userItemsService){
        this.userItemsService = userItemsService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserItemsModel> getUserItemsByUserId(@PathVariable BigInteger userId){
        try{
            return new ResponseEntity<>(this.userItemsService.getAllUserItemsByUserId(userId), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
