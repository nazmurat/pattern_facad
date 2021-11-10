package com.company;

public class LivingRoomFacade {
    private HomeKit tv;
    private HomeKit light;
    private HomeKit airFresher;

    public LivingRoomFacade() {
        tv = new Tv();
        light = new Light();
        airFresher = new AirFresher();
    }

    public void turnonTv(){
        tv.turnon();
    }
    public void turnonLight(){
        light.turnon();
    }
    public void turnonAirFresher(){
        airFresher.turnon();
    }
}
