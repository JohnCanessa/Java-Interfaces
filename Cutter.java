package com.canessa.cutter;

/*
 * 
 */
public interface Cutter {
	
	public void 	init();
	public void		home();
	
	public void 	load();
	public void 	eject();
	
	public void 	stylusUp();
	public void 	stylusDown();
	
	public void		setPosition(Point pt);
	public Point	getPosition();
	
	public void 	line(Point to);
	public void 	circle(Point center, int radius);
	public void 	rectangle(Point pt1, Point pt2, Point pt3);
	
}
