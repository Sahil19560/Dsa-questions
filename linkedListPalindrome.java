public class linkedListPalindrome {
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
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    private Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find mid
        Node mid=findMiddle(head);
        System.out.println(mid.data);
        //reverse 2 half
        Node curr=mid;
        Node prev=null;
        
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        
        Node right=prev;
        Node left=head;
    

        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static void main(String args[]){
        linkedListPalindrome ll=new linkedListPalindrome();
        
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(2);
        ll.add(1);
        ll.print();
        
        System.out.println(ll.isPalindrome());

    }
    
}
