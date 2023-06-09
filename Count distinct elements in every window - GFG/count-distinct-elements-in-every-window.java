//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<k;i++){
            if(h.containsKey(A[i])){
                h.put(A[i],h.get(A[i])+1);
            }
            else{
                h.put(A[i],1);
            }
        }
        int j=0;
        al.add(h.size());
        for(int i=k;i<n;i++){
            if(h.containsKey(A[i])){
                h.put(A[i],h.get(A[i])+1);
            }
            else{
                h.put(A[i],1);
            }
            if(h.get(A[j])==1){
               h.remove(A[j]); 
            }
            else{
                h.put(A[j],h.get(A[j])-1);
                }
            j++;
            
            al.add(h.size());
        }
        return al;
    }
}

