package com.project.giveFood.service.Impl;

import com.project.giveFood.dto.ProductDTO;
import com.project.giveFood.dto.сonverterDTO.ConverterProduct;
import com.project.giveFood.repo.ProductRepo;
import com.project.giveFood.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ConverterProduct converterProduct;

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        return converterProduct.fromProductToProductDTO(productRepo.save(converterProduct.fromProductDTOtoProduct(productDTO)));
    }

    @Override
    public void deleteProduct(String nameProduct) {
        productRepo.deleteById(nameProduct);
    }

    @Override
    public ProductDTO findProductByName(String nameProduct) {
        return converterProduct.fromProductToProductDTO(productRepo.findById(nameProduct).get());
    }

    @Override
    public List<ProductDTO> findAllProduct() {
        return productRepo.findAll().stream().map(converterProduct::fromProductToProductDTO).collect(Collectors.toList());
    }
}
