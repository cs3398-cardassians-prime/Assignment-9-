
package cardec;

public class PaintColor extends CarOptions {
	public String Color;

	public PaintColor(ICar car) {
		super(car);
		System.out.print("  PaintColor Constructor\n");
		Color = color;
	}
	
	
	 @Override
    public String GetDescription(){
        return baseCar.GetDescription() + addPaintColor;
    }
	
	private String addPaintColor(){
        return "My new" + color + " color makes my car the slickest around.";
   }
}


