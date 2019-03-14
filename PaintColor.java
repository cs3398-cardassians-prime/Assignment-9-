
package cardec;

public class PaintColor extends CarOptions {

	public LuxuryCar(Car c) {
		super(c);
		System.out.print("  LC Constructor\n");
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" \n  .... Received previous car. ");
		System.out.print("Now adding features of Luxury Car.");
	}
}

