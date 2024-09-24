package facades;

import modules.AirConditioning;
import modules.Light;
import modules.Tv;

public class HomeFacade {
    private final AirConditioning _airConditioning = new AirConditioning();
    private final Light _light = new Light();
    private final Tv _tv = new Tv();

    public void turnOnAll() {
        _airConditioning.turnOn();
        _light.turnOn();
        _tv.turnOn();
    }

    public void turnOffAll() {
        _airConditioning.turnOff();
        _light.turnOff();
        _tv.turnOff();
    }
}
