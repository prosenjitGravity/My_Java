package Competitive_Platform.LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays_II {
    static public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        Set<Integer> set2=new HashSet<>();
        for(int i:nums2){
            set2.add(i);
        }
        Set<Integer>common=new HashSet<>();
        for(int i:set){
            common.add(i);
        }

        System.out.println(set);
        System.out.println(set2);
        System.out.println(common);
        return null;
    }
    public static void main(String[] args){
        System.out.println(intersect(new int[]{1,2,2,1},new int[]{2,2}));
    }
}
