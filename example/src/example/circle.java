package example;

public class circle {
	int radius;
	public circle(int radius) {this.radius=radius;}
	public void set(int radius) {this.radius=radius;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle ob1=new circle(1);
		circle ob2=new circle(2);
		circle s;
		
		s=ob2;
		ob1=ob2;
		System.out.println("ob1.radius: "+ob1.radius);
		System.out.println("ob2.radius: "+ ob2.radius);

	}

}
