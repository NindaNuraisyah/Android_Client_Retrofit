package com.ninda.android_client;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("nim")
    private String nim;
    @SerializedName("nohp")
    private String nohp;
    @SerializedName("alamat")
    private String alamat;

    // Konstruktor untuk membuat objek User baru
    public User(int id, String name, String email, String nim, String nohp, String alamat) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.nim = nim;
        this.nohp = nohp;
        this.alamat = alamat;
    }

    // Konstruktor untuk membuat objek User tanpa id (misalnya, untuk menambahkan user baru)
    public User(String name, String email, String nim, String nohp, String alamat) {
        this.name = name;
        this.email = email;
        this.nim = nim;
        this.nohp = nohp;
        this.alamat = alamat;
    }

    // Getter untuk mendapatkan id user
    public int getId() {
        return id;
    }

    // Setter untuk mengatur id user
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk mendapatkan nama user
    public String getName() {
        return name;
    }

    // Setter untuk mengatur nama user
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mendapatkan email user
    public String getEmail() {
        return email;
    }

    // Setter untuk mengatur email user
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter untuk mendapatkan nim user
    public String getNim() {
        return nim;
    }

    // Setter untuk mengatur nim user
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter untuk mendapatkan nohp user
    public String getNohp() {
        return nohp;
    }

    // Setter untuk mengatur nohp user
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    // Getter untuk mendapatkan alamat user
    public String getAlamat() {
        return alamat;
    }

    // Setter untuk mengatur email user
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
