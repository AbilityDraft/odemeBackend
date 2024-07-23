package com.example.odeme_backend.odemeentegrasyon.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OdemeCekmeResponseDTO {
    private boolean status;
    private List<String> message;
    private CekmeDataResponseDTO request;

}
