//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String N = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.divisibleBy5(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int divisibleBy5(String N){
        // code here
        int rem = 0;
        for(int i = 0;i<N.length();i++){
            int d = N.charAt(i) - '0';
            rem = (rem * 10 + d) % 5; 
        }
            return rem==0?1:0;
    }
}