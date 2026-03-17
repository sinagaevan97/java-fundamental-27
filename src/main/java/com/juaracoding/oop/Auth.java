package com.juaracoding.oop;

public class Auth {

    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("Indonesia");
    }

    public boolean register(String nik, String username, String password) {
        // Simulate registration logic (e.g., save to database)
        if(nik == null || username == null || password == null) {
            throw new IllegalArgumentException("NIK, username, and password cannot be null");
        } else if(nik.length() != 16 && !nik.matches("\\d+")) {
            throw new IllegalArgumentException("NIK must be 16 characters long and contain only digits");
        } else if(password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        } else {
            System.out.println("User registered: " + username);
            return true;
        }
    }

}
