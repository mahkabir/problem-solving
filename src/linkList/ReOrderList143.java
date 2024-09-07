package linkList;

public class ReOrderList143 {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode () {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reOrderList(ListNode head){
        //finding median of the list
        ListNode slow = head;
        ListNode first = head.next;
        while(first!=null && first.next!=null){
            slow = slow.next;
            first = first.next.next;
        }

        //reversing the second half of the list
        ListNode temp = slow.next;
        slow.next = null;  // separate two list
        ListNode prev = null;
        while (temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp =front;
        }

        //merging two list accoridng to re order sequence
        ListNode list1 = head;
        ListNode list2 = prev;
        while(list2!=null){
            ListNode temp1 = list1.next;
            ListNode temp2 = list2.next;
            list1.next = list2;
            list2.next = temp1;
            list1 = temp1;
            list2 = temp2;
        }


    }
    public static void main(String[] args) {
     ReOrderList143 sln = new ReOrderList143();
     ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     head.next.next = new ListNode(3);
     head.next.next.next = new ListNode(4);
     head.next.next.next.next = new ListNode(5);
     head.next.next.next.next.next = new ListNode(7);
     head.next.next.next.next.next.next = new ListNode(8);
     head.next.next.next.next.next.next.next = new ListNode(9);
     sln.reOrderList(head);
     ListNode current = head;
     while(current!=null){
         System.out.println(current.val+" -> ");
         current = current.next;
     }
        System.out.println("null");


    }
}