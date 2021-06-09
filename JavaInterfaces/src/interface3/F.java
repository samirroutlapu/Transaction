package interface3;

public interface F {
	void fun();
	
	
	default void m1(){
		System.out.println("Interface default Method");
	}

}
