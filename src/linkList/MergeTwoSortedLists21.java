package linkList;

public class MergeTwoSortedLists21 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Solution class with iterative merge method
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            final ListNode root = new ListNode();
            ListNode prev = root;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    prev.next = list1;
                    list1 = list1.next;
                } else {
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }
            prev.next = list1 != null ? list1 : list2;
            return root.next;
        }


   /* // Solution class with recursive merge method
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list2.next, list1);
                return list2;
            }
        }*/



        public static void main(String[] args) {
            // Create the first linked list: 1 -> 2 -> 4
            ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

            // Create the second linked list: 1 -> 3 -> 4
            ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4,new ListNode(5,new ListNode(6)))));

            // Use the iterative solution to merge the lists
            MergeTwoSortedLists21 iterativeSolution = new MergeTwoSortedLists21();
            ListNode mergedListIterative = iterativeSolution.mergeTwoLists(list1, list2);

            System.out.println("Merged list using iterative solution:");
            printList(mergedListIterative);

            // Recreate the lists since they were altered during the first merge
           /* list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
            list2 = new ListNode(1, new ListNode(3, new ListNode(4)));*/

            // Use the recursive solution to merge the lists
          /*  linkList.MergeTwoSortedLists21 solution = new linkList.MergeTwoSortedLists21();
            ListNode mergedListRecursive = solution.mergeTwoLists(list1, list2);
            System.out.println("Merged list using recursive solution:");
            printList(mergedListRecursive);*/
        }

        // Helper method to print the linked list
        public static void printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            System.out.println();
        }
    }


