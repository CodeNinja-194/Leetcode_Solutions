//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)
		     arr[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    obj.SortedDuplicates(arr, n);
		    System.out.println();  // print the newline
		    
		}
	}
}




// } Driver Code Ends
//User function Template for Java

/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/
class Geeks
{
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : arr){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        HashSet<Integer> l1 = new HashSet<>();
        for(int val : arr){
            if(map.get(val)>1){
                l1.add(val);
                
            }
        }
        ArrayList<Integer> l2 = new ArrayList<>(l1);
        Collections.sort(l2);
        for(int i : l2){
            System.out.print(i + " ");
        }
        if(l2.isEmpty()){
            System.out.print(-1);
     }
    }
    
}
   

//{ Driver Code Starts.

// } Driver Code Ends