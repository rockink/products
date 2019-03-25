package com.test.product.controller

import com.test.product.domain.Product
import com.test.product.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ProductController(private val productService: ProductService){

    @GetMapping("/")
    fun getProducts(): ResponseEntity<List<Product>> {
        val list = productService.getProducts();
        return ok(list);
    }

    @GetMapping("/{productId}")
    fun getProductById(@PathVariable("productId") productId: String): ResponseEntity<Product> {
        val product = (productService.getProductById(productId));
        if(product.isPresent) return ok(product.get())
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

}