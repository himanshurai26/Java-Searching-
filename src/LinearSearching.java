
public class LinearSearching {
    public static void main(String[] args) {
    int[] nums = {4, 65, 43, 64, 23, 75, 23, 42};
    int target = 75;
    int result = Searching(nums,target);

        System.out.println(result);
        System.out.println(linearSearch(nums,target));
    }


    // searching the target and return true or false




    // search the target and return the element
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }

        // run for loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    // otherwise if the items not found return -1
    static int Searching(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
       }

        // using a for loop
        for(int index=0; index < arr.length; index++){
            // checking for elemt for every index if it is = target
            int element = arr[index];

            if(element == target){
                return index;
            }
        }

        // this line will excute if none of the return statement above have excuted
        // hence the target not found

return -1;
    }
}
