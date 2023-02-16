// Java program to illustrate creating
// an array of objects

class Student {
    public int roll_no;
    public String name;

    public Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;

    }

    public int getRoll_no(){
        return  roll_no;
    }

    public String getName(){
        return  name;
    }
}

public class result{
    public static void main(String[] args) {
        // declaring object of 5 array
        Student[] arr = new Student[6];

        arr[0] = new Student(5,"Himanshu Kumar");
        arr[1] = new Student(3,"Raushani");
        arr[2] = new Student(1,"Priyanshu");
        arr[3] = new Student(4, "Aman");
        arr[4] = new Student(2, "Raushan");
        arr[5] = new Student(5,"Vikash");

        // accesing elemt using for loop

        for(int i=0; i <arr.length; i++){
            System.out.println("Roll Number : " + arr[i].getRoll_no() + " your name is :- " + arr[i].getName());
        }


    }
}


