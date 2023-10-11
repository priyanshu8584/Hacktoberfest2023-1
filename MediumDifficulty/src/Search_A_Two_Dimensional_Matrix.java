class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        
      for(int i=0;i<m;i++)
      {
    
       for(int j=0;j<matrix[i].length;j++)
       {
                  int l=0;
       int u=matrix[i].length-1;

       while(l<=u)
       {
           int mid=(l+u)/2;
           if(target>matrix[i][mid])
           {
               l=mid+1;
           }
           else if(target<matrix[i][mid])
           {
               u=mid-1;
           }
           else if(target==matrix[i][mid])
           return true;
           
       }
      }
      }
      return false;  
    }
}
