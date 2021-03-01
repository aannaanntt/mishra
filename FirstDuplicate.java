  package arrays.programs;

public class FirstDuplicate {
		
	public static void main(String[] args) {
		int arr[]= {6,5,3,2,5,1,2,4};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					System.out.println("First Duplicate Element is"+" "+arr[i]);
					temp++;
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}
	}
}
