package com.test.product.application.service

import com.test.product.application.domain.Product
import com.test.product.application.repositories.ProductRepository
import com.test.product.cross_cutting.ProductRepositoryMetrics
import com.test.product.cross_cutting.ProductRepositoryMetricsAdvice
import com.test.product.cross_cutting.ProductRepositoryMetricsAdvice.*
import org.springframework.stereotype.Service
import java.util.*


@Service
class ProductService(private val productRepository: ProductRepository){

    @ProductRepositoryMetrics
    fun getProducts(): List<Product> {
        return productRepository.findAll().toList();
    }

    @ProductRepositoryMetrics
    fun getProductById(id: String): Optional<Product> {
        if (!isValidId(id)) return Optional.empty();
        return productRepository.findById(id);
    }

    private fun isValidId(id: String): Boolean {
        try{
            id.toInt();
            return true;
        }catch (exception: Exception){
            return false;
        }
    }

}