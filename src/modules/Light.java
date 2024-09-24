package modules;

import service.HomeService;

public class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Light is turning on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turning off!");
    }
}
