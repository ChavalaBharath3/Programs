import java.util.LinkedList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode currListNode = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currListNode.next = list1;
                list1 = list1.next;
            } else {
                currListNode.next = list2;
                list2 = list2.next;
            }
            currListNode = currListNode.next;
        }
        return dummpy.next;
    }
}

class GfG {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        ListNode list2 = new ListNode();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        LinkedList list = new LinkedList<>();
    }
}