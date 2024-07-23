package com.example.odeme_backend.odemeentegrasyon.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OdemeCekmeRequestDTO {

    private String balance;
    private String description;
    private String email;
    private String from_iban;
    private String iban;
    private String identity_id;
    private String key;
    private String name;
    private String reference_id;
}
