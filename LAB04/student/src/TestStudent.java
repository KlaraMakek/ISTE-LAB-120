/**
 * Description: student implementing Classes
 * @author Klara Makek
 * @version 26.9.2022.
 * Course: ISTE-120
 * LAB- 04-1
 */
 /**************JAVADOC************************/
public class TestStudent {
public static void main(String[] args) {
    
    /**
     * creating new students
     */
    Student stu = new Student("Marko ", "Ivanov", 123 , 3.5);
    Student stu1 = new Student("Josipa", "Petrov", 	24185, 2.5);
    Student stu2 = new Student("Barbara", "Bluestone", 2368, 2.8);

    /**
     * creating new addresses for students
     */
    Adress addr = new Adress("13 Flower St.", "Pulteneyville", "NY", 14386);
    Adress addr1 = new Adress("Pod Luke 6.","Samobor","Grad Zagreb", 10000);
    Adress addr2 = new Adress("Josipa Lisac 14.", "Zagreb", "Grad Zagreb", 10000);

    /*
     * Printing and linking student info
     */
    System.out.println(stu1.toString()); //prints only the stu1 
    System.out.println(addr1.toString()); //prints only the addr1
    
    StudentRecord rec = new StudentRecord(stu,addr); // "combines" student to there adress
    System.out.println(rec.toString()); //prints stu and addr

    StudentRecord rec2 = new StudentRecord(stu2,addr2); // "combines" student2 to there adress2
    System.out.println(rec2.toString()); //prints stu2 and addr2
    
}}

