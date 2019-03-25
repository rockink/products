package com.test.product.service

import com.test.product.domain.Product
import org.springframework.stereotype.Service


@Service
class ProductService{

    fun getProducts(): List<Product> {
        return emptyList<Product>()
    }

    fun getProductById(id: Int): Product? {
        return null;
    }

}