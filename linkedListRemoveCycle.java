public class linkedListRemoveCycle {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        
        if(fast==slow){
            return true;
            
        }
    
    
    }
    return false;
    }
    public static void removeCycle(){
        //check cycle
        Node slow=head;
        Node fast=head;
        boolean cycle =false;
        while(fast!=null && fast.next!= null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                cycle=true;
                break;

            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev =null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;


        }
        prev.next=null;
        


    }
    public static void main(String args[]){
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
    
}
