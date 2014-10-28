package net.XavierOliveras;

import acm.program.GraphicsProgram;
import acm.graphics.GImage;

public class Principal extends GraphicsProgram {

	public void run(){
		
		setSize(800,600);
		
		GImage imatge1 = new GImage("luffy.png");
		GImage imatge2 = new GImage("goku.png");
		GImage camp_batalla = new GImage("ring2.png");
		imatge1.setSize(100,100);
		imatge2.setSize(100,100);
		imatge1.setLocation(0,0);
		imatge2.setLocation(0,100);
		camp_batalla.setSize(800,600);
		add(camp_batalla);
		add(imatge1);
		add(imatge2);
		
		while (imatge1.getX()+imatge1.getWidth() < 800){
			pause(100);
			imatge1.move(10, 0);
		}
		while (imatge1.getX()+imatge1.getWidth() == 800){
			pause(100);
			imatge1.move(10, 0);
		}
		while (imatge1.getX()+imatge1.getWidth() > 0){
			pause(100);
			imatge1.move(-10, 0);
		}
		while (imatge1.getX()+imatge1.getWidth() == 0){
			pause(100);
			imatge1.move(-10, 0);
		}
		
		
		//for (int i=0;i<=8;i++){
			//GImage goku = new GImage("goku.png");
		//}
				
	}
	
}
