/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl_pert2;

/**
 *
 * @author Nuhi
 */
public class Seller extends User{
    private String product;
    
    public void addProduct(String productName) {
        System.out.println("Seller Menggunakan produk, " + productName);
        this.product = productName;
    }
}
