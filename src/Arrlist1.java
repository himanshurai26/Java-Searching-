import java.util.ArrayList;
public class Arrlist1 {

    public static void main(String[] args) {

        int n = 6;
        ArrayList<Integer> arrlist = new ArrayList<>(n);

        for(int i = 0; i <n; i++){
            arrlist.add(i);
        }
        System.out.println(arrlist);

   arrlist.remove(3);
        System.out.println(arrlist);

        arrlist.set(3,5);

        // printing element one by one
        for(int i=0; i<arrlist.size(); i++){
            System.out.println(
                    arrlist.get(i) + " "
            );
        }

        System.out.println(arrlist);

        System.out.println("Himanshu kUmar Rai");
        // runing arraylist i reversse order
        // it makes code more efffective

        // here leave the aarraylsi now creste simple array

        int arr[] = {32,54,75,65,3,55};
        for(int i = 0; i < arr.length-1;i--){
            System.out.println(arr[i]);
        }

    }

}
