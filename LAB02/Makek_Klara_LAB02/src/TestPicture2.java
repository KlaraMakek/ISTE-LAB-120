/** class- draw and redraw simple drawing
 * @author Klara Makek
 * @version 16.9.2022.
 */
import java.util.*;

public class TestPicture2 {
    
    public static void main(String[] args) throws Exception {
    /*
     * the picture is initialize and drawn
     */
    Picture2 picture2 = new Picture2();
    picture2.draw();
    /*
    * the system is scanned
    */
    Scanner in = new Scanner(System.in);
    /*
    *After we press enter the colors change 
    */
    System.out.println("Press Enter to continue:");
    in.nextLine();
    picture2.setNewColors();
    /*
    *After we press enter the colors change back to original 
    */
    System.out.println("Press Enter to continue:");
    in.nextLine();
    picture2.setOrigColors();

    in.close();
    }
}

