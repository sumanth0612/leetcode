//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            Solution ob = new Solution();
            
            res = ob.combinationSum(list, sum);
            if (res.size() == 0) {
    			out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 out.print(" ");
    				}
    				out.print(")");
    			}
    		}
    		out.println();
    		res.clear();
	    }
	    out.flush();
    }
    
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    public static void combsum(int id,ArrayList<Integer> A,int B,ArrayList<ArrayList<Integer>> al,ArrayList<Integer> l){
        if(id==A.size()){
            if(B==0){
                al.add(new ArrayList(l));
            }
            return;
        }
        if(A.get(id)<=B){
            B=B-A.get(id);
            l.add(A.get(id));
            combsum(id,A,B,al,l);
            B+=l.get(l.size()-1);
            l.remove(l.size()-1);
        }
        combsum(id+1,A,B,al,l);
        
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        Set<Integer> set = new HashSet<>(A);
        A.clear();
        for(int i:set){
            A.add(i);
        }
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        combsum(0,A,B,al,l);
        
        return al;
    }
}