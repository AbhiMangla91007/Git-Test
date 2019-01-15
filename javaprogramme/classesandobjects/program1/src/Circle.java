class Circle{
	double radius;
	double findArea(){
		return radius*radius*3.14159;
	}
	void displayArea(){
		System.out.println("Area = " + findArea());
	}
}