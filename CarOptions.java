
package cardec;

public abstract class CarOptions implements ICar {
	protected ICar car;
	
	public CarOptions(ICar car){
		this.car = car;
	}
	
	@Override
	public String GetDescription() {
		return car.GetDescription();
    }
}


