package model.turtle;

public class Stamp {
	
	private double myX, myY;
	private int myImage;

	public Stamp(double x, double y, int image) {
		myX = x;
		myY = y;
		myImage = image;
	}
	
	public double getX() {
		return myX;
	}
	
	public double getY() {
		return myY;
	}
	
	public double getImage() {
		return myImage;
	}

}
