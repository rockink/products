package com.test.product.controller

import com.test.product.domain.Product
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController{

    @GetMapping("/")
    fun getProducts(): ResponseEntity<List<Product>> {
        val list = emptyList<Product>();
        return ok(list);
    }

}