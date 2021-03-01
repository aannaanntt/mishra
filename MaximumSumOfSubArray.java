package arrays.programs;

public class MaximumSumOfSubArray {
	
    public static void main(String[] args) {
    	int arr[]= {4,-2,-3,4,-1,-2,1,5,-3};
    	
    	int max_so_far=Integer.MIN_VALUE;
    	int max_ending_here=0;
    	for(int i=0;i<arr.length;i++) {
    		max_ending_here+=arr[i];
    	}
    	if(max_so_far<max_ending_here) {
    		max_so_far=max_ending_here;
    	}
    	
		System.out.print("Maximum sum of subarray is"+" "+max_so_far);
	}

}
