class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char ele:p.toCharArray()){
            freq1[ele-'a']++;
        }
        for(int i=0;i<s.length();i++){
            freq2[s.charAt(i)-'a']++;
            if(i>=p.length()){
                freq2[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(freq1,freq2)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}