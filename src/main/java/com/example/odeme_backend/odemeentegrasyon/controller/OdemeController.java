package com.example.odeme_backend.odemeentegrasyon.controller;


import com.example.odeme_backend.odemeentegrasyon.controller.dto.OdemeCekmeRequestDTO;
import com.example.odeme_backend.odemeentegrasyon.controller.dto.OdemeCekmeResponseDTO;
import com.example.odeme_backend.odemeentegrasyon.controller.dto.PayResponseDTO;
import com.example.odeme_backend.odemeentegrasyon.service.OdemeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/odeme")
@AllArgsConstructor
public class OdemeController {

    private final OdemeService odemeService;

    @GetMapping("/odemeKontrol")
    @CrossOrigin
    public PayResponseDTO getOdemeKontrol() {
        return odemeService.getOdemeKontrol();
    }


    @PostMapping("/odemeCekme")
    @CrossOrigin
    public OdemeCekmeResponseDTO getOdemeKontrol(@RequestBody OdemeCekmeRequestDTO odemeCekmeRequestDTO) {
        return odemeService.getOdemeCekme(odemeCekmeRequestDTO);
    }
}
