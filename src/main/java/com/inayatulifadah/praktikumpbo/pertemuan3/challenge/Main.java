package com.inayatulifadah.praktikumpbo.pertemuan3.challenge;

public class Main {
    public static void main(String[] args) {
        Library naya= new Library("inayatul",1,4);
        Library nana= new Library("nana",2,3);
        
        naya.showProfile();
        nana.showProfile();
        System.out.println("Nama Asli: " +nana.getName());
        nana.setName("Lutfi");
        System.out.println("Perubahan nama: "+nana.getName()); 
    }
  }
