package edu.depaul.cdm.se452.dreamteam.windyhamhotel;

import lombok.Data;

@Data
public class Room {
    private int id;
    private int roomNumber;
    private String type;
    private double price;
    private String description;
    private boolean status;
}
