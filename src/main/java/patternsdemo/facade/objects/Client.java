package patternsdemo.facade.objects;

import patternsdemo.facade.facade.CarFacade;
import patternsdemo.facade.parts.Door;
import patternsdemo.facade.parts.Wheel;
import patternsdemo.facade.parts.Zazhiganie;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
