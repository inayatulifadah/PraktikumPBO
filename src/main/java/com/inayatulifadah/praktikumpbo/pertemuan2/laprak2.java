/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inayatulifadah.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class laprak2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        int log = 1;
        String username, password;
        do{
           System.out.print("-------------------------");
           System.out.print("     Masukkan Akun       ");
           System.out.print("-------------------------");
           System.out.print("\nUsername : ");
           username = input.nextLine();
           System.out.print("\nPassword : ");
           password = input.nextLine();
           
           if(username.equals("hallo")&&password.equals("hai")){
               System.out.print("\nSelamat Anda Berhasil Masuk");
               i = 4;
               log = 1;
           }else{
              System.out.print("\nMaaf Anda Gagal Masuk");
              i = i+1;
           }
   }while(i <= 3);
        if(log != 1){
            System.out.print("\nAnda telah 3x Gagal Masuk");
            System.out.print("\nMohon Maaf Akun Anda Kami Blokir");
           }
    }
}

