package arrays.programs;

public class DeleteArrayElements {
	
	public static void main(String[] args) {
		
		int arr[]= {10,40,30,80,60,20};
		int del_ele=30;
		for(int i=0;i<arr.length;i++) {
			if(del_ele==arr[i]) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				break;
				
			}
		
		}
		for(int k=0;k<arr.length-1;k++) {
			System.out.print(arr[k]+" ");
		}
		
		
		
	}

}
