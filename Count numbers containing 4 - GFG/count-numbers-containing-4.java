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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countNumberswith4(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countNumberswith4(int N) {
        // code here
         int c = 0;
         for(int i=1;i<=N;i++)
         {
            int t=i;
            while(t>0)
            {
                if(t%10==4)
                {
                    c++;
                    break;
                }
                t/=10;
            }
         }
        return c;
    }
};