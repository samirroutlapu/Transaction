package interface8;

public class T implements S {
	

	public static void main(String[] args) {
		T obj = new T();
		obj.fun();
		System.out.println("My age is "+S.age);

	}

	@Override
	public void fun() {
		System.out.println("This is Method");
	}

}
