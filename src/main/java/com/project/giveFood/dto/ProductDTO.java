package com.project.giveFood.dto;

import com.project.giveFood.entity.UnitOfMeasurement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String name;
    private double price;
    private double amount;
    private UnitOfMeasurement unitOfMeasurement;
}
