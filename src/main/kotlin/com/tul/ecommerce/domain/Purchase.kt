package com.tul.ecommerce.domain

import java.time.LocalDateTime

class Purchase {
    private var idCustomer: Int = 0;
    private var date: LocalDateTime = LocalDateTime.now();
    private var paymentMethod: String = "T";
    private var comment: String = "";
    private var status: Int = 0;
    private var products: List<PurchaseItem> = listOf();

    fun getIdCustomer():Int{
        return this.idCustomer;
    }
    fun setIdCustomer(idCustomer: Int){
        this.idCustomer = idCustomer;
    }

    fun getDate(): LocalDateTime {
        return this.date;
    }
    fun setDate(date: LocalDateTime){
        this.date = date;
    }
    fun getPaymentMethod():String{
        return this.paymentMethod;
    }
    fun setPaymentMethod(paymentMethod: String){
        this.paymentMethod = paymentMethod;
    }
    fun getComment():String{
        return this.comment;
    }
    fun setComment(comment: String){
        this.comment = comment;
    }
    fun getStatus():Int{
        return this.status;
    }
    fun setStatus(comment: Int){
        this.status = status;
    }
    fun getProducts():List<PurchaseItem>{
        return this.products;
    }
    fun setProducts(products: List<PurchaseItem>){
        this.products = products;
    }
}