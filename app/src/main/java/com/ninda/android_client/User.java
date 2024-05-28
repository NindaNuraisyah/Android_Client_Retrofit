package com.ninda.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String nim;
    private String nohp;
    private String alamat;


    public User(String name, String email, String nim, String nohp, String alamat) {
        this.name = name;
        this.email = email;
        this.nim = nim;
        this.nohp = nohp;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNim() {
        return nim;
    }

    public String getNohp() {
        return nohp;
    }

    public String getAlamat() {
        return alamat;
    }
}
