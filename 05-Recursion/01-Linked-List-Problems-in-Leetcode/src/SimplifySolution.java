/**
 * @Auther: lss
 * @Date: 2019/1/29 12:58
 * @Description:
 */
public class SimplifySolution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;

        if (head == null)
            return null;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }
        return head;
    }
}
