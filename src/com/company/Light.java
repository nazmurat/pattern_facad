package com.company;

public class Light implements HomeKit{
    @Override
    public void turnon(){
        System.out.println("Light in the living room was turned on ");
    }
}
