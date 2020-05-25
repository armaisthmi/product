package com.example.product.operations;

import com.example.product.model.ProductModel;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProductOperationImpl implements ProductOperations {


    @Autowired
    ProductRepository productRepository;


    @Override
    public List<ProductModel> getProducts(String type) {
        List<ProductModel> productList;
        if(type==null){
            return null;
        }
        else{
            productList=productRepository.findByClient(type);
        }
        return productList;
    }

    @Override
    public ProductModel addProduct(ProductModel product) {
        ProductModel addedProduct=productRepository.save(product);
        return addedProduct;
    }

    @Override
    public ProductModel getProduct(Long id) {
        ProductModel productModel=productRepository.findByProductId(id);

        return productModel;
    }

    @Override
    public ProductModel updateProduct(ProductModel product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        ProductModel productModel=productRepository.getOne(id);
        productRepository.delete(productModel);
    }

    @Override
    public List<ProductModel> getProductsByClient() {
        return productRepository.groupByClient();
    }

    @Override
    public List<ProductModel> getProductsByPrice() {
        return productRepository.groupByPrice();
    }

    @Override
    public List<ProductModel> getProductsByColor() {
        return productRepository.groupByColor();
    }

    @Override
    public List<ProductModel> getProductsBySize() {
        return productRepository.groupBySize();
    }

    @Override
    public List<ProductModel> getProductsBySKU() {
        return productRepository.groupBySku();
    }

    @Override
    public List<ProductModel> getProductsBySeller() {
        return productRepository.groupBySeller();
    }
}
