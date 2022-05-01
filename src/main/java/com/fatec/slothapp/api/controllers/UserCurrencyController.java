package com.fatec.slothapp.api.controllers;

import com.fatec.slothapp.api.models.UserCurrencyModel;
import com.fatec.slothapp.domain.services.UserCurrencyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/userCurrency")
public class UserCurrencyController {

    private final UserCurrencyService userCurrencyService;

    public UserCurrencyController(UserCurrencyService userCurrencyService){
        this.userCurrencyService = userCurrencyService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserCurrencyModel> getUserCurrencyByUserId(@PathVariable BigInteger userId){
        try{
            return new ResponseEntity<>(this.userCurrencyService.getUserCurrencyByUserId(userId), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
