class ExceptionTest{
	public static void main(String[] args) {
		String s = null;
		try{
			if(s == null){
				throw new Exception("you entered null value");
			}
			else{
				System.out.println(s);
			}
		}
		catch(Exception e){
		    System.out.println(e);
		}
		finally{
			System.out.println("I was here");
		}
	}
}