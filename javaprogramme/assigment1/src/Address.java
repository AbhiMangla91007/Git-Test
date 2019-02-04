class Adress{
String line1;
String line2;
String city;
String state;
int pinCode;
Adress(){
	line1 = "";
	line2 = "";
	city = "";
	state = "";
	pinCode = 0;
}
Adress(String line1,String line2, String city,String state ,int pinCode){
	this.line1 = line1;
	this.line2 = line2;
	this.city = city;
	this.state = state;
    this.pinCode = pinCode;
}
void DisplayAddress(){
		System.out.println("line1 :"+line1);
		System.out.println("line2 :"+line2);
		System.out.println("city :"+city);
		System.out.println("state :"+state);
		System.out.println("pinCode :"+pinCode);
	}
}