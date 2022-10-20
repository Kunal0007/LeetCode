package com.company.LeetCode;

// https://leetcode.com/problems/trapping-rain-water/

public class TrappingWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    static public int trap(int[] height) {
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int res = 0;

        lmax[0] = height[0];
        rmax[height.length - 1] = height[height.length - 1];

        for(int i = 1; i < height.length - 1; i++){
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }

        for(int i = height.length - 2; i >= 0; i--){
            rmax[i] = Math.max(height[i], rmax[i + 1]);
        }

        for(int i = 1; i < height.length - 1; i++){
            res += Math.min(lmax[i], rmax[i]) - height[i];
        }

        return res;


//         int res = 0;
//         int left = 0;
//         int right = height.length - 1;
//         int maxl = 0, maxr = 0;

//         while(left < right){

//             if(height[left] < height[right]){
//                 if(height[left] >= maxl) maxl = height[left];
//                 else res += maxl - height[left];
//                 left++;
//             }
//             else {
//                 if(height[right] >= maxr) maxr = height[right];
//                 else res += maxr - height[right];
//                 right--;
//             }

//         }

//         return res;

    }

}
