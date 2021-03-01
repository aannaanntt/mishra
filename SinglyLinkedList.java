
	class SinglyLinkedList{
		private ListNode head;
		
		private static class ListNode{
			private int data;
			private ListNode next;
			
			public ListNode(int data){
			this.data=data;
			this.next=null;
			
			
			}
		
		}
		public ListNode delfirst(){
			if(head==null){
				return null;
			}
			ListNode temp=head;
			head=head.next;
			temp.next=null;
			
			return temp;
			
			
		}
		public  void insert(int pos,int value){
			ListNode newnode= new ListNode(value);
			if(pos==1){
				newnode.next=head;
				head=newnode;
				
			}else{
				int count=1;
				ListNode previous=head;
				
				while(count<pos-1){
					previous=previous.next;
					count++;
				}
				ListNode current=previous.next;
				newnode.next=current;
				previous.next=newnode;
			
			
			
			
		}
		
		}
		
		
		
		public void insertLast(int value){
			ListNode newnode= new ListNode(value);
			if(head==null){
				head = newnode;
				return;
				
			}
			ListNode current=head;
			while(null!=current.next){
				current=current.next;
			}
			
			current.next=newnode;
		}
		
		public  void insertFirst(int value){
				ListNode newNode= new ListNode(value);
				
				newNode.next=head;
				head = newNode;
			
		
		
		}
		
	
	public void printElements(){
		
				
				ListNode current = head;
				while(current!=null){
					System.out.print(current.data + "-->");
					current=current.next;
					
					
				
				}
				System.out.print("null");
			
		}
		public int findLength(){
			if(head == null){
					return 0;
				}
				
				int count=0;
				ListNode current= head;
				while(current!=null){
					count++;
					current=current.next;
				}
				
				return count;
			
		}
		
		public ListNode delLast(){
			if(head==null||head.next==null){
				return head;
			}
			ListNode current=head;
			ListNode previous=null;
			while(current.next!=null){
				previous=current;
				current=current.next;
			}
			previous.next=null;
			return current;
				
	}
	
	public void delPos(int pos){
		if(pos==1){
			head=head.next;
		}else{
			ListNode previous=head;
			int count=1;
			while(count<pos-1){
			previous=previous.next;
			count++;
			
			
			}
			ListNode current=previous.next;
			previous.next=current.next;
			
			
		}
		
	}
	public ListNode reverse(ListNode head){
		if(head==null){
			return head;
		
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
		}
		return previous;
		
		
		 
	}
	public boolean search(ListNode head,int searchKey){
		if(head==null){
			
			return false;
		}
		ListNode current=head;
		while(current!=null){
			if(current.data==searchKey){
				return true;
				
			}
			current=current.next;
		}
		
		return false;
		
		
	}
	
	
	public ListNode getMiddle(){
		if(head==null){
				return null;
			}
			ListNode slwptr=head;
			ListNode fstptr=head;
			while(fstptr!=null&&fstptr.next!=null){
			slwptr=slwptr.next;
			fstptr=fstptr.next.next;
				
			}
			
			return slwptr;
	}
	
	public ListNode getNthfromEnd(int n){
		if(head==null){
			return null;
		}
		if(n<=0){
			throw new IllegalArgumentException("Invalid value");
		}
		ListNode mainptr=head;
		ListNode refptr=head;
		int count=0;
		while(count<n){
			if(refptr==null){
				throw new IllegalArgumentException("Invalid value");
			}
			refptr=refptr.next;
			count++;
		}
		
		while(refptr!=null){
			refptr=refptr.next;
			mainptr=mainptr.next;
		}
		
		return mainptr;
	}
	
	public void removeDuplicates(){
		if(head==null){
			
				return;
			}
		ListNode current=head;
		while(current!=null&&current.next!=null){
			if(current.data==current.next.data){
				current.next=current.next.next;
			}else{
				
				current=current.next;
			}
			
		}
		
	}
	
	
	public ListNode insertInSortedList(int data){
		
		ListNode newnode=new ListNode(data);
		if(head==null){
			return newnode;
		}
		ListNode current=head;
		ListNode temp=null;
		while(current!=null&&current.data<newnode.data){
			temp=current;
			current=current.next;
			
		}
		newnode.next=current;
		temp.next=newnode;
		return head;
		
	}
	
	public boolean containsLoop(){
		ListNode fstptr=head;
		ListNode slwptr=head;
		
		while(fstptr!=null&&fstptr.next!=null){
			fstptr=fstptr.next.next;
			slwptr=slwptr.next;
			if(slwptr==fstptr){
				return true;
				
			}
		}
		return false;
		
	}
	public void createLoopInList(){
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=third;
		
		
	}
	
		
		public ListNode startingNode(){
			ListNode fstptr=head;
			ListNode slwptr=head;
			
			while(fstptr!=null&&fstptr.next!=null){
				fstptr=fstptr.next.next;
				slwptr=slwptr.next;
				if(slwptr==fstptr){
					return getStartingNode(slwptr);
					
				}
			}
			return null;
		
	}
	
	public ListNode getStartingNode(ListNode slwptr){
		ListNode temp=head;
		while(slwptr!=temp){
			slwptr=slwptr.next;
			temp=temp.next;
			
			
		}
		return temp;
		
		
		
		
	}
		public void removeLoop(){
			ListNode fstptr=head;
			ListNode slwptr=head;
			
			while(fstptr!=null&&fstptr.next!=null){
				fstptr=fstptr.next.next;
				slwptr=slwptr.next;
				if(slwptr==fstptr){
				removeLoop(slwptr);
				return;
				
				}
			}
		}
		private void removeLoop(ListNode slwptr){
			
			ListNode temp=head;
			while(slwptr.next!=temp.next){
			slwptr=slwptr.next;
			temp=temp.next;
			
			
		}
			slwptr.next=null;
	
			
			
		}
		
		
	
		
	public static void main(String[] args){
		SinglyLinkedList sl= new SinglyLinkedList();
		/*sl.head = new ListNode(10);
		ListNode second = new ListNode(30);
		ListNode third  =  new ListNode(60);
		ListNode fourth = new ListNode(70);
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=null;*/
		
		sl.insertFirst(10);
		sl.insertLast(10);
		sl.insertLast(20);
		sl.insertLast(30);
		
		//sl.insertLast(40);
		//sl.insertInSortedList(35);
		//sl.insertInSortedList(37);
	
		//ListNode li=sl.getNthfromEnd(4);
		//System.out.print(li.data);
		
		//sl.removeDuplicates();
		//sl.createLoopInList();
		//System.out.println(sl.containsLoop());
		//System.out.println(sl.startingNode().data);
		sl.createLoopInList();
		System.out.println(sl.containsLoop());
		sl.removeLoop();
		sl.printElements();
		//sl.printElements();
	
	}

	
	
	
}