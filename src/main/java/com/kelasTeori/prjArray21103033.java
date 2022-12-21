package com.kelasTeori;

import java.util.Scanner;

public class prjArray21103033 {
    public static void main(String[] args) {
        int n, jml = 0;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen array:");
        n = inputan.nextInt();
        int bil[] = new int[n];
        System.out.println("Masukan elemen array:");
        for(int i = 0; i < n; i++){
            bil[i] = inputan.nextInt();
            jml = jml + bil[i];
        }
        System.out.println("Jumlah :"+jml);
   }
}
