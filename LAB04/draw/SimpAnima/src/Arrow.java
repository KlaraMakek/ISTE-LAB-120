/**
 * Description: simple animation
 * @author Klara Makek
 * @version 26.9.2022.
 * Course: ISTE-120
 * LAB- 04-2
 */
/************** JAVADOC ************************/
public class Arrow {

    // attributes for canvas
    private Canvas canvas; // the canvas on which to draw
    private Triangle head; // a filled, B&W head
    private Rectangle shaft; // an unfilled, B&W shaft

    /**
     * arrow constructor
     * 
     * @param _canvas canvas
     * @param _head   head of the arrow
     * @param _shaft  bottom of the arrow
     */
    public Arrow(Canvas canvas) {
        this.canvas = canvas;
        // if the canvas size is not set we can fit the arrow head in the perfect middle
        this.head = new Triangle(this.canvas.getWidth() / 2 - 25, this.canvas.getHeight() - 150, 50, 50, true);
        // if the canvas size is not set we can fit the arrow shaft in the perfect middle
        this.shaft = new Rectangle(this.canvas.getWidth() / 2 - 5, this.canvas.getHeight() - 100, 10, 100);
    }

    /**
     * draw - it draws the arrow elements
     */
    public void draw() {
        canvas.draw(head);
        canvas.draw(shaft);
    }

    /**
     * erase - it erases the drawings
     */
    public void erase() {
        canvas.erase(head);
        canvas.erase(shaft);
    }

    /**
     * moveUp - moves the arrow up
     */
    public void moveUp() {
        head.setYInt(this.head.getYInt() - 50); // sets the y coordinate of the arrow head to "lower" value
        shaft.setYInt(this.shaft.getYInt() - 50); // sets the y coordinate of the arrow shaft to "lower" value
    }

    // toString prints
    public String toString() {
        return "" + canvas + head + shaft;
    }

}
