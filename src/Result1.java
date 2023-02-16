// Java program to illustrate creating
// an array of object

 class Student1 {
    public String name;
    public int age;

    Student1(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return name;

    }

    public int getAge()
    {
        return age;
    }
}

public class Result1{
    public static void main(String[] args) {
        // declarig an aaray and initializing the element of the array

        Student1[] mystudent = new Student1[]{
               new Student1("Himanshu",3), new Student1("Raushani", 4), new Student1("Rohit", 7)
        };

        // accesing the elelmet

        for (Student1 s:
           mystudent  ) {

            System.out.println(s);

        }
    }
}
