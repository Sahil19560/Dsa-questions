public class doubleLinkedList {
    static Node head;
    static Node  tail;
    static Node prev;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
       if(head==null){
        head=tail=newNode;
        
        return;
       }

       tail.next=newNode;
       newNode.prev=tail;
       
       tail=newNode;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        return val;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head =prev;
    }
    public static void main(String args[]){
        doubleLinkedList ll=new doubleLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
           ll.print();
           ll.removeLast();
           ll.print();        
           ll.reverse();
           ll.print();                            
    }
    
}
