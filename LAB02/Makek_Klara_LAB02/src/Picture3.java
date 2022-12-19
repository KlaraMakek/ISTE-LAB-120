/** class- draw and redraw simple drawing
 * @author Klara Makek
 * @version 16.9.2022.
 */
import java.awt.*;

/**
 * Picture - This class represents a simple picture. 
 * You can draw the picture using the draw method. But wait, there's more: 
 * being an electronic picture, it can be changed. You can set it to 
 * black-and-white display and back to colors (only after it's been drawn,
 * of course).
 * 
 * @author  D. Patric
 * @version 2201
 */

public class Picture3
{
    private Canvas canvas;
    private Rectangle wall;
    private Rectangle window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture3()
    {
       canvas = new Canvas("Picture3", 400, 400);
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Rectangle(40, 140, 100, 100, Color.RED, true);
        
        window = new Rectangle(60, 160, 30, 30, true);

        roof = new Triangle(20, 100, 140, 40, Color.GREEN, true);  
        
        sun = new Circle(180, 20, 20, Color.YELLOW, true);
        
        canvas.draw(wall);
        canvas.draw(window);
        canvas.draw(roof);
        canvas.draw(sun);
    }
 /*
     * we set different colors, erase the sun and redraw the canvas
     */
    public void setNewColors(){
        wall.setColor(Color.BLUE);
        roof.setColor(Color.MAGENTA);
        canvas.erase(sun);

        canvas.redraw();

    }
    /*
    * we set the colors in original, redraw the sun and redraw the canvas
    */
    public void setOrigColors(){
        wall.setColor(Color.RED);
        roof.setColor(Color.GREEN);
        canvas.draw(sun);

        canvas.redraw();
    }
}
