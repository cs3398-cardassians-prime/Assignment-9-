
package carcraft;

public abstract class CarOptions implements ICar {
	private ICar car;
	
	@Override
	public String GetDescription() {
		return car.GetDescription();
    }
}


