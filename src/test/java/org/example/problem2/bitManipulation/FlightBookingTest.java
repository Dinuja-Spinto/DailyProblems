package org.example.problem2.bitManipulation;

import static org.example.problem2.bitManipulation.FlightBooking.bookSeat;
import static org.example.problem2.bitManipulation.FlightBooking.isSeatAvailable;
import static org.junit.jupiter.api.Assertions.*;

class FlightBookingTest {

    @org.junit.jupiter.api.Test
    void isSeatAvailableTest() {
        int newBooking = bookSeat(0,5);
        assertFalse(isSeatAvailable(newBooking, 5));
    }

    @org.junit.jupiter.api.Test
    void isSeatAvailableTest2() {
        int newBooking = bookSeat(0,4);
        assertTrue(isSeatAvailable(newBooking, 5));
    }

    @org.junit.jupiter.api.Test
    void bookSeatTest() {
        assertEquals(8,bookSeat(0,4));
    }

    @org.junit.jupiter.api.Test
    void bookSeatTest2() {
        assertNotEquals(7,bookSeat(0,4));
    }
}