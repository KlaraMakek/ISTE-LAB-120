/** class- draw and redraw simple drawing
 * @author Klara Makek
 * @version 16.9.2022.
 */
import java.util.*;

public class TestPicture3 {

    public static void main(String[] args) throws Exception {
    /*
     * the picture is initialize and drawn
     */
    Picture3 picture3 = new Picture3();
    picture3.draw();

    /*
    * the system is scanned
    */
    Scanner in = new Scanner(System.in);

    /*
    *After we press enter the colors change and the sun is gone
    */
    System.out.println("Press Enter to continue:");
    in.nextLine();
    picture3.setNewColors();
    /*
    *After we press enter the colors change back to original and the sun is back
    */
    System.out.println("Press Enter to continue:");
    in.nextLine();
    picture3.setOrigColors();

    in.close();
    }
}

