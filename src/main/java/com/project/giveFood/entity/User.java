package com.project.giveFood.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Size (min= 2, max = 16)
    @NotBlank
    private String name;

    @Size(min = 2, max =16)
    @NotBlank
    private String surname;

    @NotBlank
    private String password;

    @Column(length = 10) //дивлячись як будем хранити номер
    private String phoneNumber;

    @NotNull
    private RoleUser roleUser;

    @Email
    private String email;
}
