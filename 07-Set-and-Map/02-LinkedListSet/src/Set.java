/**
 * @Auther: lss
 * @Date: 2019/2/20 20:07
 * @Description:
 */
public interface Set<E> {

    void add(E e);// 不能添加重复元素

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
