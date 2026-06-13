class Solution {
    public void helper(List<String> res,String curr,int o,int c,int n){
        if(curr.length()==2*n){
            res.add(curr);
            return ;
        }
        if(o<n){
              helper(res,curr+"(",o+1,c,n);
        }
        if(c<o){
             helper(res,curr+")",o,c+1,n);
            
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
         helper(res,"",0,0,n);
         return res;
    }
}