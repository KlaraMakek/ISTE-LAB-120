/**
 * class- Lab01- drawing of two circles
 * @author Klara Makek
 * @version 07.09.2022.
 */

import java.awt.*;

public class FirstDrawing {
    public static void main(String[] args) throws Exception {
        
    Canvas canvas = new Canvas("FirstDrawing - KLARA", 500, 500);  // new canvas is created 
    Circle myCircle = new Circle(20, 60, 30); // first "black" circle is defined
    System.out.println("My circle: " + myCircle.toString()); //system is printing object and its attributes
    canvas.draw(myCircle);  //canvas draws the black circle

    Circle blueCircle = new Circle(20,60,30, Color.BLUE);  // blue circle position is 20,60
/** 
 * blueCircle.setXInt(blueCircle.getXInt() + 150); // blue circle is now at 170,60
 * */  
    blueCircle.setYInt(blueCircle.getYInt() + 200);   // blue circle is now at 20, 260

    System.out.println("Blue Circle " + blueCircle.toString()); //system is printing object and its attributes
    canvas.draw(blueCircle); //canvas draws the blue circle

   // 5. I would use : blueCircle.setXInt(blueCircle.getXint() - 7);

   // 6. I would use: blueCircle.setYInt(blueCircle.getYInt() - 19);



    }
}
