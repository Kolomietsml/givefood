package com.project.giveFood.service;

import com.project.giveFood.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDTO saveUser (UserDTO userDTO);
    void deleteUser (long id);
    UserDTO findUserById (long id);
    List<UserDTO> findAllUsersDTO ();
}
