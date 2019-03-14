
package cardec;

public class AirScoop extends CarOptions  {

	
    public AirScoop(BasicCar baseCar){
       super(baseCar);
	}

    @Override
    public String GetDescription(){
        return baseCar.GetDescription() + addAirScoop;
  	}
   
   private String addAirScoop(){
        return " with an awesome AirScoop";
   }
}

