//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String a = sc.next ();
            String b = sc.next();
            Solution obj = new Solution();
    		System.out.println (obj.check (a, b));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    int check (String a, String b)
    {
        // your code here
        if(a.equals(b))return 3;
        double s1=Double.parseDouble(a);//124
        double s2=Double.parseDouble(b);//123
        if(s1<s2) return(int)1;
        else if(s2<s1) return (int) 2;
        return 3;
    }
}