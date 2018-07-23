/**
 * Author:    Shubham
 * Created:   07,2018
 * 
 * (c) Copyright by Shubham Sharma, shubham-ai
 **/

// push , append , insertafter , printList function inside linklist
class Linklist{
	Node head;
	class Node
    {
        int data;
        Node next;
        Node(int d) {
        	data = d; next = null;
        }
    }
	public void push(int new_data){
		/*
		Node  new_node = new Node(new_data);
		allcate and put in data 
		same step in c is diff as 
		below step first allocate
		struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
		then new_node->data = new_data;
		put data
		*/

		Node  new_node = new Node(new_data);
		// make new_node as head
		new_node.next = head;
		// make head to ponint at new node 
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data){
		/*
		prev_node = 3,
		new_data = 4
		[1000],[1,200]->[3,400]->[5,500]->[6,600]
		  head, 1000,	 200,		400,	600    
		suppose we want 3 to point out to 4 so v will use insert after 
		so there

		we introduced 4 as [4,0]->null
							100
		Now 
		prev_node = 3
		and prev_node.next = 400 
		so below code block will make 		
		new_node.next = prev_node.next;
		i.e [4,400]->[5,500] 
	  TEMP|| new_node, 400

		i.e temp -> 400 as memory block of [5,500]  is 400
		and 
		prev_node.next = new_node
		[3,100]->[4,400]->[5,500]
		so now address of prev_node is pointing to 4 
		https://www.youtube.com/watch?v=g8VLr7UGsZo
		*/
		if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
 
        /* 2 & 3: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
 
        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
	}

	public void append (int new_data){
		Node new_node = new Node(new_data);

		if(head == null){
			head = new Node(new_data);
			return ;
		}

		new_node.next = null;

		Node last = head;
		while(last.next !=null){
			last = last.next;
		}
		last.next = new_node;
	}

	public void printList(){
		Node tnode = head;

		while(tnode != null){
			System.out.println(tnode.data+" ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args){
		Linklist llist = new Linklist();

		llist.append(6);
 
        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(7);
 
        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);
 
        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);
 
        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
	}

}