public class llInsertMiddle {
    Node head;
    private int size;
    llInsertMiddle(){
        size=0;
    }

    public class Node{
        String data;
        Node next;

        Node( String data){
            this.data=data;
            this.next=null;
            size++;
        }
        
    }
    public void add(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
         
    }

    public void insertAtMiddle(String data,int idx){
        if(head==null || idx<0){
            
            System.out.println("ivaliid value");    
        }
        
        Node newNode=new Node(data);
        if(head==null || idx==0){


            head=newNode;
            return;
        }
        
        
        
        Node currNode=head;
        for(int i=1;i<size;i++){
            if(i==idx){
                Node nextNode=currNode.next;
                currNode.next=newNode;
                newNode.next=nextNode;

            }
            currNode=currNode.next;
        }
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        llInsertMiddle list= new llInsertMiddle();
        list.add("s");
        list.add("a");
        list.add("h");
        list.add("i");
        list.add("l");
        list.printList();
    }
}
