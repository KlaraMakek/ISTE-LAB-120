/**
 * Making clashes for 3 students with loops
 * @author Klara Makek
 * @version 12.10.2022.
 * Course: ISTE-120
 * Day 19
 */
 /**************JAVADOC************************/
import java.util.Scanner;

public class TestGrades {
    public static void main(String[] args) {

        //instigating scanner
        Scanner stu1 = new Scanner(System.in);
        //System print the Student 1
        System.out.print("\nStudent 1: ");
        //print name
        System.out.print("\nName: ");
        //scans name
        String name = stu1.nextLine();

        //prints id
        System.out.print("ID: ");
        //scans id
        int id = stu1.nextInt();
        //instigating student 
        Grades student = new Grades(name, id);

        //printing 1 grade
        System.out.print("Grade 1: ");
        //scanning 1 grade
        int grade1 = stu1.nextInt();
        //adding the grade so later we can calculate the average
        student.addGrade(grade1);
        //printing 2 grade
        System.out.print("Grade 2: ");
        //scanning 2 grade
        int grade2 = stu1.nextInt();
        //adding the 2 grade so later we can calculate the average
        student.addGrade(grade2);
        //printing 3 grade
        System.out.print("Grade 3: ");
        //scanning 3 grade
        int grade3 = stu1.nextInt();
        //adding the 3 grade so later we can calculate the average
        student.addGrade(grade3);
        //clearing out the trash
        stu1.nextLine();

        /* *********************     STUDENT 2 ******************************/

        //System print the Student 2
        System.out.print("\nStudent 2: ");
        //print name
        System.out.print("\nName: ");
        //scans name
        String name2 = stu1.nextLine();

        //prints id
        System.out.print("ID: ");
        //scans id
        int id2 = stu1.nextInt();
        //instigating student 
        Grades student2 = new Grades(name2, id2);

        //printing 1 grade
        System.out.print("Grade 1: ");
        //scanning 1 grade
        int grade12 = stu1.nextInt();
        //adding the grade so later we can calculate the average
        student2.addGrade(grade12);
        //printing 2 grade
        System.out.print("Grade 2: ");
        //scanning 2 grade
        int grade22 = stu1.nextInt();
        //adding the 2 grade so later we can calculate the average
        student2.addGrade(grade22);
        //printing 3 grade
        System.out.print("Grade 3: ");
        //scanning 3 grade
        int grade32 = stu1.nextInt();
        //adding the 3 grade so later we can calculate the average
        student2.addGrade(grade32);
        //clearing out the trash
        stu1.nextLine();

                /* *********************     STUDENT 3 ******************************/

        //System print the Student 2
        System.out.print("\nStudent 3: ");
        //print name
        System.out.print("\nName: ");
        //scans name
        String name3 = stu1.nextLine();

        //prints id
        System.out.print("ID: ");
        //scans id
        int id3 = stu1.nextInt();
        //instigating student 
        Grades student3 = new Grades(name3, id3);

        //printing 1 grade
        System.out.print("Grade 1: ");
        //scanning 1 grade
        int grade13 = stu1.nextInt();
        //adding the grade so later we can calculate the average
        student3.addGrade(grade13);
        //printing 2 grade
        System.out.print("Grade 2: ");
        //scanning 2 grade
        int grade23 = stu1.nextInt();
        //adding the 2 grade so later we can calculate the average
        student3.addGrade(grade23);
        //printing 3 grade
        System.out.print("Grade 3: ");
        //scanning 3 grade
        int grade33 = stu1.nextInt();
        //adding the 3 grade so later we can calculate the average
        student3.addGrade(grade33);
        //clearing out the trash
        stu1.nextLine();
        
        stu1.close();

        /**
         * printing the students info
         */
        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

    }
}
