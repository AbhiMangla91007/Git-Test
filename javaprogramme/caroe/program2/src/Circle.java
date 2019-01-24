class Circle{
	private double radius;
	Circle(){
		this.radius=0;
	}
	void setRadius(double radius){
		this.radius=radius;
	}
	void getRadius(double radius){
		return radius;
	}
	double findArea(){
		return radius*radius*3.14159;
	}
	void displayArea(){
		System.out.println("Area = " + findArea());
	}
}