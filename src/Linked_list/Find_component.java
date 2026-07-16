//package Linked_list;
//
//import java.util.*;
//
//public class Find_component {
//     public static void find(LinkedList<Integer> list, int[] nums) {
//             int count = 0;
//             HashSet<Integer> set = new HashSet<>();
//             for (int o : nums) {
//                 set.add(o);
//             }
//         for (int i = 0; i < list.size(); i++) {
//
//             if (set.contains(list.get(i)) ) {
//
//                 if(i==list.size()-1 || !set.contains(list.get(i+1))) {
//                     count++;
//                 }
//             }
//
//         }
//         System.out.println(count);
//     }
//
//    public static void main(String[] args) {
//
//        LinkedList<Integer> list = new LinkedList<>();
//
//        for (int i = 5; i > 0; i--) {
//            list.addFirst(i);
//        }
//
//      int[] nums={2,3,4};
//        find(list,nums);
//    }
//}