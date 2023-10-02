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
            
            String a = sc.next();
            String b = sc.next();
            Solution ob = new Solution();
            if(ob.isSubSequence(a,b))
            System.out.println(1);
            else
            System.out.println(0);
 		
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    boolean isSubSequence(String s, String t){
        int i = 0 , j = 0;
        int n = t.length(),m = s.length(); 
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        if(m < 1)   
            return true;
        while(i < n)
        {
            if(tt[i] == ss[j])
            {
                j++;
            }
            i++;
        if(j==m)    
            return true;
        }
        return false;
    }
}