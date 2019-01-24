class point{
	private float x;
	private float x;
	point(){
		this.x=0;
		this.y=0;
	}
	point(float x, float y){
		this.x=x;
		this.y=y;
	}
	void setValuex(float x){
		this.x=x;
	}
	void setValuey(float y){
		this.x=x;
	}
	void getValuex(float x){
		return x;
	}
	void getValuey(float y){
		return y;
	}
	float calcDist(float p2){
		float dist = (float) Math.sqrt(Math.pow((getValuex()-p2.getValuex()),2)+Math.pow((getValuey()-p2.getValuey()),2));
		return dist;
	}
}