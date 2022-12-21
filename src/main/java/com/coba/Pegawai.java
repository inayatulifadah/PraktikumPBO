package com.coba;
public class Pegawai {
 private String Nama;
 private int NIP;
 private String Alamat;
 private int jmlhHariLembur;
 private double gajiPokok;
 private double totalGaji;
 
 public Pegawai()
 {
 System.out.println("Data Pegawai");
 }
 
 public void setnip (int nip)
 {
 NIP = nip;
 }
 public void setnama (String nama)
 {
 Nama = nama;
 }
 public void setalamat (String alamat)
 {
 Alamat = alamat;
 }
 public void setjumlah_hari_lembur(int jumlah_hari_lembur)
 {
 jmlhHariLembur = jumlah_hari_lembur;
 }
 public void setgaji_pokok(double gaji_pokok)
 {
 gajiPokok = gaji_pokok;
 }
 public int getnip()
 {
 return NIP;
 }
 public String getnama()
 {
 return Nama;
 }
 public String getalamat()
 {
 return Alamat;
 }
 public int getjumlah_hari_lembur()
 {
 return jmlhHariLembur;
 }
 public double getgaji_pokok()
 {
 return gajiPokok;
 }
 public void setInfo()
 {
 totalGaji = gajiPokok + (gajiPokok * jmlhHariLembur * 0.01);
 }
 
 public void cetak (){
 System.out.println("NIP pegawai : " + getnip());
 System.out.println("Nama Pegawai : " + getnama());
 System.out.println("Alamat Pegawai : " + getalamat());
 System.out.println("Jumlah Hari Lembur : " + 
getjumlah_hari_lembur());
 System.out.println("Gaji Pokok Pegawai : " + getgaji_pokok());
 System.out.println("Total Gaji Pegawai : " + totalGaji);
 }
 }