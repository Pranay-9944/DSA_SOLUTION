package ArrayLits;

public class container_with_most_water {
    void main(String[] args)
    {
        int[] arr= {2,1,7,1,5,6,8};

        int i=0;
        int area=0;
        int j= arr.length-1;
        while(i<j)
        {
            int min1=Math.min(arr[i],arr[j])*(j-i);
            area=Math.max(area,min1);
            if(arr[i]>arr[j])
            {

                j--;

            }
            else

            {
                i++;
            }
        }


        System.out.println(area);
        }


    }

