package example;

class example2 {
	int radius;
	public example2(int radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example2 [] e;
		e=new example2[5];
		
		for(int i=0;i<e.length;i++){
			e[i]=new example2(i);
		}
		for (int i=0;i<e.length;i++) {
			System.out.println((int)(e[i].getArea())+"");
		}

	}

}
