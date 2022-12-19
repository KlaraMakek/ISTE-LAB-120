/**
 * Class- Lab01- Truck Drawing
 * @author Klara Makek
 * @version 07.09.2022.
 */

 import java.awt.*;

public class TruckDrawing {
    public static void main(String[] args) throws Exception {

        Canvas canvas = new Canvas("TruckDrawing - KLARA", 500, 500);


        /* Rectangles for front part*/

        Rectangle motor = new Rectangle(370, 210, 110, 50, Color.RED, true); 
        canvas.draw(motor);
        System.out.println("Rectangle motor:" + motor);

        Rectangle cabin = new Rectangle(370, 160, 65, 50, Color.RED, true); 
        canvas.draw(cabin);
        System.out.println("Rectangle cabin:" + cabin);

        Rectangle window = new Rectangle(377, 170, 50, 30, Color.BLUE, true); 
        canvas.draw(window);
        System.out.println("Rectangle window:" + window);


        /* Rectangles for holders */

        Rectangle holder = new Rectangle(280, 250, 90, 10, Color.RED, true); 
        canvas.draw(holder);
        System.out.println("Rectangle holder:" + holder);
        
        Rectangle holderBack = new Rectangle(10, 250, 90, 10, Color.RED, true); 
        canvas.draw(holderBack);
        System.out.println("Rectangle holderBack:" + holderBack);


        /* Rectangle for trailer */

        Rectangle trailer = new Rectangle(10, 160, 350, 90, Color.BLUE, true);
        canvas.draw(trailer);
        System.out.println("Rectangle trailer:" + trailer);


        /* Circles for tiers */     

        Circle tier1 = new Circle(10, 260, 20, Color.BLACK, true);
        canvas.draw(tier1);
        System.out.println("Circle tire1:" + tier1);

        Circle tier2 = new Circle(50, 260, 20, Color.BLACK, true);
        canvas.draw(tier2);
        System.out.println("Circle tire2:" + tier2);
        
        Circle tier3 = new Circle(280, 260, 20, Color.BLACK, true);
        canvas.draw(tier3);
        System.out.println("Circle tire3:" + tier3);

        Circle tier4 = new Circle(320, 260, 20, Color.BLACK, true);
        canvas.draw(tier4);
        System.out.println("Circle tire4:" + tier4);

        Circle tier5 = new Circle(440, 260, 20, Color.BLACK, true);
        canvas.draw(tier5);
        System.out.println("Circle tire5:" + tier5);

        
        /* DrawableString for trailer name */
        DrawableString name = new DrawableString("AJAX Supplies", 150, 210, Color.WHITE);
        canvas.draw(name);
        System.out.println("CompanY name: " + name);


    }
}
