public class ReverseArray {
    public static void Reversearr(int[] arr, int start, int end){

        int temp;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = arr[start];
            start ++;
            end --;
        }
    }

    //        Utility that prints out on arry on a line

    public static void  printArray(int[] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Drive code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        Reversearr(arr, 0, 5);
        System.out.print("Reverse array is \n");
        printArray(arr, 6);
    }

}
