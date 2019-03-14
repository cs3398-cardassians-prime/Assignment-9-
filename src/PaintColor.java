//Student:Ralph Kelley

package cardec;

public class PaintColor extends CarOptions {
	public String color ;

	public PaintColor(ICar c) {
		super(c);
		System.out.print("  PaintColor Constructor\n");
		this.color = "black";
	}
	
	public PaintColor(ICar c, String col) {
		super(c);
		//System.out.print("  PaintColor Constructor\n");
		this.color = col;
	}
	
	 @Override
    public String GetDescription(){
        return super.GetDescription() + "My new " + color + " car make me the slickest person around.";
    }
	
}

