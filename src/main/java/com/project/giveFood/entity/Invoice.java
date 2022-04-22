package com.project.giveFood.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long invoiceNumber;

    @OneToMany
    private List<Product> products;


   /* public double getTotalAmount(List<Product>products){
        return products.stream().map(p -> p.*p.getPrice()).sum();
    }

    */
}
