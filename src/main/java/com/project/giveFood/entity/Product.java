package com.project.giveFood.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @NotBlank
    private String name;

    @NotBlank
    private double price;

    @NotBlank
    private double amount;

    @NotNull
    private UnitOfMeasurement unitOfMeasurement;
}
