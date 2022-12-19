/**
 * Description: student implementing Classes
 * @author Klara Makek
 * @version 26.9.2022.
 * Course: ISTE-120
 * LAB- 04-1
 */
 /**************JAVADOC************************/
public class StudentRecord {
    //attributes of the student record
    Student stu;
    Adress addr;

    /**
     * Student record constructor
     * @param _stu takes the student name, .itd from TestStudent
     * @param _addr takes the student adress from TestStudent
     */
    public StudentRecord(Student _stu, Adress _addr){
        stu = _stu;
        addr = _addr;
    }
    // toString to print
public String toString(){
    return "" + "\n" + stu + addr;
}
}
