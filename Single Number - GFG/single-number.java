//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getSingle(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int getSingle(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int x : arr)
        {
            hm.put(x, (hm.getOrDefault(x,0) + 1) % 2);
        }
        
        for(int y : hm.keySet())
        {
            if(hm.get(y) == 1){
                return y;
            }
        }
        
        return 0;
    }
}