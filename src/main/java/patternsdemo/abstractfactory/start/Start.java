package patternsdemo.abstractfactory.start;

import patternsdemo.abstractfactory.factory.impl.RussianFactory;
import patternsdemo.abstractfactory.factory.impl.USAFactory;
import patternsdemo.abstractfactory.factory.interfaces.TransportFactory;
import patternsdemo.abstractfactory.transport.interfaces.Aircraft;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {

        TransportFactory russianFactory = new RussianFactory();
        Aircraft aircraft = russianFactory.createAircraft();
        aircraft.flight();

        String factoryChange = "RUS";
        if (factoryChange == "RUS"){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }


        factory.createAircraft().flight();
        factory.createCar().drive();
        
        
    }

}
