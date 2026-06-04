class Solution {
    public int diagonalSum(int[][]nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
                sum+=nums[i][i];
                sum+=nums[i][n-i-1];
            }
            if(n%2==1){
                sum-=nums[n/2][n/2];
            }
        return sum;
        
    }
}