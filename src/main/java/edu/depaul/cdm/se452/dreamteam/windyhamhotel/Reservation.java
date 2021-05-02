package edu.depaul.cdm.se452.dreamteam.windyhamhotel;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Reservation {
    private int id;
    private int adult;
    private int child;
    private LocalDate checkin;
    private LocalDate checkout;
    private Room room;
    private Guest guest;
}
