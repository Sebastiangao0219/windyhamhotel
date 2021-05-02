package edu.depaul.cdm.se452.dreamteam.windyhamhotel;

import lombok.Data;

@Data
public class Employee implements Booking {

    private String id;
    private String password;

    @Override
    public void makeReservation(Reservation reservation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateReservation(Reservation reservation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cancelReservation(Reservation reservation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void signIn(String email, String password) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void signOut() {
        // TODO Auto-generated method stub
        
    }
    
}
