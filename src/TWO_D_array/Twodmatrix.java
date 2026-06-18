package TWO_D_array;

import java.util.Scanner;

public class Twodmatrix {


    public static void main(String[] args)
    {
        int mat[][]= new int[3][3];
        int m= mat.length , n=mat[0].length;

        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j=0;j<m;j++)

            {
                mat[i][j]= sc.nextInt();
            }

        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
                
            }
            System.out.println();
            
        }
    }
}
