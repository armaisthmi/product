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
    public List<ProductModel> getProductsByClient(String client) {
        return productRepository.groupByClient(client);
    }

    @Override
    public List<ProductModel> getProductsByPrice(Integer price) {
        return productRepository.groupByPrice(price);
    }

    @Override
    public List<ProductModel> getProductsByColor(String color) {
        return productRepository.groupByColor(color);
    }

    @Override
    public List<ProductModel> getProductsBySize(Integer size) {
        return productRepository.groupBySize(size);
    }

    @Override
    public List<ProductModel> getProductsBySKU(Integer sku) {
        return productRepository.groupBySku(sku);
    }

    @Override
    public List<ProductModel> getProductsBySeller(String seller) {
        return productRepository.groupBySeller(seller);
    }
}
