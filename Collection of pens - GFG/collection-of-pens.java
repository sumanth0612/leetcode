//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int A = Integer.parseInt(input[0]); 
            int B = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.minThirdPiles(A,B));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int minThirdPiles(int A, int B)
    {
        // code here
        int c=A+B+1;
        int r=1;
        while(!prime(c)){
            c++;
            r++;
        }
        return r;
    }
}