package main.java.easy;

/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {

    public static void testCases() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4,null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4,null)));
        System.out.println("1 1 2 3 4 4".equals(mergeTwoLists(list1, list2).toString()));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }else if(list1 != null && list2 == null) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, null));
        } else if(list1 == null) {
            return new ListNode(list2.val, mergeTwoLists(null, list2.next));
        } else if(list1.val <= list2.val) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString(){
        String s = val + " " + (this.next != null ? this.next.toString() : "");
        return s.stripIndent();
    }
}
