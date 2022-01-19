package TryCatchEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            a.add(nums1[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(a.contains(nums2[i])) {
                if(res.contains(nums2[i]))
                    continue;
                res.add(nums2[i]);
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
    }
}
