package linkList;

public class ReverseLinkedList206 {

    //Use three pointers and so you can change the next of the mid to the first one without losing the track of the original left.
//Iterative version

/*        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode previous = null;
            ListNode nextCurrent = null;

            while (current != null) {
                nextCurrent = current.next;
                current.next = previous;
                previous = current;
                current = nextCurrent;
            }

            return previous;
        }*/

    //Recursive version

/*        public Node reverseList(ListNode head) {
            return rev(head, null);
        }

        public ListNode rev(ListNode node, ListNode pre) {
            if (node == null) return pre;
            ListNode temp = node.next;
            node.next = pre;
            return rev(temp, node);
        }


    public static void main(String[] args) {
        linkList.ReverseLinkedList206 solution = new linkList.ReverseLinkedList206();
        int[] head = {2, 1, 5, 6, 2, 3};
//        int [] result = solution.reverseList(head);
//        System.out.println("Reverse List: " + result);

    }*/
    // Java program for reversing the linked list



       /* static Node head;

        static class Node {

            int data;
            Node next;

            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        *//* Function to reverse the linked list *//*
        Node reverse(Node node)
        {
            Node prev = null;
            Node current = node;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            return node;
        }

        // prints content of double linked list
        void printList(Node node)
        {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            linkList.ReverseLinkedList206 list = new linkList.ReverseLinkedList206();
            list.head = new Node(85);
            list.head.next = new Node(15);
            list.head.next.next = new Node(4);
            list.head.next.next.next = new Node(20);

            System.out.println("Given linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }*/
       static class ListNode {
           int val;
           ListNode next;

           ListNode(int x) {
               val = x;
               next = null;
           }
       }

    /*public ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    public ListNode rev(ListNode node, ListNode pre) {
        if (node == null) return pre;
        ListNode temp = node.next;
        node.next = pre;
        return rev(temp, node);
    }*/

    // iterative approach    TC o(n)   |   SC o(1)
    public  ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode temp = head;
        while (temp!=null){
          ListNode front = temp.next;
          temp.next = prev;
          prev = temp;
          temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {
            // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

        ReverseLinkedList206 solution = new ReverseLinkedList206();

            // Reverse the linked list
            ListNode reversedHead = solution.reverseList(head);

            // Print the reversed linked list
            ListNode current = reversedHead;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            // Output should be: 5 4 3 2 1
        }

}
