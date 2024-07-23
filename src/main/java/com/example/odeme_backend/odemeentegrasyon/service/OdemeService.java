package com.example.odeme_backend.odemeentegrasyon.service;

import com.example.odeme_backend.odemeentegrasyon.controller.dto.OdemeCekmeRequestDTO;
import com.example.odeme_backend.odemeentegrasyon.controller.dto.OdemeCekmeResponseDTO;
import com.example.odeme_backend.odemeentegrasyon.controller.dto.PayResponseDTO;

public interface OdemeService {
    PayResponseDTO getOdemeKontrol();

    OdemeCekmeResponseDTO getOdemeCekme(OdemeCekmeRequestDTO odemeCekmeRequestDTO);
}
