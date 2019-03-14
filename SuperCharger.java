//John Bringmann jab479
package cardec;

public class SuperCharger extends CarOptions  {

	
    public SuperCharger(ICar car){
       super(car);
    }

    @Override
    public String GetDescription(){
        return super.GetDescription() + addSuperCharger();
    }
   
   private String addSuperCharger(){
        return " with uber Super Duper charged charger";
   }
}

