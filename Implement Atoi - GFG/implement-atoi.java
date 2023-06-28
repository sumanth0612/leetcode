//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	int res=0,f=0;
	for(int i=0;i<str.length();i++){
	    if((Character.isDigit(str.charAt(i))==false && str.charAt(i)!='-') || f>1 || (str.charAt(i)=='-' && i!=0)){
	        return -1;
	    }
	    if(str.charAt(i)=='-'){
	        f+=1;
	    }
	    else
	    res=res*10+(Integer.parseInt(str.charAt(i)+""));
	}
	if(f==1)
	res=res*-1;
	return res;
    }
}
