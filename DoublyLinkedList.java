class DoublyLinkedList{
	
	
		private ListNode head;
		private ListNode tail;
		private int length;
			
	class ListNode{
			private int data;
			private ListNode next;
			private ListNode previous;
			
				public ListNode(int data){
						this.data=data;
					
					
					}
			}
			
			public DoublyLinkedList(){
				this.head=null;
				this.tail=null;
				this.length=0;
			}
			
		public boolean isEmpty(){
			return length==0;
			
			
		}
		public int length(){
			return length;
			
		}
		public void insertLast(int value){
			ListNode newnode=new ListNode(value);
			if(isEmpty()){
				head=newnode;
			
			}else{
				tail.next=newnode;
				newnode.previous=tail;
				
			
				
			}
			tail=newnode;
			
			
		}
		
		public void insertFirst(int value){
			ListNode newnode=new ListNode(value);
			if(isEmpty()){
				
				tail=newnode;
			}else{
				
				head.previous=newnode;
				
			}
			newnode.next=head;
			head=newnode;
			length++;
			
			
			
		}
		public void displayForward(){
			if(head==null){
				return;
			}
			ListNode temp=head;
			while(temp!=null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print("null");
			
		}
		
		
		public void displayBackward(){
			if(tail==null){
				return; 
			}
			ListNode temp=tail;
			while(temp!=null){
				System.out.print(temp.data+"-->");
				temp=temp.previous;
			}
			System.out.print("null");
		}
		
		public ListNode delFirst(){
		
			ListNode temp=head;
			if(head==tail){
				tail=null;
				
			}else{
				
				head.next.previous=null;
				
			}
			head=head.next;
			temp.next=null;
			length--;
			
			return temp;
		}
		
		public ListNode delLast(){
			
			ListNode temp=tail;
			if(head==tail){
				head=null;
			}else{
				tail.previous.next=null;
			}
			tail=tail.previous;
			temp.previous=null;
			return temp;
			
		}

	
		public static void main(String[] args){
			DoublyLinkedList dl= new DoublyLinkedList();
			  //  dl.insertLast(10);
				//dl.insertLast(20);	
				//dl.insertLast(30);
//dl.insertLast(40);
			//	dl.insertLast(50);
			//	dl.insertLast(60);
				//dl.displayBackward();
				dl.insertFirst(10);
				dl.insertFirst(50);
				dl.insertFirst(40);
				dl.insertFirst(34);
				dl.displayForward();
				//dl.delFirst();
				//dl.displayForward();
				//dl.displayForward();
				//dl.displayBackward();
				dl.delLast();
				dl.displayForward();
			
			
		}
}