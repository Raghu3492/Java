    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
public class LL {
    Node head;
void printRes(){
            Node curr=this.head;
            while(curr!= null){
                System.out.print(curr.data + " ");
                curr=curr.next;
            }
            System.out.println();
            
        }
    
void addLast(int e){
    Node temp = new Node(e);
    if(head==null){
        head = temp;
    }
    else{
       Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }
}
    
void addFirst(int e){
    Node temp = new Node(e);
    if(head==null){
        head=temp;
    }
    else{
             temp.next=head;
             head=temp;

    }
} 
    
void removeLast(){
    Node curr = head;
    while(curr.next.next!=null){
        curr=curr.next;
    }
    curr.next=null;
}
        
void removeFirst(){
    if(head==null){
        System.out.println("Np");
    }
    else{
        Node curr = head;
        head=head.next;
        curr.next=null;
    }

}

int countInd(){
   Node curr =head;
   int count =0;
   while(curr!=null){
    curr=curr.next;
    count++;
   }
   return count;
    
}


void insEle(int ind,int e){
    Node curr=head;
    int count=0;
    Node temp=new Node(e);
    if(ind==0){
        addFirst(e);
    }
    else{

    while(count<ind-1){
        curr = curr.next;
        count++;
    }
    temp.next=curr.next;
    curr.next=temp;
}

}

public static void main(String[] args) {
        // Node p1=new Node(5);
        // Node p2=new Node(6);
        // Node p3=new Node(7);

        
        // p1.next=p2;
        // p2.next=p3;
        // Node head= p1;
        LL myObj=new LL();
        // for(int i=0;i<5;i++){
        //     myObj.addLast(i);
        // }
        
            
            myObj.addLast(10);
            myObj.addLast(11);
           myObj.addLast(12);
            // myObj.addFirst(2);
            // myObj.removeLast();
           // myObj.removeFirst()
           //System.out.println(myObj.countInd());
           myObj.printRes();
           System.out.println(myObj.countInd());
           myObj.insEle(0, 4);
           myObj.printRes();
           System.out.println(myObj.countInd());
        

    }
}
