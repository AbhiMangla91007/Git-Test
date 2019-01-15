class Box{
	double width;
	double height;
	double depth;
	Box(){
		width = 1;
		height = 1;
		depth = 1;
	}
	Box(double w, double h, double d){
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	Box(double w, double d){
		width = w;
		height = 1;
		depth = d;
	}
	void setDim(float w, float h, float d){
		width = w;
		height = h;
		depth = d;
	}
	double volume(){
		return width*height*depth;
	}
}