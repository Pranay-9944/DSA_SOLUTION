package TWO_D_array;


public class secondRowSum {


     static  int sec(int mat[][])
     {
     int sum=0;
         for (int i = 0; i < mat[1].length; i++) {
             sum+=mat[1][i];

         }
         return sum;
     }

    public static void main(String[] args) {


        int[][] mat={
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,7,4,},
                {1,2,3,7,}


        };
        System.out.println(sec(mat));
    }
}
