package com.inayatulifadah.praktikumpbo.pertemuan5;

public class Array2 {
    public static void main(String[] args) {
        //Pembuatan array
        String[] names = new String[5];
        
        /*String[] names = {
            "Rain",
            "Thunder",
            "Strom"
        };
*/
        
        //atau String[] names = {"Rain","Thunder","Strom"};
        
        //Cek panjang array
        System.out.println("Panjang array: " + names.length);
        
        //Memasukkan nilai ke array
        names[0] = "Rain";
        names[1] = "Thunder";
        names[2] = "Strom";
        
        //Menampilkan semua nilai array
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
    }
}
