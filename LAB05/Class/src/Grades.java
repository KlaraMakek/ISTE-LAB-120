/**
 * Making clashes for 3 students
 * @author Klara Makek
 * @version 7.10.2022.
 * Course: ISTE-120
 * LAB-05
 */
 /**************JAVADOC************************/
public class Grades {
    //implementing classes
    private String name;
    private int id;
    private int sumGrade;
    private int numGrades;
//constructor
    public Grades(String name, int id){
        this.name = name;
        this.id = id;
        sumGrade = 0;
        numGrades = 0;
    }
    /**
     * Math for grades
     * @param newGrade for grade
     */
    public void addGrade(int newGrade){
        sumGrade = sumGrade + newGrade;
        numGrades +=1;
    }
    /**
     * getAverage to getAverage
     * @return to math for getAverage
     */
    public double getAverage(){
        return(double) sumGrade / numGrades;
        
    }
/**
 * toString to print the formated infromation
 */
    public String toString(){
        return String.format("%-10.10s %5d %7.2f", name, id, getAverage());
    }

}
