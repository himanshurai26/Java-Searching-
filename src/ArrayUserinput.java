import java.util.Scanner;
public class ArrayUserinput {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for(int i=0; i < myIntegers.length; i++){
            System.out.println("Element " + i + " typed value was " + myIntegers);
        }

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return  values;
    }
}
