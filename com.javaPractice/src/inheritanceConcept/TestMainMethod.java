package inheritanceConcept;


	
	class TestSuper{
		
		public static void main(String[] args) {
			
			System.out.println("SuperClass");

		}	
	}
	
class TestSub extends TestSuper{
		
	    
		public static void main(String[] args) {
			
			System.out.println("SubClass");

		}	
	}

public class TestMainMethod {
	public static void main(String[] args) {
//		 TestSuper ts=new TestSub();//upcasting
//		 TestSub sub = (TestSub) ts;//downcasting
		TestSub sub=new TestSub();
		 
		 String[] s= {};
		 sub.main(s);
		

	}

}
