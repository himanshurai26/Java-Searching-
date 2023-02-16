public class Array2D {

    public static void main(String[] args) {
        int[][] arr2d = {
                {2,3,5,6,4,3},
                {5,3,8,6,34,3},
                {3,7,3,3,6,8,2,1}
        };

        for (int i = 0; i < 8; i++) {
            for (int j= 0; j < 6; j++) {
                System.out.print(arr2d[i][j] + " ");


            }

            System.out.println();
        }
;
    }
}
