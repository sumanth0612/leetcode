//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    long powr(long n,long r,long sum,long b){
        if(r==0){
            return sum;
        }
        if(r%2==0){
            n=(n*n)%b;
            r=r/2;
        }
        else{
            sum=(n*sum)%b;
            r=r-1;
        }
        return powr(n,r,sum,b);
    }
    long power(int N,int R)
    {
        //Your code here
    long b=(long)Math.pow(10,9)+7;
    long a=powr(N,R,1,b);
    return a;
    }

}
