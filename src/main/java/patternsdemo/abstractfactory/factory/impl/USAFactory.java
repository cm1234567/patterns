package patternsdemo.abstractfactory.factory.impl;

import patternsdemo.abstractfactory.factory.interfaces.TransportFactory;
import patternsdemo.abstractfactory.transport.impl.aircraft.Boeing747;
import patternsdemo.abstractfactory.transport.impl.car.Porsche;
import patternsdemo.abstractfactory.transport.interfaces.Aircraft;
import patternsdemo.abstractfactory.transport.interfaces.Car;

// американские транспортные средства
public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
