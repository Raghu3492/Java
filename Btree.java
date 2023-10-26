public class Btree {
    Node head;
     class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public  void binTree(){
     Node first = new Node(1);
     Node second = new Node(2);
     Node third = new Node(3);
     Node fourth = new Node(4);

     head = first;
    first.left =second;
    first.right=third;
    second.left=fourth;
        System.out.println(first.data);
    }
    // public void disp(){
    //     Node curr = head;
    //     // if(head==null){
    //     //     System.out.println("Data is empty");
    //     // }
       
    //         while(curr!=null){
    //             System.out.print(curr.data+ "->");
    //             curr=curr.right;
    //         }
        

    // }



    public static void main(String[] args) {
        Btree cre =new Btree();
        // cre.binTree(50);
        // cre.binTree(60);
        // cre.disp();
        cre.binTree();
    }


    
}
