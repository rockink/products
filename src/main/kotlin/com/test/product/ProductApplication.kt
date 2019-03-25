package com.test.product

import com.test.product.repositories.DummyProductRepoPolulator
import com.test.product.repositories.ProductRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductApplication(private val productRepository: ProductRepository) : CommandLineRunner{


    override fun run(vararg args: String?) {
        DummyProductRepoPolulator.populate()
                .map{it.value}
                .forEach{
                    productRepository.save(it);
                }

    }

}

fun main(args: Array<String>) {
    runApplication<ProductApplication>(*args)
}
