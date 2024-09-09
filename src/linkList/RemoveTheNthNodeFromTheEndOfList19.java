package linkList;

import java.util.List;

public class RemoveTheNthNodeFromTheEndOfList19 {
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
    private ListNode RemoveNthNodeFromEnd(ListNode head,int k){   // T.C O(2*Length)
            int count = 0;
            ListNode temp = head;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
        if(count==k){
            ListNode newHead =  head.next;
            return newHead;
        }
            int beforeKthNodeFromStart = count-k;
            temp = head;
            while(temp!=null){
                beforeKthNodeFromStart--;
                if(beforeKthNodeFromStart==0){
                    break;
                }
                temp = temp.next;
            }
             temp.next = temp.next.next;
            return head;
    }
    private ListNode RemoveNthNodeFromEndv2(ListNode head,int k){  //reduces time complexity, S.C O(1)
        ListNode first = head;
        ListNode slow  = head;
         for(int i =0;i<k;i++){
             first = first.next;
         }
         while(first.next!=null){
             slow = slow.next;
             first = first.next;
         }
         slow.next = slow.next.next;
         return head;
        }

    public static void main(String[] args) {
        RemoveTheNthNodeFromTheEndOfList19 sln = new RemoveTheNthNodeFromTheEndOfList19();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next = new ListNode(9);
        int k =3;
        sln.RemoveNthNodeFromEndv2(head,k);
        ListNode current = head;
        while(current!=null){
            System.out.print(current.val+" -> ");
            current = current.next;
        }
        System.out.println("null");


    }
}
