class BoxWeight extends Box{
	float weight;
	BoxWeight(){
		super();
		weight = 0;
	}
	BoxWeight(float w,float h, float d,float wt){
		super(w,h,d);
		this.weight = wt;
	}
	float getWeight(){
		float weight = (getVolume())/166;
		return weight;
	}
}