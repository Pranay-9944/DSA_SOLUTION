package TWO_D_array;

import java.util.Scanner;

public class largein2d {
    public static void main (String a[])
    {

        int mat[][]= new int[4][4];
        int min=mat[0][0];
        int max=mat[0][0];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]= sc.nextInt();

            }


        }
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " " );

            }
            System.out.println();


        }

        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if(mat[i][j]< min)
                {
                    min=mat[i][j];
                }

                if(mat[i][j]>max)
                {
                    max=mat[i][j];
                }
            }
            }

        System.out.println(min);
        System.out.println(max);







    }
}
