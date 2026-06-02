class Solution {
    public int maxSubArray(int[] nums) {
      int n=nums.length;
      int m=Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<n;i++){
        sum=sum+nums[i];
         m=Math.max(sum,m);
       if(sum<0) sum=0;
      }return m;

    }
};