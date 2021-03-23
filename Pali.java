	class Pali{
		
		static void checkPali(int x){
			int temp;
			temp=x;
			int rev=0;
			int rem;
			while(temp!=0){
			 rem=temp%10;
			   rev=rev*10+rem;
				temp=temp/10;
			
			
			}
			if(rev==x){
				System.out.print("Number is palindrome");
			}	else{
				System.out.print("Number is not palindrome");
			}
		}
		
		
		public static void main(String[] args){
		
			Pali.checkPali(123);
		
		}


	}