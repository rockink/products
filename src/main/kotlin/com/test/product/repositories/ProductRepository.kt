package com.test.product.repositories

import com.test.product.domain.Product
import org.springframework.data.repository.CrudRepository


interface ProductRepository: CrudRepository<Product, String>