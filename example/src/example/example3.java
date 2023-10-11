package example;

class example3 {
	int width; int height;
	public example3(int width, int height) {
		this.width=width; this.height=height;
	}
	public int getArea() {
		return width*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example3 [] r;
		r=new example3 [5];
		
		for(int i=0;i<r.length;i++) {
			r[i]=new example3(i,i);
		}
		for(int i=0;i<r.length;i++) {
			System.out.println((int)r[i].getArea()+"");
		}

	}

}
