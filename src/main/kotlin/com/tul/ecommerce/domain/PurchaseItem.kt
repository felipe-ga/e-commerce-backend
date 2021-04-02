package com.tul.ecommerce.domain

import java.util.*

class PurchaseItem {
    private var idProduct: UUID = UUID.randomUUID()
    private var quantity: Int = 0
    private var total: Float = 0.0F
    private var status: Int = 0

    fun setIdProduct(idProduct: UUID){
        this.idProduct = idProduct;
    }
    fun getIdProduct():UUID{
        return this.idProduct;
    }

    fun setQuantity(quantity: Int){
        this.quantity = quantity;
    }
    fun getQuantity():Int{
        return this.quantity;
    }
    fun setTotal(total: Float){
        this.total = total;
    }
    fun getTotal():Float{
        return this.total;
    }
    fun setStatus(total: Int){
        this.status = status;
    }
    fun getStatus():Int{
        return this.status;
    }
}