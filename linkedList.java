public class linkedList {
    static Node head;
    static Node tail;
    static int size=0;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
           head=tail= newNode;
           return;
        }
 
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addInMiddle(int data,int idx){
        Node newNode=new Node(data);
        size++;
        Node prev=head;
        int i=0;
        while(i<idx-1){
            prev=prev.next;
            i++;
        }
        newNode.next=prev.next;
        prev.next=newNode;



    }
    
    public int removeFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    
    public static int removeLast(){
        if(head==null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;

        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;

        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        
        if(head.data==key){
             return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;

        }
        return idx+1;

    }
    public static int recursiveSearch(int key){
        return helper(head,key);
    }

    public static void print(){
        if(head==null){
            System.out.println("LL IS EMPTY");
            return; 
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static  void reverseLinkedList(){
        Node prev =null;
        Node curr=tail=head;
        Node next;
        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void findRemoveNthNodeFromLast(int n){
        //find size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }

        int itfind=sz-n;
        Node prev=head;
        int i=1;
        while(i<itfind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    
    public static void main(String args[]){

        linkedList ll=new linkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(6);
        print(); 
        findRemoveNthNodeFromLast(3);
        print();
        System.out.println("reverse LinkedList");
        reverseLinkedList();
        print();
        ll.addInMiddle(10, 2);
        print();
        ll.removeFirst();
        print();
       // removeLast();
        print();
        System.out.println(    ll.itrSearch(1));
       System.out.println(  recursiveSearch(3)); 
        System.out.println(size);

    }
    
}
