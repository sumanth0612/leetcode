//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public void per(String S,StringBuilder sb,List<String> l,boolean[] arr){
        if(S.length()==sb.length()){
            String str=sb.toString();
            if(!l.contains(str)){
                l.add(str);
            }
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                sb.append(S.charAt(i));
                per(S,sb,l,arr);
                arr[i]=false;
                sb.delete(sb.length()-1,sb.length());
            }
        }
    }
    public List<String> find_permutation(String S) {
        List<String> l=new ArrayList<>();
        char ch[]=S.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb=new StringBuilder();
        boolean arr[]=new boolean[S.length()];
        per(new String(ch),sb,l,arr);
        return l;
        
    }
}