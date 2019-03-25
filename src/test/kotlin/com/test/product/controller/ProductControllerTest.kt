package com.test.product.controller

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
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


}