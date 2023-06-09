//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        HashMap<Character,Integer> h=new HashMap<>();
        String res="";
         for(int i=0;i<S.length();i++){
            if(h.containsKey(S.charAt(i))){
                h.put(S.charAt(i),h.get(S.charAt(i))+1);
            }
            else{
                h.put(S.charAt(i),1);
                res+=S.charAt(i);
            }
        }
        return res;
    }
}