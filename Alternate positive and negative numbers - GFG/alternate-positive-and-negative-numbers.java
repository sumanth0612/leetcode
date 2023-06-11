//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                a2.add(arr[i]);
            }
            else{
                a1.add(arr[i]);
            }
        }
        int i=0;
        while(a1.size()>0 && a2.size()>0){
            arr[i]=a1.get(0);
            a1.remove(0);
            i++;
            arr[i]=a2.get(0);
            a2.remove(0);
            i++;
        }
        while(a1.size()>0){
            arr[i]=a1.get(0);
            a1.remove(0);
            i++;
        }
        while(a2.size()>0){
            arr[i]=a2.get(0);
            a2.remove(0);
            i++;
        }
    }
}