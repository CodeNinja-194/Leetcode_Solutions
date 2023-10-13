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
            String[] S=read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(String.format("%.3f",ob.findArea(A,B,C)));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    double findArea(int A,int B,int C){
        //code here
    if (A == 0 || B == 0 || C == 0)
      return 0;
    double S = (double) (A + B + C) / 2;
    double area = S * (S - A) * (S - B) * (S - C);
    if (area < 0)
      return 0;
    return Math.sqrt(area);
    }
};