package patternsdemo.abstractfactory.factory.interfaces;

import patternsdemo.abstractfactory.transport.interfaces.Aircraft;
import patternsdemo.abstractfactory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
