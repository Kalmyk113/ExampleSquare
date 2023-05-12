import acm.graphics.*;
import acm.program.*;


public class HelloACM extends GraphicsProgram {

//    public void run(){
//        println("Hello World");
//    }

    public void run(){
        GLabel label = new GLabel("Hello World");
        add(label, 100, 100);

        GRect rect = new GRect(200, 300);
        add(rect,50,50);
    }

    public static void main(String[] args){
        (new HelloACM()).start(args);
    }
}
