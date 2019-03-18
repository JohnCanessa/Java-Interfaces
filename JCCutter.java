package com.canessa.cutter;

/*
 * Class implemented by the cutter manufacturer JC
 */
public class JCCutter implements Cutter {

	// **** ****
	private boolean 	initialized	= false;
	
	private Point		current 	= null;
	
	private boolean		stylusUp	= true;
	
	
	// **** ****
	public void init() {
		System.out.println("initializing ...");
		try {
			Thread.sleep(1000 * 3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.stylusUp		= true;
		this.current 		= new Point(0, 0);
		this.initialized 	= true;
		System.out.println("initialized!!!");
	}
	
	// **** ****
	public void home() {
		if (!initialized)
			init();
	}
	
	// **** ****
	public void load() {
		if (!initialized)
			init();
		
		// **** load media ****
		System.out.println("loading media ...");
		try {
			Thread.sleep(1000 * 4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("media loaded !!!");
	}
	
	// **** ****
	public void eject() {
		if (!initialized)
			init();
		
		// **** check if the stylus needs to be moved up ****
		if (this.stylusUp == false)
			stylusUp();
		
		// **** eject media ****
		System.out.println("ejecting media ...");
		try {
			Thread.sleep(1000 * 4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("media ejected !!!");
	}
	
	// **** ****
	public void stylusUp() {
		if (!initialized)
			init();
		this.stylusUp = true;
		System.out.println("stylus up");
	}
	
	// **** ****
	public void stylusDown() {
		if (!initialized)
			init();
		this.stylusUp = false;
		System.out.println("stylus down");
	}
	
	// **** ****
	public void setPosition(Point pt) {
		if (!initialized)
			init();
		
		// **** get to the desired position ****
		System.out.println("moving to [" + pt.getX() + "," + pt.getY() + "] ...");
		try {
			Thread.sleep(1000 * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("moving to [" + pt.getX() + "," + pt.getY() + "] !!!");
		
		// **** update current position ****
		this.current = pt;
	}
	
	// **** ****
	public Point getPosition() {
		if (!initialized)
			init();
		
		// **** get current position ****
		return this.current;
	}
	
	// **** ****
	public void line(Point to) {
		if (!initialized)
			init();

		
		
	}
	
	// **** ****
	public void circle(Point center, int radius) {
		if (!initialized)
			init();

		// **** cut circle (stylus may be up) ****
		System.out.println("cutting circle at [" + center.getX() + "," + center.getY() + 
							"] with radius: " + radius + " ...");
		try {
			Thread.sleep(1000 * 3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("done !!!");
	}
	
	// **** ****
	public void rectangle(Point pt1, Point pt2, Point pt3) {
		if (!initialized)
			init();
		
		// **** save starting position to complete shape ****
		Point start = new Point(current.getX(), current.getY());
		
		// **** cut rectangle (stylus may or may not be down) ****
		System.out.println("from [" + this.current.getX() + "," + this.current.getY() + "] -> [" +
							pt1.getX() + "," + pt1.getY() + "] ...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.current = pt1;
		
		System.out.println("from [" + this.current.getX() + "," + this.current.getY() + "] -> [" +
							pt2.getX() + "," + pt2.getY() + "] ...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.current = pt2;
		
		System.out.println("from [" + this.current.getX() + "," + this.current.getY() + "] -> [" +
							pt3.getX() + "," + pt3.getY() + "] ...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.current = pt3;
	
		
		System.out.println("from [" + this.current.getX() + "," + this.current.getY() + "] -> [" +
							start.getX() + "," + start.getY() + "] ...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
		this.current = start;
	}
	
	// **** returns an about string for the cutter ****
	public String about() {
		return "Cutter designed and implemented by John Canessa Industries";
	}

}
