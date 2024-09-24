package modules;

import service.HomeService;

public class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Air-con is turning on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Air-con is turning off!");
    }
}
