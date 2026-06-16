class Solution {
    public int compress(char[] chars) {
        int count=1,j=1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]) count++;
            else{
                 if(count>1){
                    String s=String.valueOf(count);
                    for(char ch:s.toCharArray()) chars[j++]=ch;
                  }
                   count=1;
                 chars[j++]=chars[i+1];
            }
        }
             if(count>1){
                    String s=String.valueOf(count);
                    for(char ch:s.toCharArray()) chars[j++]=ch;
                  }
        return j;
    }
}
