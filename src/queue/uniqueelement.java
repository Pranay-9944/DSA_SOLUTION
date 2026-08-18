package queue;

import java.util.HashMap;
import java.util.Map;

public class uniqueelement {

  public  static  void  find(String s)

  {

      Map<Character,Integer> map = new HashMap<>();
      for (int i = 0; i < s.length(); i++) {
          {
              map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
          }

      }
      for (int i = 0; i < map.size(); i++) {
 if(map.get(s.charAt(i))==1)
 {
     System.out.println(s.charAt(i));
 }
      }


      System.out.println(map);
  }
    void main()
    {
        String a="aabccs";
        find(a);}
}
