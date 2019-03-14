
package cardec;

public class SuperCharger extends CarOptions  {

	
    public SuperCharger(ICar car){
       super(car);
    }

    @Override
    public String GetDescription(){
        return baseCar.GetDescription() + addSuperCharger;
    }
   
   private String addSuperCharger(){
        return " with uber Super Duper charged charger";
   }
}

