public class AddLL {
    ListNode head;
    static class ListNode{

        int val;
        ListNode next;
    
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
    }

    void disp(){
        ListNode curr = head;
        while(curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }

    }

    void add(int val){
        ListNode L1 = new ListNode(val);
        if(head==null){
            head=L1;
        }
        else
        {
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;

        }
        curr.next=L1;
    }
}

    public static void main(String[] args) {
        AddLL myObj = new AddLL();
        //ListNode head =null;
        myObj.add(5);
        myObj.add(6);

        myObj.disp();
    }
    
}
