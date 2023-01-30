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
            new Solution().segregate0and1(arr, n);
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
    void segregate0and1(int[] arr, int n) {
        // code here
        int l=0;
        int h=arr.length-1;
        
        while(l<h)
        {
            if(arr[l]==0)
            {
                l++;
            }
            else if(arr[h]==1)
            {
                h--;
            }
            else
            {
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                l++;
                h--;
            }
            
            
            
        }
        
        
    }

}
