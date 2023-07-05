//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
void subset(int id, vector<int>& A, vector<vector<int>>& al, vector<int>& l) {
    if (A.size() == id) {
        al.push_back(l);
        return;
    }
    l.push_back(A[id]);
    subset(id + 1, A, al, l);
    l.pop_back();
    subset(id + 1, A, al, l);
}

vector<vector<int>> subsets(vector<int>& A) {
    vector<vector<int>> al;
    vector<int> l;
    subset(0, A, al, l);
    sort(al.begin(), al.end());
    return al;
}

};

//{ Driver Code Starts.

int main()
{
	int t;
	cin >> t;

	while (t--)
	{
		int n, x;
		cin >> n;

		vector<int> array;
		for (int i = 0; i < n; i++)
		{
			cin >> x;
			array.push_back(x);
		}
        
        
        Solution ob;
		vector<vector<int> > res = ob.subsets(array);

		// Print result
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res[i].size(); j++)
				cout << res[i][j] << " ";
			cout << endl;
		}

		
	}

	return 0;
}
// } Driver Code Ends