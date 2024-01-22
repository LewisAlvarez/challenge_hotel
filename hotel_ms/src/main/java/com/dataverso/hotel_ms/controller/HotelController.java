package com.dataverso.hotel_ms.controller;

import com.dataverso.hotel_ms.entity.Hotel;
import com.dataverso.hotel_ms.service.HotelService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/getAll")
    public String getHotelList(){
        return "Lista de hoteles";
    }

    @PostMapping("/createHotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody @NotNull @Validated Hotel hotelToSave){
        hotelService.saveHotel(hotelToSave);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/test")
    public String test(){
        return "TEST.";
    }
}
