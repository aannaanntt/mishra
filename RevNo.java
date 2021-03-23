class RevNo{
	
	static int reverse(int x){
		int rem;
		int rev=0;
		while(x!=0){
			rem=x%10;
			rev= rev*10+rem;
			x=x/10;
		
		}
		
		return rev;
	
	}



		public static void main(String []args){

		int rev=RevNo.reverse(143);
		System.out.print(rev);


}

}