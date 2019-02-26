/**
 * @Auther: lss
 * @Date: 2019/2/26 12:51
 * @Description:
 */
public interface Queue<E> {
    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();


}
