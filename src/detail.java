public class detail {
    public static void main(String[] args) {
        // declares an Array of Integers

        Student[] arr;

        // allocation memory for 5 objects of type Student;

        arr = new Student[5];

        arr[0] = new Student(1, "Himanshu Kumar");
        // intializing the first element

        arr[1] = new Student(2, "Roshani KUmari");
        // intializing the 2nd element;

        // like pprivous one

        arr[2] = new Student(3, "Raunak");
        arr[3] = new Student(4, "Rahul");
        arr[4] = new Student(5, "Rohit Kumar");

        // accesing the elemty of specified Array

        for (int index = 0; index < arr.length; index++) {
            System.out.println("Element at " + index + " : " + arr[index].roll_no + " " + arr[index].name);




        }
        System.out.println("Loop Completed, Stop the loop");
    }
}
