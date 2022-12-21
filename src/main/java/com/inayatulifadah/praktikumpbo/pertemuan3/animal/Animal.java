package com.inayatulifadah.praktikumpbo.pertemuan3.animal;

public class Animal {
    //Atribut
    private String name;
    private int age;
    private String color;
    
    //Constructor
    public Animal(){}

    public Animal(String name, int age, String color) { // [Alt] + (Fn) + [Insert] + Constructor -> Select All
        this.name = name; //This digunakan jika ada kesamaan nama
        this.age = age;
        this.color = color;
    }
   
    //bisa diisi sesuatu(namun sekarang dikosongin dulu aja)
    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age + " years old");
        System.out.println("Color : "+ color);
    }
    // [Alt] + (Fn) + [Insert] + Getter & Setter -> Select All
    //Getter & Setter 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

