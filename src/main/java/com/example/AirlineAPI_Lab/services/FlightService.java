package com.example.AirlineAPI_Lab.services;

import com.example.AirlineAPI_Lab.repositories.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FlightService {

    @Autowired
    FlightsRepository flightsRepository;

    @Autowired
    PassengerService passengerService;
}
