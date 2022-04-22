package com.project.giveFood.controller;


import com.project.giveFood.dto.UserDTO;
import com.project.giveFood.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {
    private final UserService userService;

    @PostMapping("/save")
    public UserDTO saveUser (UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete (@PathVariable long id){
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findByID")
    public UserDTO findByID (@RequestParam long id){
        return userService.findUserById(id);
    }

    @GetMapping("/findAll")
    public List<UserDTO> findAll (){
        return userService.findAllUsersDTO();
    }
}
