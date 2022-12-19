/**
 * Description: simple animation
 * @author Klara Makek
 * @version 26.9.2022.
 * Course: ISTE-120
 * LAB- 04-2
 */
/************** JAVADOC ************************/
public class Controller {
    // attributes
    private Canvas canvas;
    private Arrow arrow;

    public static void main(String[] args) throws Exception {
        new Controller();

    }

    /**
     * Controller
     * 
     * @throws Exception
     */
    public Controller() throws Exception {
        this.canvas = new Canvas("Arrow", 300, 700);
        this.arrow = new Arrow(this.canvas);

        arrow.draw(); // draw the arrow at the bottom of the screen
        // loop to repeat the movement - code took from -> https://www.w3schools.com/java/java_for_loop.asp
        for (int i = 0; i < 10; i++) { 
            Thread.currentThread();
            Thread.sleep(100); // delay a little
            arrow.erase(); // erase the arrow
            arrow.moveUp(); // move the arrow up 50 pixels
            arrow.draw(); // redraw the arrow
            Thread.currentThread();
            Thread.sleep(200); // delay a little
        }
        /**
         * prints the arrow specs
         */
        System.out.println(arrow.toString());
    }
}
