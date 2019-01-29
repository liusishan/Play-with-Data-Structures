/**
 * @Auther: lss
 * @Date: 2019/1/29 16:21
 * @Description:
 */
public class LinkedListR<E> {

    private class Node {
        public E e;

        public LinkedListR.Node next;

        public Node(E e, LinkedListR.Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

}
