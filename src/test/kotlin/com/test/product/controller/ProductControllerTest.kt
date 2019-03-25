package com.test.product.controller

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ProductControllerTest{

    @Autowired
    lateinit var productController: ProductController


    @Test
    fun getProducts(){
        val products = productController.getProducts();
        assertNotNull("return should not be null ", products);
    }

    @Test
    fun getProuctByKnownId(){
        val product = productController.getProductById("1");
        assertNotNull("product should be found", product.body)
    }

    @Test
    fun productShouldBeFound(){
        val product = productController.getProductById("fakeId");
        assertEquals("product should not be found", product.body, mapOf<Any, Any>())
    }


}