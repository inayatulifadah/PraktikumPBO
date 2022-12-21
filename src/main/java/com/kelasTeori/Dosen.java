package com.kelasTeori;

public class Dosen extends Pegawai{
//public class Dosen extends Pegawai implements IHitungTotal(){
    private int jumlahMatkul;
    private int jumlahSertifikasi;
    
    public Dosen (String npp, String nama, double gaji){
        super(npp, nama,gaji);
        this.jumlahMatkul = jumlahMatkul;
        this.jumlahSertifikasi = jumlahSertifikasi;
    }
    
    public void showData(){
        System.out.println("npp : "+ npp);
        System.out.println("nama : " + nama);
        System.out.println("gaji : " + gaji);
    }
    
    public double totalPendapatan(){
        return gaji + (jumlahMatkul*250000)+(jumlahSertifikasi*100000);
    }
    
}
