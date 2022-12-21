package com.inayatulifadah.praktikumpbo.pertemuan4.kendaraan;

public class Motor extends Kendaraan{
    float cepat;
    public void maju (String arah){
        System.out.println("Motor " + nama + " bergerak maju ke" + arah);
    }
    
    public void mundur(){
        System.out.println("Error: Mohon masukkan arah!");
    }
    
    public void extraInfo(){
        System.out.println("Kecepatan: " + cepat + "km/jam");
    }
}