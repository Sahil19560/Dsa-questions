public class zigzagLinkedList {
    static Node head;
    static Node tail;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLast(int data){
    Node newNode=new Node(data);{
        if(head==null){
            head=tail=newNode;
            return;
        }
          tail.next=newNode;
          tail=newNode;
        
    }
}
public void zigzag(){
    //find mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    //reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right=prev;
    Node nextLeft,nextRight;
    while(left!=null&&right!=null){
        nextLeft=left.next;
        nextRight=right.next;
        left.next=right;
        right.next=nextLeft;
        //update
        right=nextRight;
        left=nextLeft;   
    }

}
public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("nulll");
}
    public static void main(String args[]){
        zigzagLinkedList ll=new zigzagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3); 
        ll.addLast(4); 
        ll.addLast(5);      
        ll.print();
        ll.zigzag();
        ll.print();
    }
    
}
