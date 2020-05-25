package com.example.product.controller;


import com.example.product.model.ProductModel;
import com.example.product.operations.ProductOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/")
public class ProductController {

    @Autowired
    ProductOperations productOperations;

    @GetMapping("productbyclient")
    public ResponseEntity<List<ProductModel>> getByClient(@RequestParam String client){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProducts(client), HttpStatus.OK);
    }

    @GetMapping("productbycolor")
    public List<ProductModel> getByColor(){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsByColor(), HttpStatus.OK).getBody();
    }

    @GetMapping("productbysku")
    public ResponseEntity<List<ProductModel>> getBySKU(){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsBySKU(), HttpStatus.OK);
    }

    @GetMapping("productbysize")
    public ResponseEntity<List<ProductModel>> getBySize(){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsBySize(), HttpStatus.OK);
    }

    @GetMapping("productbyseller")
    public ResponseEntity<List<ProductModel>> getBySeller(){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsBySeller(), HttpStatus.OK);
    }

    @GetMapping("productbyprice")
    public ResponseEntity<List<ProductModel>> getByPrice(@RequestParam Integer price){
        return new ResponseEntity<List<ProductModel>>(productOperations.getProductsByPrice(), HttpStatus.OK);
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
