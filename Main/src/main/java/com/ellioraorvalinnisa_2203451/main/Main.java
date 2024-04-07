/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ellioraorvalinnisa_2203451.main;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Main {

    public static void main(String[] args) {
    /* inisialisasi objek segitiga 1 */
        LimasSegiEmpat limasSegiempat1 = new LimasSegiEmpat();
        System.out.println("Limas segi empat dengan luas alas :  " + limasSegiempat1.luasAlas + " luas selubung limas :  " + limasSegiempat1.luasSelubungLimas + " dan tinggi : " + limasSegiempat1.tinggi + ". Luasnya :  " + limasSegiempat1.getLuas()+ ", sedangkan volumenya : " +limasSegiempat1.getVolume());
    
        /* inisialisasi objek segitiga 2 */
        LimasSegiEmpat limasSegiempat2 = new LimasSegiEmpat(30,40,50);
        System.out.println("Limas segi empat dengan luas alas :  " + limasSegiempat2.luasAlas + " luas selubung limas :  " + limasSegiempat2.luasSelubungLimas + " dan tinggi : " + limasSegiempat2.tinggi + ". Luasnya : " + limasSegiempat2.getLuas()+ ", sedangkan volumenya : " +limasSegiempat2.getVolume());
    
    
        /* inisialisasi objek segitiga 3 */
        LimasSegiEmpat limasSegiempat3 = new LimasSegiEmpat();
        /* modifikasi nilai atribut ke atributnya langsung */
        //segitiga3.alas = 20;
        //segitiga3.tinggi = 30;
        //segitiga3.sisi = 60;
        /* modifikasi nilai atribut melalui method setAlas, setTinggi, dan setSisi*/
        limasSegiempat3.setLuasAlas(25);
        limasSegiempat3.setLuasSelubung(35);
        limasSegiempat3.setTinggi(45);
        System.out.println("Limas segi empat dengan luas alas :  " + limasSegiempat3.luasAlas + " luas selubung limas :  " + limasSegiempat3.luasSelubungLimas + " dan tinggi : " + limasSegiempat3.tinggi + ". Luasnya : " + limasSegiempat3.getLuas()+ ", sedangkan volumenya : " +limasSegiempat3.getVolume());;;
    }
}
