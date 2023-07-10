//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            
            int arr[] = new int[N];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < N; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.ternarySearch(arr, N, K));
        }
    }
}
// } Driver Code Ends



class Solution{
    static int bin(int[] arr,int l,int h,int k){
        if(l>h){
            return -1;
        }
        int mid=(l+h)/2;
        if(arr[mid]==k){
            return 1;
        }
        if(k<arr[mid]){
            h=mid-1;
        }
        else if(k>arr[mid]){
            l=mid+1;
        }
        return bin(arr,l,h,k);
    }

    static int ternarySearch(int arr[], int N, int K)
    {
        // Your code here
        return bin(arr,0,N-1,K);
    }
}