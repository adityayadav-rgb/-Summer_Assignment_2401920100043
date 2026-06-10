class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(m==0) return 0;
        for(int i=0;i<=n-m;i++){
            int j=0;   // increase the value if the chr match to both heystack and needle
            while(j<m){
                if(haystack.charAt(i+j)==needle.charAt(j)) j++;
                else break;
            }
        if(j==m) return i;
        }
        return -1;
    }
}