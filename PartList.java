public class PartList {
    Node head;
    class Node{
        int data;
        Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
    }

    void addElement(int e){
        Node temp = new Node(e);
        if(head==null){
            head=temp;
        }
        else
        {
           temp.next=head;
           temp=head;
            }

        }
        
        
    

    void Display(){
        Node curr =this.head;
        while(curr!=null){
            System.out.print(curr.data);
            curr=curr.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        PartList LL = new PartList();
        LL.addElement(10);
        LL.addElement(30);
        LL.Display();
        
    }
}
