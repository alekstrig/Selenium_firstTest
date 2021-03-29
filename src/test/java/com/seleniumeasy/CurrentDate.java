package com.seleniumeasy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class CurrentDate {
    public static void main(String[] args) {



            LocalDateTime today = LocalDateTime.now();


            LocalDateTime yesterday = today.minusDays(1); //today: "2021-03-26T20:11:
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String correctDate = yesterday.format(formatter);


    }
}
