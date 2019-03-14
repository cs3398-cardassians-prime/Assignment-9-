
package cardec;

public class SuperCharger extends CarOptions  {

	
    public SuperCharger(BasicCar baseCar){
       super(baseCar);
	}

    @Override
    public String GetDescription(){
        return baseCar.GetDescription() + addSuperCharger;
  	}
   
   private String addSuperCharger(){
        return " with SuperCharger";
   }
}

