//John Bringmann jab479
package cardec;

public class AirScoop extends CarOptions  {

	
    public AirScoop(ICar car){
       super(car);
	}

    @Override
    public String GetDescription(){
        return super.GetDescription() + addAirScoop;
  	}
   
   private String addAirScoop(){
        return " with an awesome AirScoop";
   }
}

