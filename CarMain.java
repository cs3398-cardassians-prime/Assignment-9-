//       Johnathan Bringmann   jab 479
//       Team:  Cardassians
//
//
// i.	   Single Responsibility Principle?
// ii.	Open Close Principle?
// iii.	Liskov Substitution Principle?
// iv.	Interface Segregation Principle?
// v.	   Dependency Inversion Principle?
//
//
//
//
//

package cardec;


public class CarMain {

	public static void main(String[] args) {

		System.out.println("Starting:  Creating Cars with Decorator Pattern\n");
	
		
		ICar car1 = new SuperCharger(new AirScoop(new SportWheels(new PaintColor(new StripeColor(new BaseCar()),"Red "))));
		System.out.println("Done. " + car1.GetDescription());
      
      ICar car2 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BaseCar(), "Purple "),"Green ")));
		System.out.println("Done. " + car2.GetDescription());  
      
      ICar car3 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BaseCar(),"Yellow "),"Black ")));
      System.out.println("Done. " + car3.GetDescription());
      
      ICar car4 = new SuperCharger(new AirScoop(new SportWheels(new PaintColor(new BaseCar() ,"Rainbow "))));
      System.out.println("Done. " + car4.GetDescription());
      
      ICar car5 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BaseCar(),),"Invisible ")));
      System.out.println("Done. " + car5.GetDescription());
      
      ICar car6 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BaseCar(),"Gold "),"Silver ")));
      System.out.println("Done. " + car6.GetDescription());
		
		
	}

}

