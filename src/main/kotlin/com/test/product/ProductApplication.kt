package com.test.product

import com.test.product.application.repositories.DummyProductRepoPolulator
import com.test.product.application.repositories.ProductRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@EnableAspectJAutoProxy
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
