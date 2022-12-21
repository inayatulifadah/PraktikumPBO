package com.inayatulifadah.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        //Deklarasi Scanner untuk user input nanti
        Scanner input = new Scanner(System.in);

        //Membuat agar panjang array ditentukan input user
        System.out.println("-- program input nilai --");
        System.out.print("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println();

        //Membuat array baru dengan panjang sesuai input sesuai input user
        int[] nilai = new int[jml];
        
        //Masukkan nilai ke array
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println();
        
        //Menampilkan semua nilai array
        System.out.println("-- Daftar Nilai --");
        for (int i = 0; i < jml; i++) {
            System.out.println(i + ": " + nilai[i]);
        }
        
        //Menghitung rata - rata nilai
        System.out.println("--Rata-Rata Nilai");
        int rata2;
        rata2 = jml+(jml/jml);
        System.out.println("Nilai rata-rata "+ rata2);
    }
}
