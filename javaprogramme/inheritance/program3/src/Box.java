class Box{
	float width;
	float height;
	float depth;
    Box(){
		this.width = 0;
		this.height = 0;
		this.depth = 0;
	}
	Box(float w,float h, float d){
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	float getWidth(){
		return width;
	}
	float getHeight(){
		return height;
	}
    float getDepth(){
		return depth;
	}
	void setWidth(float w){
		this.width = w;
	}
	void setDepth(float d){
		this.depth = d;
	}
	void setHeight(float h){
		this.height = h;
	}
	float getVolume(){
		float volume = width*depth*height;
		return volume;
	}
}