package com.loiloop.LoiloopRoom.service.interfac;

import com.loiloop.LoiloopRoom.dto.Response;
import com.loiloop.LoiloopRoom.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
