package com.test.product.controller

import com.test.product.domain.Product
import com.test.product.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val productService: ProductService){

    @GetMapping("/")
    fun getProducts(): ResponseEntity<List<Product>> {
        val list = productService.getProducts();
        return ok(list);
    }

}