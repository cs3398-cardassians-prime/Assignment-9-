
package cardec;

public class PaintColor extends CarOptions {

	public PaintColor(ICar c) {
		super(c);
		System.out.print("  PaintColor Constructor\n");
		this.color = pColor;
	}
	
	@Override
	public void GetDescription(){
		super.GetDescription();
		System.out.print(" \n  The Cars color is "+ color+ ". " );
		System.out.print("My new " + color + " makes my car the slickest around.");	}
}

