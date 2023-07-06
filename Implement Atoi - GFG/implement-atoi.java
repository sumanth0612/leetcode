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
    int at(int id,String str,int n){
        if(id==str.length()){
            return n;
        }
        if(Character.isDigit(str.charAt(id))==false){
            return -1;
        }
        return at(id+1,str,(n*10)+Integer.parseInt(str.charAt(id)+""));
        
    }
    int atoi(String str) {
	int n=0;
	if(str.charAt(0)=='-'){
	   n= at(1,str,0);
	   if(n!=-1)
	   n=n*-1;
	}
	else{
	    n=at(0,str,0);
	}
	return n;
    }
}
