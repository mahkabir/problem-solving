import org.w3c.dom.Node;

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
        ReverseLinkedList206 solution = new ReverseLinkedList206();
        int[] head = {2, 1, 5, 6, 2, 3};
//        int [] result = solution.reverseList(head);
//        System.out.println("Reverse List: " + result);

    }*/
    // Java program for reversing the linked list



        static Node head;

        static class Node {

            int data;
            Node next;

            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        /* Function to reverse the linked list */
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
            ReverseLinkedList206 list = new ReverseLinkedList206();
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
        }
}
