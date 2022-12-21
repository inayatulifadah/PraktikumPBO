package com.inayatulifadah.praktikumpbo.pertemuan3.nayaApotek;

public class Main {
    public static void main(String[] args) {
        nayaApotek Lutfi = new nayaApotek ("Lutfi","Lutfi","Paracetamol", 16);
        nayaApotek Karim = new nayaApotek ("Malik","Karim","Paratusin", 17);
        nayaApotek Ana = new nayaApotek ("Ana","Karim","Bisolvon", 18);
    
        Lutfi.tampilkan();
        Karim.tampilkan();
        Ana.tampilkan();
        
        System.out.println("Obat yang dipesan Karim : " + Karim.getObat());
        Karim.setObat("Paracetamol");
        System.out.println("Obat yang tidak dipesan Karim : " + Karim.getObat());
    }
}
