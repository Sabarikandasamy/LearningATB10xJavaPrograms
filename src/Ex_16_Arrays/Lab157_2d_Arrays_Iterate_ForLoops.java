package Ex_16_Arrays;

public class Lab157_2d_Arrays_Iterate_ForLoops {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4,5,6}, {7,8,9}};

         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 System.out.print(matrix[i][j]);
             }
             System.out.println(); //every row line will come
         }
    }
}
