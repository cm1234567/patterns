package patternsdemo.abstractfactory.factory.impl;

import patternsdemo.abstractfactory.factory.interfaces.TransportFactory;
import patternsdemo.abstractfactory.transport.impl.aircraft.TU134;
import patternsdemo.abstractfactory.transport.impl.car.Niva;
import patternsdemo.abstractfactory.transport.interfaces.Aircraft;
import patternsdemo.abstractfactory.transport.interfaces.Car;

// российские транспортные средства
public class RussianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
