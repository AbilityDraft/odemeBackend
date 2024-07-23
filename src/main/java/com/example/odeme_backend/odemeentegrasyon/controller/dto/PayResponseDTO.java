package com.example.odeme_backend.odemeentegrasyon.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PayResponseDTO {

    private List<OdemeResponseDTO> data;
    private boolean status;
    private Integer status_code;

}
