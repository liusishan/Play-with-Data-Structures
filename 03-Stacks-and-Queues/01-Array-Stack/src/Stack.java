public interface Stack<E>{
	// 进栈
	void push(E e);
	// 出栈
	E pop();
	// 查看栈顶元素
	E peek();
	//查看栈的元素个数
	int getSize();
	// 栈是否为空
	boolean isEmpty();
}