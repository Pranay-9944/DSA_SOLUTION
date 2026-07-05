import java.util.regex.MatchResult;

public class Trapping_water {
    public static int findwater(int[] height)
    {
        int n= height.length;
        int[] prefixright=new int[height.length];
        int[] prefixleft=new int[height.length];
        prefixleft[0]=height[0];
        prefixright[n-1]=height[n-1];


        for (int i = 1; i < n; i++) {
            prefixleft[i] = Math.max(prefixleft[i - 1], height[i]);

        }
        for (int i = n-2; i >= 0; i--) {
            prefixright[i]=Math.max(prefixright[i+1],height[i]);
    }

        int total=0;
        for (int i = 0; i < n; i++) {

            total+=Math.min(prefixleft[i],prefixright[i])-height[i];

        }
        return total;





    }
    void main()
    {
        int[]  height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(  findwater(height));;
    }
}
