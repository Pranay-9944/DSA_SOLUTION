package String_DSa;

public class displacment {
// displacment formula is (x^2 -y^2)=shortes path
public static float cal(String path)
{
    int y=0,x = 0;

    for (int i = 0; i < path.length(); i++) {
        char dir=path.charAt(i);
        if( path.charAt(i)== 'n')
        {
               y++;
        }
        else if(dir=='s')
        {
            y--;

        } else if (dir=='e') {

            x++;

        }
        else{
            x--;
        }
    }

    float x2=x*x;
    float y2=y*y;
    return (float) Math.sqrt(x2+y2);
}
    public  static void main (String[] args)
    {
      String path="ns";
        System.out.println(cal(path));
    }
}
