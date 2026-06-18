package TWO_D_array;

public class starecasesearch
{
    public  static boolean starecase(int mat[][] , int key)
    {
        int row=0;
        int col=mat[0].length-1;

        while( row<mat.length  &&  col>=0)
        {
              if(mat[row][col]==key)
              {
                  System.out.println("foud at ("+row+","+col+")");
                  return  true;
              } else if (key<mat[row][col])
              {
               col--;
              }
              else {
                  row++;
              }

        }
        System.out.println("key not found");
        return  false;
    }

    public  static void   main (String args[])
    {
        int  key=3;
        int[][] mat={
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,3,4,}

        };
        starecase(mat,key);
    }
}
