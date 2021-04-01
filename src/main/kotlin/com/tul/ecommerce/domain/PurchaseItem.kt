package com.tul.ecommerce.domain

class PurchaseItem {
    private var idProduct: Int = 0
    private var quantity: Int = 0
    private var total: Float = 0.0F
    private var status: Int = 0

    fun setIdProduct(idProduct: Int){
        this.idProduct = idProduct;
    }
    fun getIdProduct():Int{
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