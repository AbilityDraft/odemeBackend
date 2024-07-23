package com.example.odeme_backend.odemeentegrasyon.controller.dto;

public class OdemeRequestDTO {

    private String email;
    private String key;
    private String iban;

    public OdemeRequestDTO(String email, String key, String iban) {
        this.email = email;
        this.key = key;
        this.iban = iban;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
