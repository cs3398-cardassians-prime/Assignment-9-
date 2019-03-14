package cardec;

public class SportWheels extends CarOptions  {
	
    public SportWheels(ICar car){
        super(car);
        System.out.print(" SportWheels Constructor\n");
    }

    @Override
    public String GetDescription(){
        return super.GetDescription() + addSportWheels();
    }
  	
    private string addSportWheels(){
        return " with some super cool sport wheels.";
    }
}
