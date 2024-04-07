/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_ganjil3;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class UTS_Ganjil3 {

    public static int sumDigit(long n) { 
    int lengthN = String.valueOf(n).length();
    int sum = 0; 

    for (int i = 0; i < lengthN; i++) { 
      System.out.println("Iterasi ke-" + (i + 1) + ":"); 
      System.out.println("Mengekstrak " + n % 10); 
      System.out.println("Jumlah " + sum + " + " + n % 10); 
      
      sum += n % 10; 
      
      System.out.println("Jumlah sementara: " + sum); 
      System.out.println("Sisa dari " + n + " adalah " + n / 10); 
      
      n /= 10; 
      
      System.out.println(); 
    }

    return sum; 
  }
  
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 

    System.out.print("Masukkan sebuah bilangan bulat: "); 
    long n = scanner.nextLong(); 

    System.out.println("Jumlah digit dari " + n + " adalah " + sumDigit(n)); 

    scanner.close(); 
  }
}