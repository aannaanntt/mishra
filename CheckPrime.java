import java.util.Scanner;

class CheckPrime {

		public static void main(String args[])
		{
		
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
			
			if(x==0 || x<0){
			System.out.print("Invalid number");
			}else{
					
			int temp=0;
			
			try{
			
				for(int i=2;i<x-1;i++){
							
							if(x%2==0){
								temp++;
								
							
							}
							
							
						
						}
							if(temp==0){
							
								System.out.print("Number is prime");
							
							}else{
								System.out.print("Number isn't prime");
							
							}
				
				
				}
		
			
			
			catch(Exception e){
				e.printStackTrace();
			
			}
			}
		
		
		
		
		}
}




