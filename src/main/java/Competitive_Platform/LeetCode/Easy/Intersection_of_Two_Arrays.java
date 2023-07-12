package Competitive_Platform.LeetCode.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    static public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        System.out.println(set);
        Set<Integer> common=new HashSet<Integer>();
        for(int i:nums2){
            if(set.contains(i)){
                common.add(i);
            }
        }
        System.out.println(common);
        int[] arr=new int[common.size()];
        int index=0;
        for(int i:common){
            arr[index++]=i;
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println(intersection(new int[]{1,2,2,1},new int[]{9,4,9,8,4}));
    }
}
