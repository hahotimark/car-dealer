package com.programozzteis.cardealer.cardealer.car;

import org.springframework.web.bind.annotation.GetMapping;

public class CarController {

    @GetMapping("/advertisementList.html")
    public String showAdvertisements(){

        return "advertisements/advertisementList.html";
    }
}
