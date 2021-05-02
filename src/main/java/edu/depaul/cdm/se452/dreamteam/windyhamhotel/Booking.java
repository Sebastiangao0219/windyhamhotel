package edu.depaul.cdm.se452.dreamteam.windyhamhotel;

public interface Booking {
    void makeReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    void cancelReservation(Reservation reservation);
    void signIn(String email, String password);
    void signOut();
}
