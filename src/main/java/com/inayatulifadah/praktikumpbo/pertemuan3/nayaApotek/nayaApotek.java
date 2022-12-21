package com.inayatulifadah.praktikumpbo.pertemuan3.nayaApotek;

public class nayaApotek {
    //Atribute
    private String NamaApoteker, NamaPelanggan, Obat;
    private int umur;
    
    //Constructor
    public nayaApotek(String NamaApoteker, String NamaPelanggan, String Obat, int umur){
        this.NamaApoteker = NamaApoteker;
        this.NamaPelanggan = NamaPelanggan;
        this.Obat = Obat;
        this.umur = umur;
    }
    
    //Method
    public void tampilkan (){
        System.out.println("Nama Apoteker : " + NamaApoteker);
        System.out.println("Nama Pelanggan : " + NamaPelanggan);
        System.out.println("Obat yang diperlukan pelanggan : " + Obat);
        System.out.println("Usia : " + umur);
    }

    public String getNamaApoteker() {
        return NamaApoteker;
    }

    public void setNamaApoteker(String NamaApoteker) {
        this.NamaApoteker = NamaApoteker;
    }

    public String getNamaPelanggan() {
        return NamaPelanggan;
    }

    public void setNamaPelanggan(String NamaPelanggan) {
        this.NamaPelanggan = NamaPelanggan;
    }

    public String getObat() {
        return Obat;
    }

    public void setObat(String Obat) {
        this.Obat = Obat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}