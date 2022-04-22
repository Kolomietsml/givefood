package com.project.giveFood.dto;

import com.project.giveFood.entity.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private long id;
    private String name;
    private String surname;
    private String password;
    private String phoneNumber;
    private RoleUser roleUser;
    private String email;
}
