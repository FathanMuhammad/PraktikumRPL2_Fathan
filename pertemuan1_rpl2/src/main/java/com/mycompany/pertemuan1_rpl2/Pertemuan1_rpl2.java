/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan1_rpl2;

import java.util.Scanner;

/**
 *
 * @author Nuhi
 */
public class Pertemuan1_rpl2 {

    public static void main(String[] args) {
        //tahap 1
        
        int a = 5;
        int b = 10;
        int hasil = a + b;

        System.out.println("Hasil akhirnya adalah : " + hasil);

        //tahap 2
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();

        System.out.println("Halo, " + nama);

        // tahap 3
        for (int i = 0; i <= 10; i++) {
            System.out.println("Angka ke-" + i);
        }

        //tahap 4
        int angka = 3;

        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
        } else {
            System.out.println("Angka nol");
        }

        input.close();
    }
}