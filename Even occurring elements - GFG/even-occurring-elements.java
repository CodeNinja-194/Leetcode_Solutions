//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().repeatingEven(arr, n);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] repeatingEven(int[] arr, int n) {
        // code here
          HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
                
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()){
            int ans = map.get(i);
            if(ans%2==0){
                list.add(i);
            }
        }
       if(list.isEmpty()){
           int a[] = new int[1];
           a[0] = -1;
           return a;
       }
       int e[] = new int[list.size()];
       for(int i = 0; i<list.size(); i++){
           e[i] = list.get(i);
       }
       Arrays.sort(e);
       return e;
    }
}
