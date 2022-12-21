package com.inayatulifadah.praktikumpbo.pertemuan3.animal;


public class Main {
    public static void main(String[] args) {
        //Membuat objek dari class Animal
        Animal cat = new Animal("miyu", 3, "Black");
        Animal dog = new Animal("faa", 2, "Blue");
        Animal rabbit = new Animal();
        
        /*
        //Mengisi nilai attribute objek 'cat'
        cat.name = "miyu";
        cat.age = 3;
        cat.color = "Black";
        
        dog.name = "faa";
        dog.age = 2;
        dog.color = "blue";
        
        rabbit.name = "dami";
        rabbit.age = 3;
        rabbit.color = "white";
        */
        
        //Memanggil method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        //Demo Getter & Setter
        System.out.println("Dog's name (before) : "+ dog.getName());
        dog.setName("Blacky");
        System.out.println("Dog's name (after) : " + dog.getName());
    }
}
