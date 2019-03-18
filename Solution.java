package com.canessa.cutter;

/*
 * 
 */
public class Solution {

	/*
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {

		// **** cannot instantiate the type Cutter (it is an interface) ****
//		Cutter cutter = new Cutter();
		
		// **** instantiate the JCCutter (this is an implementation) ****
		JCCutter jcCutter = new JCCutter();
		
		// **** get and display about info from the cutter ****
		System.out.println("about: " + jcCutter.about());

//		// **** initialize the cutter ****
//		jcCutter.init();
		
		// **** load media ****
		jcCutter.load();
		
		// **** get current position ****
		System.out.println("cutter position: " + jcCutter.getPosition().toString());
		
		// **** stylus down ****
		jcCutter.stylusDown();
		
		// **** cut square [0,0] with sides of 100 units ****
		jcCutter.rectangle(new Point(100, 0), new Point(100, 100), new Point(0, 100));

		// **** stylus up ****
		jcCutter.stylusUp();
		
		// **** stylus down ****
		jcCutter.stylusDown();
		
		// **** cut circle inside square ****
		jcCutter.circle(new Point(50, 50), 100);
		
		// **** stylus up ****
		jcCutter.stylusUp();
		
		// **** eject media ****
		jcCutter.eject();
		
	}

}
