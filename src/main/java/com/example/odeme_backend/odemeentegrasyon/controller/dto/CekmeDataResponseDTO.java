package com.example.odeme_backend.odemeentegrasyon.controller.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CekmeDataResponseDTO {
    private String bank_transaction_id;
    private String name;
    private String iban;
    private String taxId;
    private String balance;
    private String description;
    private Integer status_code;
    private String status_text;

}
