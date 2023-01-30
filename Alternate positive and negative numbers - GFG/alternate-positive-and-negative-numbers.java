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

            new Solution().rearrange(arr, n);
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
    void rearrange(int arr[], int n) {
        // code here

        List<Integer> positive= new ArrayList<Integer>();
        List<Integer> negative=new ArrayList<Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                positive.add(arr[i]);
            }
            else if(arr[i]<0)
            {
                negative.add(arr[i]);
            }
        }
        
        
        
       int i=0,j=0;  
        
       while(i<n)
       {
           if(j<positive.size())
           {
            arr[i++]=positive.get(j);
           
           
           }
          
           if(j<negative.size())
           {
           arr[i++]=negative.get(j);
           }
          
          j++;
       }
        
        
       
    }
}