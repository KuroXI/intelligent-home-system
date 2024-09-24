package modules;

import service.HomeService;

public class Tv implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Tv is turning on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is turning off!");
    }
}
