package patternsdemo.abstractfactory.transport.impl.aircraft;

import patternsdemo.abstractfactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {

    @Override
    public void flight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
