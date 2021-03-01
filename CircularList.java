public class CircularList{

		private ListNode last;
		private int length;
		
		
		private class ListNode{
			private int data;
			private ListNode next;
		
			public ListNode(int data){
			
			this.data=data;
			
			}		
		}
		
		public CircularList(){
			last=null;
			length=0;
		
		}
		
		public int length(){
			return length;
		
		
		}
		public boolean isEmpty(){
			return length==0;
		
		}
		
		public void print(){
			if(last==null){
				return; 
				
				
			}
			ListNode first=last.next;
			while(first!=last){
				System.out.print(first.data+" ");
				first=first.next;
				
			}
			System.out.print(first.data);
			
			
			
		}
		
		public void insertFirst(int data){
			ListNode temp=new ListNode(data);
			if(last==null){
				last=temp;
				
			}else{
				temp.next=last.next;
			}
			last.next=temp;
			length++;
			
			
		}
		public void insertLast(int data){
			ListNode temp=new ListNode(data);
			if(last==null){
				last = temp;
				last.next=last;
				
			}else{
				temp.next=last.next;
				last.next=temp;
				last=temp;
				
				
				
			}
			length++;
			
			
		}
		public ListNode delfirst(){
			ListNode temp=last.next;
			if(last.next==last){
			last=null;
			
			}else{
				last.next=temp.next;
			}
			temp.next=null;
			length--;
			return temp;
			
			
			
			
		}
	public void createCircular(){
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(4);
		ListNode third=new ListNode(7);
		ListNode fourth=new ListNode(9);
		
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
					
		last=fourth;
		
	}


	public static void main(String[] args){
		CircularList cl=new CircularList();
			cl.createCircular();
			cl.insertFirst(23);
			cl.insertLast(400);
			cl.print();
			cl.delfirst();
			cl.print();
	
	
	}




}