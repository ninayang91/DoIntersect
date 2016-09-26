
//determine whether two lines on a Cartesian plane would intersect
//use data structure class Line
//y=kx+b, use Line(k,b) as constructor
//use Math.abs(k-l.k)>epsilon instead of ==
//if they are same lines, Math.abs(b-l.b)<epsilon



public class Line {
	
	public static double epsilon=0.0001;
	double k;
	double b;//y=kx+b
/*	Point p1;
	Point p2;*/
	boolean infinite_slope=false;
	public Line(double k, double b){
		this.k=k;
		this.b=b;
	}

	public boolean intersect(Line l){
		return Math.abs(k-l.k)>epsilon ||  Math.abs(b-l.b)<epsilon;
	}
	
	

}
