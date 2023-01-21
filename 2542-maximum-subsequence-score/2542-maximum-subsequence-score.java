class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] a = new int[nums1.length][2]; 

        //combining the two arrays to form items.
        for(int i=0;i<nums1.length;i++){
            //nums1 is the array from which we have to take the sum of k items.
            a[i][0]=nums1[i]; //let's call it sum value.
            //nums2 is the array from which we have to take the minimum value of k items.
            a[i][1]=nums2[i]; //let's call it product value.
        }
        
        //Sort items on the basis of product values in descending order
        //if two items have same product values, sort them on the basis of sum value in descending order.
        Arrays.sort(a,(a1,b1) -> b1[1]==a1[1]?Integer.compare(b1[0],a1[0]):Integer.compare(b1[1],a1[1]));
        
        //head of priority queue will be the item with smallest sum value and
        // there will be exactly k items in the queue at a time while calculating result.
        PriorityQueue<int[]> queue = new PriorityQueue<>((a1,b1)->Integer.compare(a1[0],b1[0]));
    
        int min=Integer.MAX_VALUE;
        long sum=0, res=0;
        //add k items with largest product value in queue
        for(int i=0;i<k;i++){
            min=Math.min(min,a[i][1]);  //updating minimum for each selected item.
            sum+=a[i][0];  //adding sum value of ith item to sum
            queue.add(a[i]); //adding ith item to queue
        }
        res=Math.max(res,sum*min);

        // if sum value of ith(i->[k,a.length-1]) item is greater than sum value of head item,
        // then remove the head item and add ith item in the queue.
        // compute max res from all computations done. 
    
        for(int i=k;i<a.length;i++){
            if(queue.peek()[0]<a[i][0]){
              sum-=queue.remove()[0]; //removing head item && subtracting sum value of head item from sum.
              sum+=a[i][0];  //adding sum value of ith item to sum
              queue.add(a[i]); //adding ith tem to queue
              min=Math.min(min,a[i][1]); //updating minimum for each selected item.
            }
            res=Math.max(res,sum*min); //updating result.
        }
        return res; //maximum result
    }
}