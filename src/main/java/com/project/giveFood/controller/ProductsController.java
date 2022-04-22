package com.project.giveFood.controller;

import com.project.giveFood.dto.ProductDTO;
import com.project.giveFood.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {
    private ProductService productService;

    @PostMapping("/save")
    public ProductDTO saveProduct (ProductDTO productDTO){
        return productService.saveProduct(productDTO);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteProduct (@PathVariable String nameProduct){
        productService.deleteProduct(nameProduct);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/findByName")
    public ProductDTO findByName (@RequestParam String nameProduct){
        return productService.findProductByName(nameProduct);
    }
    @GetMapping("/findAll")
    public List<ProductDTO> findAll(){
        return productService.findAllProduct();
    }
}
