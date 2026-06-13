package file;

public class print7 {

    public static  int seven(int mat[][])
    {
        int count=0;
        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if(mat[i][j]== 7 )
                {
                    count++;
                }

            }

        }

        return count;
    }
    public  static void main(String args[])
    {
        int[][] mat={
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,7,4,},
                {1,2,3,7,}


        };
        seven(mat);
    }
}
