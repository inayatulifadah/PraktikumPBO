package com.inayatulifadah.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();
        
        if(bilangan > 0)
            System.out.print(bilangan +  " adalah bilangan positif!");
        
        else if(bilangan < 0)
            System.out.print(bilangan +  " adalah bilangan negatif!");
        
        else
            System.out.print(bilangan +  " adalah nol!");
    }
}
