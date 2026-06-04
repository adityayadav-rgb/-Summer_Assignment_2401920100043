class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m =arr.length,n=arr[0].length;
       List<Integer> sol =new ArrayList<>();
        int minrow=0,maxrow=m-1;
        int mincol=0,maxcol=n-1;
        while(minrow<=maxrow && mincol<=maxcol){
            //1st row k liye 
            for(int j=mincol;j<=maxcol;j++){
            sol.add(arr[minrow][j]);
            } minrow++;
            if(minrow>maxrow||mincol>maxcol) break ;

            //last col k liye 
            for(int i=minrow;i<=maxrow;i++){
           sol.add(arr[i][maxcol]);
            } maxcol--;
            if(minrow>maxrow||mincol>maxcol) break ;
            //last row k liye 
             for(int j=maxcol;j>=mincol;j--){
             sol.add(arr[maxrow][j]);
            } maxrow--;
            if(minrow>maxrow||mincol>maxcol) break ;
            // last col loop ka 
             for(int i=maxrow;i>=minrow;i--){
            sol.add(arr[i][mincol]);
            } mincol++;
            

            
            

        }
        return sol;
    }
}