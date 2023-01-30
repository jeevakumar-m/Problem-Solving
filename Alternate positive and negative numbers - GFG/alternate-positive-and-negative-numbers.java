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

       ArrayList<Integer> liP = new ArrayList<>();   // For Storing Positive Numbers

        ArrayList<Integer> liN = new ArrayList<>();   // For Storing Negative Numbers

        

        for(int i=0;i<n;i++){

            if(arr[i]>=0)

                liP.add(arr[i]);

        }

        

        for(int i=0;i<n;i++){

            if(arr[i]<0)

                liN.add(arr[i]);

        }

        

        int i=0,j=0;

        while(i<n){

            if(j<liP.size())

                arr[i++]=liP.get(j);

            if(j<liN.size())

                arr[i++]=liN.get(j);

            j++;

        }
        
       
    }
}