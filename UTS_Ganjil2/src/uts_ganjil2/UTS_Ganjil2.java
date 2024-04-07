/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_ganjil2;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class UTS_Ganjil2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilangan, jumlahPositif = 0, jumlahNegatif = 0, jumlahTotal = 0, jumlahBilangan = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");

        while (true) {
            bilangan = scanner.nextInt();

            if (bilangan == 0) {
                break;
            }
            if (bilangan > 0) {
                jumlahPositif++;
            } else {
                jumlahNegatif++;
            }

            jumlahTotal += bilangan;
            jumlahBilangan++;
        }

        if (jumlahBilangan == 0) {
            System.out.println("Tidak ada bilangan yang anda masukkan.");
        } else {
            double rataRata = (double) jumlahTotal / jumlahBilangan;

            System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
            System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
            System.out.println("Nilai total adalah " + jumlahTotal);
            System.out.println("Nilai rata-rata " + rataRata);
        }

        scanner.close();
    }
}
