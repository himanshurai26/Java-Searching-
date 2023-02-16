import java.util.Arrays;

public class SearchInString {
    // Liear search in string

    public static void main(String[] args){

        String name = "Himanshu ";
        char target = 's';

       // System.out.println(searchString(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchString(String str, char target){
        if(str.length() == 0) {
            return false;

        }
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == target ){
                    return true;
                }
            }
            return false;

    }
}
