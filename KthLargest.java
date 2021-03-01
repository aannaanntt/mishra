package arrays.programs;

public class KthLargest {
	public static void main(String[] args) {
		int arr[] = {5,8,12,7,6,2,4};
		int k=3;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("Value at Kth position is"+" "+arr[i]);
				break;
			}
		}
	}

}
