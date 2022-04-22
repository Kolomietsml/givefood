package com.project.giveFood.service.Impl;

import com.project.giveFood.dto.UserDTO;
import com.project.giveFood.dto.сonverterDTO.ConverterUser;
import com.project.giveFood.repo.UserRepo;
import com.project.giveFood.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ConverterUser converterUser;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return converterUser.fromUserToUserDto(userRepo.save(converterUser.fromUserDtoToUser(userDTO)));
    }

    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDTO findUserById(long id) {
        return converterUser.fromUserToUserDto(userRepo.findById(id).get());
    }

    @Override
    public List<UserDTO> findAllUsersDTO() {
        return userRepo.findAll().stream().map(converterUser::fromUserToUserDto).collect(Collectors.toList());
    }
}
