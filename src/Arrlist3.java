import java.util.*;
public class Arrlist3 {

    public static void main(String[] args) {

        // create an ArrayList  which going to
        // contains a list of studet names which is
        // actully

        ArrayList<String> students = new ArrayList<String>();

        // adding elemet to the arar
        students.add("Himanshu");
        students.add("Priyanshu");
        students.add("Rohit");
        students.add("Student Union");
        students.add("Vidhayakk");

        // printing the element

        // using for each loop

        students.forEach((display) -> print(display));

        // printinf studnet name


    }

    public static void print(String display){
        System.out.println("Student name is " + display);
    }
}
