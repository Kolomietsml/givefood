package com.project.giveFood.dto.сonverterDTO;

import com.project.giveFood.dto.ProductDTO;
import com.project.giveFood.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ConverterProduct {
   public Product fromProductDTOtoProduct (ProductDTO productDTO){
        return Product.builder().
                name(productDTO.getName()).
                price(productDTO.getPrice()).
                amount(productDTO.getAmount()).
                unitOfMeasurement(productDTO.getUnitOfMeasurement()).
                build();
    }

    public ProductDTO fromProductToProductDTO (Product product){
        return ProductDTO.builder().
                name(product.getName()).
                price(product.getPrice()).
                amount(product.getAmount()).
                unitOfMeasurement(product.getUnitOfMeasurement()).
                build();
    }
}
