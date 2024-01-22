package com.dataverso.hotel_ms.service;

import com.dataverso.hotel_ms.entity.Hotel;
import com.dataverso.hotel_ms.repository.HotelRepository;
import org.springframework.stereotype.Service;

@Service
public class HotelService {


    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    public void saveHotel(Hotel h){
        hotelRepository.save(h);
    }
}
