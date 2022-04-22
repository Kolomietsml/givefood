package com.project.giveFood.service;

import com.project.giveFood.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductDTO saveProduct (ProductDTO productDTO);
    void deleteProduct (String nameProduct);
    ProductDTO findProductByName (String nameProduct);
    List<ProductDTO> findAllProduct ();
}
