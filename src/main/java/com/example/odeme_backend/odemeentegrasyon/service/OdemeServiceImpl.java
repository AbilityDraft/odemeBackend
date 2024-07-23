package com.example.odeme_backend.odemeentegrasyon.service;

import com.example.odeme_backend.odemeentegrasyon.controller.dto.OdemeCekmeRequestDTO;
import com.example.odeme_backend.odemeentegrasyon.controller.dto.OdemeCekmeResponseDTO;
import com.example.odeme_backend.odemeentegrasyon.controller.dto.OdemeResponseDTO;
import com.example.odeme_backend.odemeentegrasyon.controller.dto.PayResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
@Service
public class OdemeServiceImpl implements OdemeService{
    @Override
    @Transactional
    public PayResponseDTO getOdemeKontrol() {
        RestTemplate restTemplate=new RestTemplate();
        String url = "https://api.paymorph.com/transaction/last/list?email=infoexxon@paymorph.com&key=7b07ff57a3fcef0c650a11a7ffbc866a&iban=TR830083800875002128712239"; // URL of Application A
        PayResponseDTO payResponseDTO= restTemplate.getForObject(url, PayResponseDTO.class);
        return payResponseDTO;
    }

    @Override
    @Transactional
    public OdemeCekmeResponseDTO getOdemeCekme(OdemeCekmeRequestDTO odemeCekmeRequestDTO) {
        RestTemplate restTemplate=new RestTemplate();
        String url = "https://api.paymorph.com/cashout/sipay/send"; // URL of Application A
        OdemeCekmeResponseDTO payResponseDTO= restTemplate.postForObject(url, odemeCekmeRequestDTO,OdemeCekmeResponseDTO.class);
        return payResponseDTO;
    }
}
