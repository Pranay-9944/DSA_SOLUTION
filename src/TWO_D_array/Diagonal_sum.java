package TWO_D_array;

public class Diagonal_sum {
    
    public static void diagonalmatrix(int mat[][])
    {
//        int sum=0;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//
//                if(i==j)
//                {
//                    sum+=mat[i][j];
//                } else if (i+j== mat.length-1) {
//                    sum+=mat[i][j];
//
//                }
//            }
//
//        }
//        System.out.println(sum);

        int sum=0;
        for (int i = 0; i < mat.length; i++) {

            //pd
            sum+=mat[i][i];

            //sd
            if(i!=mat.length-1-i)
             sum+=mat[i][mat.length-1-i];


        }
        System.out.println(sum);
    }
    
    public static void main(String[] args)
    {
        int[][] mat={
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,3,4,}
                
        };
        
        diagonalmatrix(mat);
    }
}
