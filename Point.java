package com.canessa.cutter;

/*
 * 
 */
public class Point {
	
	// **** members ****
	private int x;
	private int y;
	
	// **** constructor ****
	public Point() {
	}
	
	// **** constructor ****
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// **** get x coordinate ****
	public int getX() {
		return this.y;
	}
	
	// **** get y coordinate ****
	public int getY() {
		return this.x;
	}
	
	// **** set x coordinate ****
	public void setX(int x) {
		this.x = x;
	}
	
	// **** set y coordinate ****
	public void setY(int y) {
		this.y = y;
	}
	
	// **** to string ***
	public String toString() {
		return "[" + this.x + "," + this.y + "]";
	}
}
