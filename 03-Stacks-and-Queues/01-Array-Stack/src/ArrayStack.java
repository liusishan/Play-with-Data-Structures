
public class ArrayStack<E> implements Stack<E>{
	
	Array<E> array;

	public ArrayStack(int capacity){
		array = new Array<>(capacity);
	}
	public ArrayStack(){
		array = new Array<>();
	}

}