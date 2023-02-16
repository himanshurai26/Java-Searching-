public class Findmin {
    public static void main(String[] args) {

        int[] nums = {2,43,24,14,54,13,42};
        System.out.println(min(nums));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(arr[i] < ans){
                // for maximum we can use  > sign instead of <
                ans = arr[i];
            //}else
         //   {
              //  return ans;
           }
        }
       // return -1;
            return ans;
    }
}
