package TWO_D_array;

public class transpose {

    public static   void transposematrix(int mat[][])
    {

        int[][] transe= new int[mat.length][mat[0].length];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                transe[j][i]=mat[i][j];

            }

        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(transe[i][j] + " ");

            }

        }




    }
    public  static void main(String[] args)
    {
        int[][] mat={
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,7,4,},
                {1,2,3,7,}



        };
        transposematrix(mat);
}
}
