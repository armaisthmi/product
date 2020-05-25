package com.example.product.operations;

import com.example.product.model.ProductModel;

import java.util.List;

public interface ProductOperations {

    List<ProductModel> getProducts(String Client);
    ProductModel addProduct(ProductModel product);
    ProductModel getProduct(Long id);
    ProductModel updateProduct(ProductModel product);
    void deleteProduct(Long id);
    List<ProductModel> getProductsByClient();
    List<ProductModel> getProductsByPrice();
    List<ProductModel> getProductsByColor();
    List<ProductModel> getProductsBySize();
    List<ProductModel> getProductsBySKU();
    List<ProductModel> getProductsBySeller();
}
