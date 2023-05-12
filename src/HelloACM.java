import acm.graphics.*;
import acm.program.*;

import java.awt.*;


public class HelloACM extends GraphicsProgram {

//    public void run(){
//        println("Hello World");
//    }

    public void run(){
        GRect rect = new GRect(200, 300);
        rect.setColor(Color.blue);
        rect.setFilled(true);
        add(rect,50,50);

        GLabel label = new GLabel("Hello World");
        label.setColor(Color.white);
        add(label, 100, 100);
    }

    public static void main(String[] args){
        (new HelloACM()).start(args);
    }
}
