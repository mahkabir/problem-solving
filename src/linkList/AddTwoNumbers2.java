package linkList;

public class AddTwoNumbers2 {
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
    private ListNode addTwoNumbers(ListNode head1, ListNode head2){
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        int carry = 0;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1!=null || temp2!=null){
                int sum = carry;
                if(temp1!=null) sum += temp1.val;
                if(temp2!=null) sum += temp2.val;
                ListNode newNode = new ListNode(sum%10);
                carry = sum/10;
                current.next = newNode;
                current = current.next;
                if(temp1!=null){
                    temp1 = temp1.next;
                }
                if(temp2!=null){
                    temp2 = temp2.next;
                }
        }
        if(carry>0){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4,new ListNode(5,new ListNode(6)))));
        AddTwoNumbers2 sln = new AddTwoNumbers2();
        ListNode current = sln.addTwoNumbers(list1,list2);
        while(current!=null){
            System.out.print(current.val+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    }

