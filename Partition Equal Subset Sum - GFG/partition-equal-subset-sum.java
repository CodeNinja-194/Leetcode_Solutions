//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int S=0;
        for(int i=0;i<N;i++)
        {
            S+=arr[i];
        }
        if (S % 2 == 0) 
        {
            S /= 2;
            boolean[] dp = new boolean[S + 1];
            dp[0] = true;
            for (int i = 0; i < N; i++) 
            {
                for (int j = S; j >= 0; j--) 
                {
                    if (j - arr[i] >= 0) 
                    {
                        dp[j] |= dp[j - arr[i]];
                    }
                }
            }
            return dp[S] ? 1 : 0;
        } else {
            return 0;
        }
    }
}