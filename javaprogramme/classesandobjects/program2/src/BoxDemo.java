class BoxDemo
{
	public static void main(String[] args) {
		
	double width,height,depth;
	Box b = new Box();
	Box b1 = new Box(width = 2, height = 2, depth = 2);
	Box b2 = new Box(width = 2, depth = 2);
	b.volume();
	b1.volume();
	b2.volume();

	}
}