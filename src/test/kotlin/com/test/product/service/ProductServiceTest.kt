package com.test.product.service

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ProductServiceTest{

    @Autowired lateinit var productService: ProductService

    @Test
    fun allProducts(){
        val products = productService.getProducts();
        assertNotNull("return should not be null ", products);
    }

    @Test
    fun getProductByUnknownId(){
        val product = productService.getProductById(1.toString());
        assertTrue("product Not Found", !product.isPresent);
    }
}