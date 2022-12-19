/**
 * Description: student implementing Classes
 * @author Klara Makek
 * @version 26.9.2022.
 * Course: ISTE-120
 * LAB- 04-1
 */
 /**************JAVADOC************************/
public class Adress {
    //attributes of the student
    private String street;
    private String city;
    private String state;
    private int zip;

    /**
     * adress constructor
     * @param _street Students street
     * @param _city Student city
     * @param _state Students state
     * @param _zip Student postal code
     */
    public Adress(String _street, String _city, String _state, int _zip){
        street = _street;
        city = _city;
        state = _state;
        zip = _zip;
    }

    /**
     * getStreet - get students street
     * @return the students street
     */
    public String getStreet(){
        return street;
    }
    /**
     * getCity - get students city
     * @return the students city
     */
    public String getCity(){
        return city;
    }
     /**
     * getState - get students state
     * @return the students state
     */
    public String getState(){
        return state;
    }
     /**
     * getZip- get students zip
     * @return the students zip
     */
    public int getZip(){
        return zip;
    }
     //toString - printing
    public String toString(){
        return "" + "\n" + street + "\n" + city + ", " + state + " " + zip;
    }
    
}
