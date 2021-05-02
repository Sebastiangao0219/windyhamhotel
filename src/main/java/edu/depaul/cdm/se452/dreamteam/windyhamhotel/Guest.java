package edu.depaul.cdm.se452.dreamteam.windyhamhotel;

import javax.validation.constraints.Email;

import lombok.Data;

@Data
public class Guest implements Booking{

    private int id;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;
    private String phone;
    

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
