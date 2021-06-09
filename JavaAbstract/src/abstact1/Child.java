package abstact1;

public class Child extends Parent {


		@Override
		void m2() {
			// TODO Auto-generated method stub
			System.out.println("Abstract Method");
		}
		public static void  main(String args[])
		{
			Child obj = new Child();
			obj.m1();
			obj.m2();
			
		}
		 
	 }
