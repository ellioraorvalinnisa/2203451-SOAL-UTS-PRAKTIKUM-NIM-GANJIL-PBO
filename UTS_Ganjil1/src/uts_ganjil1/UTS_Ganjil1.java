/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_ganjil1;

/**
 *
 * @author Elliora Orva Linnisa
 */


import java.util.Random;

public class UTS_Ganjil1 {
    
    public static void main(String[] args) {
        Random rand = new Random();
  
        int bulan = rand.nextInt(12) + 1;

        System.out.println("Bil. Bulat Acak yang dihasilkan : " + bulan);

        switch(bulan) {
            case 1:
                System.out.println("Nama Bulan: Januari");
                break;
            case 2:
                System.out.println("Nama Bulan: Februari");
                break;
            case 3:
                System.out.println("Nama Bulan: Maret");
                break;
            case 4:
                System.out.println("Nama Bulan: April");
                break;
            case 5:
                System.out.println("Nama Bulan: Mei");
                break;
            case 6:
                System.out.println("Nama Bulan: Juni");
                break;
            case 7:
                System.out.println("Nama Bulan: Juli");
                break;
            case 8:
                System.out.println("Nama Bulan: Agustus");
                break;
            case 9:
                System.out.println("Nama Bulan: September");
                break;
            case 10:
                System.out.println("Nama Bulan: Oktober");
                break;
            case 11:
                System.out.println("Nama Bulan: November");
                break;
            case 12:
                System.out.println("Nama Bulan: Desember");
                break;
            default:
                System.out.println("Terjadi kesalahan dalam penentuan bilangan dan nama bulan");
                break;
        }
    }
}