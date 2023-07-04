//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] candidates = new int[n];
            for (int i = 0; i < n; i++) candidates[i] = sc.nextInt();

            Solution obj = new Solution();
            List<List<Integer>> ans = obj.combinationSum2(candidates, k);
            Collections.sort(ans, new Comparator<List<Integer>>() {
                @Override   public int compare(List<Integer> a, List<Integer> b) {
                    int al = a.size();
                    int bl = b.size();
                    int min = Math.min(al, bl);
                    for (int i = 0; i < min; i++) {
                        if (a.get(i) < b.get(i))
                            return -1;
                        else if (a.get(i) > b.get(i))
                            return 1;
                    }
                    if (al < bl)
                        return -1;
                    else if (al > bl)
                        return 1;
                    return -1;
                }
            });
            System.out.print("[ ");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print("[ ");
                for (int j = 0; j < ans.get(i).size(); j++)
                    System.out.print(ans.get(i).get(j) + " ");
                System.out.print("]");
            }
            System.out.println(" ]");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static void combsum(int id,int[] a,int s,List<List<Integer>> al,List<Integer> l){
        if(id==a.length){
            if(s==0){
                if(al.contains(l)==false)
                al.add(new ArrayList(l));
            }
            return ;
        }
        if(a[id]<=s){
            s-=a[id];
            l.add(a[id]);
            combsum(id+1,a,s,al,l);
            s+=l.get(l.size()-1);
            l.remove(l.size()-1);
        }
        if(id+1==a.length || a[id+1]<=s || s==0)
        combsum(id+1,a,s,al,l);
        
    }
    public static List<List<Integer>> combinationSum2(int[] a, int s) {
        Arrays.sort(a);
        List<List<Integer>> al=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        combsum(0,a,s,al,l);
        return al;
    }
}