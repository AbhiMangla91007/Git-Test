class Address{
	String firstLine;
	String secondLine;
	int pinCode;
	Address(){
		firstLine = "";
		secondLine = "";
		pinCode = 0;
	}
	void displayAddress(){
		System.out.print(this.firstLine+"\t\t"+this.secondLine+"\t\t"+this.pinCode);
	}
}