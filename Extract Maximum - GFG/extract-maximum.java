//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.extractMaximum(S)); 
            t--;
        }
    } 
} 



// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        // code here
         ArrayList<Integer> arr=new ArrayList<Integer>();
        int len=S.length();
        String temp="";
        for(int i=0;i<len;i++)
        {
            char ch=S.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                temp+=""+ch;
            }
            else
            {
                if(temp.length()>0)
                {
                int value=Integer.parseInt(temp);
                arr.add(value);
                    
                }
                temp="";
            }
        }
       if(temp.length()!=0)
       {
       int value=Integer.parseInt(temp);
       arr.add(value);
       }
       int max=-1;
       int si=arr.size();
       for(int i=0;i<si;i++)
       {
           int r=arr.get(i);
           if(max<r)
           max=r;
       }
       return max;
    }    
} 
