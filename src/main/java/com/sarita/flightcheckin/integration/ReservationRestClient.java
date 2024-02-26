package com.sarita.flightcheckin.integration;

import com.sarita.flightcheckin.integration.dto.Reservation;
import com.sarita.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
   public Reservation findReservation(Long id);
  
   public Reservation updateReservation(ReservationUpdateRequest request);
}
