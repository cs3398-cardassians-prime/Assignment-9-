//Student:Ralph Kelley

package cardec;

public class PaintColor extends ICar {
	public String Color = "black";

	public PaintColor(ICar car) {
		super(car);
		System.out.print("  PaintColor Constructor\n");
		Color = color;
	}
	
	
	 @Override
    public String GetDescription(){
        return super.GetDescription() + addPaintColor;
    }
	
	private String addPaintColor(){
        return "My new" + color + " color makes my car the slickest around.";
   }
}