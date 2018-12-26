package linkedList;

public class Create {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	public static void main(String[] args) {
		Create ll=new Create();
		ll.append(34);
		
		
		Node second=new Node(15);
		Node third=new Node(20);
		Node fourth=new Node(25);
		
		ll.head.next=second;
		second.next=third;
		third.next=fourth;
		ll.printList();
		ll.push(1);
		ll.push(5);
		
		ll.push(7);
		ll.printList();
		ll.inBetween(100,23);
		ll.printList();
		
		ll.append(33);
		ll.printList();
	}
 
	
	public void printList(){
		Node curr=head;
		//better approach is to use curr!=null.
		//Then you won't have to put extra sysout outside the loop.
		while(curr.next!=null){					
			System.out.print(curr.data+"--->");
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	
	//append to front
	public void push(int d){
		Node temp=head;	//1.assign head to temp
		head=new Node(d);//2.assign new node to head
		head.next=temp;//3.point new head to temp
	}
	
	public void inBetween(int pos,int d){
	
		Node prev=head;
		while(--pos>0)
		{
			if(prev==null)
			{
				return;
			}
			prev=prev.next;
			
		}
		//1.make a temp node with new data
		//2.assign next of temp to next of previous node.
		//3.assign temp to next of previos node.
		Node temp=new Node(d);
		temp.next=prev.next;
		prev.next=temp;
	}
	public void append(int d){
		//1.assign new node to temp
		Node temp=new Node(d);
		//2.check if ll is empty.if empty then add this to beginning of the list
		if(head==null) {
			head=temp;
			return;
		}
		//3.if not then make head ass curr and traverse it to reach last node.
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		//4.make next of lsat node to temp
		curr.next=temp;
		return;
	}
}

