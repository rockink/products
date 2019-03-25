package com.test.product.domain

data class Product(
        var id: String,
        var name: String,
        var company: String,
        var productType: String,
        val price: Float,
        val sizeInch: Float,
        val screenResolution: String,
        val cpu: String,
        val ram: Int,
        val storage: String,
        val gpu: String,
        val opSys: String
);
