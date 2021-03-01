package arrays.programs;

public class InsertAtIndexPosition {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,67,89};
		
		int index_pos=5;
		int element=100;
		
		
		for(int i=arr.length-1;i>index_pos;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[index_pos]=element;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
