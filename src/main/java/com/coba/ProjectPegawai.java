package com.coba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProjectPegawai {
 private static Object integer;
 private static Double Total_gaji;
 
 public static void main(String[] args) throws IOException {
 Pegawai data;
 data = new Pegawai ();
 System.out.println(" ");
 
 BufferedReader br = new BufferedReader (new 
InputStreamReader (System.in));
 try {
 System.out.println("Masukkan NIP Pegawai: ");
 data.setnip(Integer.parseInt(br.readLine()));
 System.out.println("Masukkan Nama Pegawai: ");
 data.setnama(br.readLine());
 System.out.println("Masukkan Alamat Pegawai: ");
 data.setalamat(br.readLine());
 System.out.println("Masukkan Jumlah Hari Lembur: ");
 
data.setjumlah_hari_lembur(Integer.parseInt(br.readLine().toString()));
 System.out.println("Masukkan Gaji Pokok: ");
 data.setgaji_pokok((double) 
Double.parseDouble(br.readLine()));
 System.out.println(" ");
 data.setInfo();
 data.cetak();
 
 }
 catch (NumberFormatException ex) {
 System.out.println(ex);
 }
 }
}
