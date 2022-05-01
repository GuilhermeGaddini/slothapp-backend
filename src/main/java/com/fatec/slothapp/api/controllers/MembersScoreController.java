package com.fatec.slothapp.api.controllers;

import com.fatec.slothapp.api.models.MembersScoreModel;
import com.fatec.slothapp.domain.services.MembersScoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/membersScore")
public class MembersScoreController {
    private final MembersScoreService membersScoreService;

    public MembersScoreController(MembersScoreService membersScoreService){
        this.membersScoreService = membersScoreService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<MembersScoreModel> getMemberScoreById(@PathVariable BigInteger userId){
        try{
            return new ResponseEntity<>(this.membersScoreService.getMemberScoreByUserId(userId), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
