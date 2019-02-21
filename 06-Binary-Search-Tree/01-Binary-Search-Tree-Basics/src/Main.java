/**
 * @Auther: lss
 * @Date: 2019/1/31 21:50
 * @Description:
 */
public class Main {
    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        int[] nums = {5, 6, 3, 8, 4, 2};
        for (int num : nums)
            bst.add(num);

//        bst.levelOrder();
        bst.inOrder();
        System.out.println();
//
        bst.postOrder();
        System.out.println();
//        bst.preOrderNR();
//        System.out.println();
        bst.preOrder();
        System.out.println();
    }
}
