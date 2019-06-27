package com.test.product.application.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Product(
        @Id var id: String,
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
){

    constructor() : this("","","","",0F,0F,
            "","",0,"","","") {

    }
}
