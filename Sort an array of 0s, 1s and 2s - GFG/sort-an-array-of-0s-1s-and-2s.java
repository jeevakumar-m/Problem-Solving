//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        Map<Integer,Integer> numCount= new HashMap<>();
        int z=0;
        int o=0;
        int t=0;

        for(int j:a)
        {
            numCount.put(j,numCount.containsKey(j)?numCount.get(j)+1:1);
        }
        
        z=numCount.get(0);
        o=numCount.get(1);
        t=numCount.get(2);
        
 
        for(int i=0;i<a.length;i++)
        {
            if(z>0)
            {
                a[i]=0;
                z--;
            }
            else
            {
                if(o>0)
                {
                    a[i]=1;
                    o--;
                }
                else
                {
                    if(t>0)
                    {
                        a[i]=2;
                        t--;
                    }
                }
            }
        }
        
        
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends