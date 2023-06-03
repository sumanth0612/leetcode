//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> a=new ArrayList<>();
        int i=0,sum=0,f=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while(sum>s){
                sum=sum-arr[i];
                i++;
            }
            if(sum==s && s!=0){
                f=1;
                a.add(i+1);
                a.add(j+1);
                break;
            }
            else if(s==0 && arr[j]==0){
                a.add(i+1);
                a.add(j+1);
                f=1;
                break;
            }
        }
        if(f==0){
            a.add(-1);
            return a;
        }
        return a;
        
    }
}