package com.example.odeme_backend.odemeentegrasyon.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class OdemeResponseDTO {

        private BigDecimal balance;
        private String name;
        private BigDecimal after_balance;
        private String desc;

}
