/**
 * @Auther: lss
 * @Date: 2019/1/21 14:46
 * @Description:
 */
public interface Queue<E> {
    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();

}
