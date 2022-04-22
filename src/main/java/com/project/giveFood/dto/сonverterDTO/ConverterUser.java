package com.project.giveFood.dto.сonverterDTO;

import com.project.giveFood.dto.UserDTO;
import com.project.giveFood.entity.User;
import org.springframework.stereotype.Component;

@Component
public class ConverterUser {
    public User fromUserDtoToUser (UserDTO userDTO){
        return User.builder().
                id(userDTO.getId()).
                name(userDTO.getName()).
                surname(userDTO.getSurname()).
                password(userDTO.getPassword()). // чи потрібно витягати пароль? чи робити розшифровку чи це все робить Security
                phoneNumber(userDTO.getPhoneNumber()).
                email(userDTO.getEmail()).
                build();
    }

    public UserDTO fromUserToUserDto (User user){
        return UserDTO.builder().
                id(user.getId()).
                name(user.getName()).
                surname(user.getSurname()).
                password(user.getPassword()).
                phoneNumber(user.getPhoneNumber()).
                email(user.getEmail()).
                build();
    }
}
