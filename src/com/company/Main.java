package com.company;

public class Main {

    public static void main(String[] args) {
        LivingRoomFacade livingRoomButton = new LivingRoomFacade();

        livingRoomButton.turnonLight();
        livingRoomButton.turnonAirFresher();
        livingRoomButton.turnonTv();
    }
}
