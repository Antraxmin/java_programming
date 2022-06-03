package example;

// 스택 클래스 
class GStack<T> {
	int tos;
	Object [] stck;
	public GStack() {
		tos = 0;
		stck = new Object [10];
	}
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}

public class MyStack {
	public static void main(String[] args) {
		// String 형 스택 생성 
		GStack<String> stringStack = new GStack<String>();
		// Seoul, busan, LA push 
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		// pop
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop());
		// 정수형 스택 생성
		GStack<Integer> intStack = new GStack<Integer>();
		// 1, 3, 5 push 
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		// pop 
		for(int n=0; n<3; n++)
			System.out.println(intStack.pop());
	}
}
