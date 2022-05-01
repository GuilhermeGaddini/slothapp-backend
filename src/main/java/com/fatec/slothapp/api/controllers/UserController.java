package com.fatec.slothapp.api.controllers;

import com.fatec.slothapp.api.models.RoleModel;
import com.fatec.slothapp.api.models.UserModel;
import com.fatec.slothapp.domain.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/get-user")
    public ResponseEntity<UserModel> getUserByUsername(String username){
        try{
            return new ResponseEntity<>(this.userService.getUserByUsername(username), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create-user")
    public ResponseEntity<UserModel> createNewUser(@RequestBody UserModel user){
        try{
            return new ResponseEntity<>(this.userService.createUser(user), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create-role")
    public ResponseEntity<RoleModel> createNewRole(@RequestBody RoleModel role){
        try{
            return new ResponseEntity<>(this.userService.createRole(role), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add-role-to-user")
    public ResponseEntity<?> addRoleToUser(@RequestBody String roleName, @RequestBody String userName){
        try{

            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
