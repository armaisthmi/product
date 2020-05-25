package com.example.product.controller;


import com.example.product.model.ProductModel;
import com.example.product.operations.ProductOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/v1/api/")
public class ProductController {

    @Autowired
    ProductOperations productOperations;

    @GetMapping("productbytype/{client}")
    public ResponseEntity<List<ProductModel>> getByClient(@RequestParam String client){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsByClient(client), HttpStatus.OK);
    }

    @GetMapping("productbytype/{color}")
    public ResponseEntity<List<ProductModel>> getByColor(@RequestParam String color){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsByColor(color), HttpStatus.OK);
    }

    @GetMapping("productbytype/{sku}")
    public ResponseEntity<List<ProductModel>> getBySKU(@RequestParam Integer sku){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsBySKU(sku), HttpStatus.OK);
    }

    @GetMapping("productbytype/{size}")
    public ResponseEntity<List<ProductModel>> getBySize(@RequestParam Integer size){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsBySize(size), HttpStatus.OK);
    }

    @GetMapping("productbytype/{seller}")
    public ResponseEntity<List<ProductModel>> getBySeller(@RequestParam String seller){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsBySeller(seller), HttpStatus.OK);
    }

    @GetMapping("productbytype/{price}")
    public ResponseEntity<List<ProductModel>> getByPrice(@RequestParam Integer price){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsByPrice(price), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductModel product){
        return new ResponseEntity<ProductModel>(productOperations.addProduct(product),HttpStatus.CREATED);
    }

    @DeleteMapping("product/{id}")
    public void deleteProduct(@RequestParam Long id){
        productOperations.deleteProduct(id);
    }

    @PutMapping
    public ResponseEntity<ProductModel> updateProduct(ProductModel product){
        return new ResponseEntity<ProductModel>(productOperations.updateProduct(product),HttpStatus.ACCEPTED);
    }
}
