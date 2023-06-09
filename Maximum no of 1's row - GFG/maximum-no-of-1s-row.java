//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int m=0;
        int id=0;
        int c=0,s=0;
        for(int i=0;i<N;i++){
            s=0;
            for(int j=M-1;j>=0;j--){
                if(Mat[i][j]==1)
                s+=1;
                else
                break;
            }
            if(s>m){
                m=s;
                id=i;
            }
            
        }
        return id;
    }
}