package patternsdemo.decorator.decorators;

import patternsdemo.decorator.objects.Button;
import patternsdemo.decorator.objects.Component;
import patternsdemo.decorator.objects.TextView;
import patternsdemo.decorator.objects.Window;

public class Start {
    
    private static Component window;
    private static Component textView;
    private static Component button;
    
    public static void main(String[] args) {

        Component window = new Window();
        window.draw();

        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        Component windowWithColorBorder = new ColorDecorator( new BorderDecorator(new Window()));
        windowWithColorBorder.draw();

        Component textView = new ColorDecorator( new TextView());
        textView.draw();

        System.out.println();

        boolean showBorder = true;

        if (!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }else{
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }


        window.draw();
        textView.draw();
        button.draw();
        
        
    }

}
