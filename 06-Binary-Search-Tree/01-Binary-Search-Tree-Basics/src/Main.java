/**
 * @Auther: lss
 * @Date: 2019/1/31 21:50
 * @Description:
 */
public class Main {
    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        int[] nums = {3, 4, 5, 2, 8, 4};
        for (int num : nums)
            bst.add(num);

        bst.preOrder();
    }
}
