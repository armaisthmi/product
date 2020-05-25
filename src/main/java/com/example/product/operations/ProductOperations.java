package com.example.product.operations;

import com.example.product.model.ProductModel;

import java.util.List;

public interface ProductOperations {

    List<ProductModel> getProducts(String Client);
    ProductModel addProduct(ProductModel product);
    ProductModel getProduct(Long id);
    ProductModel updateProduct(ProductModel product);
    void deleteProduct(Long id);
    List<ProductModel> getProductsByClient(String client);
    List<ProductModel> getProductsByPrice(Integer price);
    List<ProductModel> getProductsByColor(String color);
    List<ProductModel> getProductsBySize(Integer size);
    List<ProductModel> getProductsBySKU(Integer sku);
    List<ProductModel> getProductsBySeller(String seller);
}
