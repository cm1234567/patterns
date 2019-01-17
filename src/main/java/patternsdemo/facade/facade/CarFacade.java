package patternsdemo.facade.facade;

// фасад для работы 
import patternsdemo.facade.parts.Door;
import patternsdemo.facade.parts.Wheel;
import patternsdemo.facade.parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
