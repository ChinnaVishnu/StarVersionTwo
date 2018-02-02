package com.jocata.star.RuleBulider;

//Method Overriding

class vahicle{
	 public void run(){
		System.out.println("Vehile is Running");
	}
}
class Bike extends vahicle{
	
	public void run(){
		System.out.println("No Vehile is Running");
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bb=new Bike();
		bb.run();

	}

}
