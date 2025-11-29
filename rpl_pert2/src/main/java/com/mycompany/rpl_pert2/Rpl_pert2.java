/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl_pert2;

/**
 *
 * @author Nuhi
 */
public class Rpl_pert2 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Seller seller = new Seller();
        seller.login();
        seller.addProduct("Nasi Goreng");
        seller.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();
    }
}
