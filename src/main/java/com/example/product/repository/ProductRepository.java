package com.example.product.repository;

import com.example.product.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel,Long> {

    List<ProductModel> findByClient(String type);
    ProductModel findByProductId(Long id);

    @Query("Select p.productName,p.client,p.price from product p GROUP BY client")
    List<ProductModel> groupByClient();

    @Query("Select p.productName,p.client,p.color from product p GROUP BY color")
    List<ProductModel> groupByColor();

    @Query("Select p.productName,p.client,p.size from product p GROUP BY size")
    List<ProductModel> groupBySize();

    @Query("Select p.productName,p.client,p.seller from product p GROUP BY seller")
    List<ProductModel> groupBySeller();

    @Query("Select p.productName,p.client,p.price from product p GROUP BY sku")
    List<ProductModel> groupBySku();
    @Query("Select p.productName,p.client,p.price from product p GROUP BY price")
    List<ProductModel> groupByPrice();
}
