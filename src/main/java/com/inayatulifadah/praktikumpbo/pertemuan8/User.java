package com.inayatulifadah.praktikumpbo.pertemuan8;

public class User {
    String email;
    String password;
    
    // [Alt] + [Insert] -> Constructor

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public boolean verify(String email, String password){
        if(this.email.equals(email) && this.password.equals(password))
            return true;
        
        return false;
    }
}
