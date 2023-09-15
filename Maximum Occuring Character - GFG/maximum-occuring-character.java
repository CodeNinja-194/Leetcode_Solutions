//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String str)
    {
        // Your code here
      int c[]=new int[26];
      int idx,n=str.length();
      for(int i=0;i<n;i++)
      {
          idx=str.charAt(i)-'a';
          c[idx]++;
      }
      int max=-1,result=0;
      for(int i=0;i<26;i++)
      {
          if(c[i]>max)
          {
              max=c[i];
              result=i;
          }
      }
      int a=result+'a';
      return (char)a;
    }
    
}