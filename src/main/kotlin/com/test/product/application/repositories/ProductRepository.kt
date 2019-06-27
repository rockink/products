package com.test.product.application.repositories

import com.test.product.application.domain.Product
import org.springframework.data.repository.CrudRepository


interface ProductRepository: CrudRepository<Product, String>