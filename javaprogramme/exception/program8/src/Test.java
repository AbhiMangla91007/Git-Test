public class Test {
	public static void main(String[] args) {
	try {
		Derived d = new Derived();
	} catch(BaseException e) {
		System.out.println("BaseException caught in main()");
		}	
	}
}