package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);

    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);

    List<FlightModel> getAllFlight();
    
    void updateFlight(long flightId, FlightModel flight);
    
    void deleteFlight(FlightModel flight);
    
    Optional<FlightModel> getFlightDetailByFlightId(long flightId);
}