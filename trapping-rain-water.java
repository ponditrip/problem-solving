//https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        if(n == 0){
           return 0; 
        }
        
        int[] max1 = new int[n];
        int[] max2 = new int[n];
        
        
        max1[0] = height[0];
        max2[n-1] = height[n-1];
        
        for(int i = 1; i < n; i++){
            max1[i] = Math.max(max1[i-1], height[i]);
        }
        
        for(int i = n-2; i >= 0; i--){
            max2[i] = Math.max(max2[i+1], height[i]);
        }
        
        int result = 0;
        for(int i=0; i < n; i++){
            int min = Math.min(max1[i], max2[i]);
            result += min - height[i];
        }
        
        return result;
    }
}    
