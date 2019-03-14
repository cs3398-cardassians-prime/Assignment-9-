//       Team:  Cardassians
//
//

package cardec;


public class CarMain {

	public static void main(String[] args) {

		System.out.println("Starting:  Creating Cars with Decorator Pattern\n");
	
		
		ICar car1 = new SuperCharger(new AirScoop(new SportWheels(new PaintColor(new StripeColor(new BasicCar()),"Red "))));
		System.out.println(car1.GetDescription());
      
      ICar car2 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BasicCar(), "Purple "),"Green ")));
		System.out.println(car2.GetDescription());  
      
      ICar car3 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BasicCar(),"Yellow "),"Black ")));
      System.out.println(car3.GetDescription());
      
      ICar car4 = new SuperCharger(new AirScoop(new SportWheels(new PaintColor(new BasicCar() ,"Rainbow "))));
      System.out.println(car4.GetDescription());
      
      ICar car5 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BasicCar(),"Invisible "))));
      System.out.println(car5.GetDescription());
      
      ICar car6 = new SuperCharger(new SportWheels(new PaintColor(new StripeColor(new BasicCar(),"Gold "),"Silver ")));
      System.out.println(car6.GetDescription());
		
		
	}

}

