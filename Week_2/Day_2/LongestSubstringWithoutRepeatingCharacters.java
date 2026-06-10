class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxLen=0;
        HashSet<Character>st=new HashSet<>();
        for(int right=0;right<s.length();right++){
           while(st.contains(s.charAt(right))){
              st.remove(s.charAt(left));
              left++;
           }
           st.add(s.charAt(right));
           maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}