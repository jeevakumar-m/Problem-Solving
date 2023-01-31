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

            new Solution().segregateEvenOdd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
        List<Integer> evenList=new ArrayList<Integer>();
        List<Integer> oddList=new ArrayList<Integer>();
        
        for(int i:arr)
        {
            if(i%2==0)
            {
                evenList.add(i);
            }
            else
            {
                oddList.add(i);
            }
        }
        
        Collections.sort(evenList);
        Collections.sort(oddList);
        
        for(int i=0;i<n;i++)
        {
            if(i<evenList.size())
            {
                arr[i]=evenList.get(i);
            }
            else
            {
                arr[i]=oddList.get(i-evenList.size());
            }
            
        }
        
    }
}