package patternsdemo.state.start;

import patternsdemo.state.context.TransformerContext;
import patternsdemo.state.state.FireState;
import patternsdemo.state.state.MoveState;
import patternsdemo.state.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
