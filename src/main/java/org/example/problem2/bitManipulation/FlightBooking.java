package org.example.problem2.bitManipulation;

public class FlightBooking {
    public static void main(String[] args) {
        int bookings = 0;
        int seatNumber = 4;

        //Book seat
        int newBooking = bookSeat(bookings,seatNumber);
        System.out.println("Seat " + seatNumber + " booked successfully.");

        //checkAvailability
        int checkSeatNumber = 5;
        if (isSeatAvailable(newBooking,checkSeatNumber)) {
            System.out.println("Seat " + checkSeatNumber + " is available.");
        } else {
            System.out.println("Seat " + checkSeatNumber + " is already booked.");
        }
    }

    //if a given seat is available or not
    public static boolean isSeatAvailable(int bookings, int seat){
        // Use bitwise AND to check seat Available
        int mask = 1 << (seat - 1);
        return (bookings & mask) == 0;
    }

    //to book a seat if it's available
    public static int bookSeat(int bookings, int seat){
        // Use bitwise OR to book the seat
        int mask = 1 << (seat - 1);
        bookings |= mask;
        return bookings;
    }
}
