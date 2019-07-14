//https://leetcode.com/problems/rotate-array/

//Arrays.copyOf(arr, length) --> creates and array of size length,and copies and elements into it
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] c= new int[n];
     for(int i=0;i<k;i++)
     {
         int x= nums[n-1];
         for(int j=n-1;j>0;j--)
         {
             nums[j]= nums[j-1];
         }
         nums[0]=x;
     }
    }
}


///////Version: 2
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] c= new int[n];
     for(int i=0;i<n;i++)
     {
        c[(i+k)%n]=nums[i];
     }
        for(int i=0;i<n;i++)
            nums[i]=c[i];
    }
}


//vesion 3

// Original List                   : 1 2 3 4 5 6 7
// After reversing all numbers     : 7 6 5 4 3 2 1
// After reversing first k numbers : 5 6 7 4 3 2 1
// After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}