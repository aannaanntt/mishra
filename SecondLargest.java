class SecondLargest{
	public static void main(String args[]){
		int arr[] = { 6, 8, 2, 4, 3, 1, 5, 7, 9 };
		
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				second_largest=largest;
				largest=arr[i];
			}else if(arr[i]>second_largest && arr[i]!=largest){
			
				second_largest=arr[i];
			}
		}if(second_largest==Integer.MIN_VALUE){
			
			System.out.println("There is no second largest element");
		}else{
			System.out.println("second largest value is" + " " + second_largest);
			
		}
	
	
	}

}