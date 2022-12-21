package com.inayatulifadah.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //Membuat object
        //Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Motor ksn = new Motor();
        
        //Memasukkan nilai attribute
        mb.nama = "Mitsubishi";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        ksn.nama = "Honda";
        ksn.jmlRoda = 2;
        ksn.cepat = 10;
       
        //Uji coba panggilan method
        mb.showInfo();
        mb.belok("Kanan");
        mb.belok();
        
        ksn.showInfo();
        ksn.maju("depan");
        ksn.mundur();
    }
}
