//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    String list[] = new String[n];
                    for(int i = 0;i<n;i++)
                        list[i] = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.countWords(list, n));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(list[i])){
                h.put(list[i],h.get(list[i])+1);
            }
            else{
                h.put(list[i],1);
            }
        }
        int c=0;
        for(String s:h.keySet()){
            if(h.get(s)==2){
                c+=1;
            }
        }
        return c;
    }
}