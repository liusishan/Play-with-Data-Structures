/**
 * @Auther: lss
 * @Date: 2019/2/21 15:34
 * @Description:
 */
public interface Map<K, V> {

    void add(K key, V value);

    V remove(K key);

    boolean contains(K key);

    V get(K key);

    void set(K key, V value);

    int getSize();

    boolean isEmpty();
}
