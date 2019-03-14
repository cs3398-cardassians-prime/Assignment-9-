//Student:Ralph Kelley

package cardec;

public class PaintColor extends CarOptions {
	public String Color ;

	public PaintColor(ICar car) {
		super(car);
		System.out.print("  PaintColor Constructor\n");
		this.color = "black";
	}
	
	public PaintColor(ICar c, String col) {
		super(car);
		//System.out.print("  PaintColor Constructor\n");
		this.color = col;
	}
	
	 @Override
    public String GetDescription(){
        return super.GetDescription() + addPaintColor;
    }
	
	private String addPaintColor(){
        return "My new " + color + " car make me the slickest person around.";
   }
}

