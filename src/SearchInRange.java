public class SearchInRange {

    // Search the target number in between index 1 to 5

    public static void main(String[] args) {
        int[] nums = {13,54,64,32,34,76,23,856,24,64,29,04};
        int target = 54;

        int result = Rangesearch(nums,target, 2,7);
        System.out.println(result);

    }

    static int Rangesearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        // otherwise run the for loop
        for(int index = start; index <= end; index++){
            // check for element at every index if is == target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
