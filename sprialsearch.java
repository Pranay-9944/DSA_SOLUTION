import java.util.Scanner;

public class sprialsearch {

    public static   int search(int mat[][])
    {
int in;
boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  element to search");
       in= sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {


                if(in==mat[i][j])
                {
                    flag=true;
                   break;
                }



            }


        }
        if(flag)
        {
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        return -1;
    }






    public  static  void main(String[] args)
    {
        int[][] mat={
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,3,4,},
                {1,2,3,4,}

        };
        search(mat);
    }
}
