package cardec;

public class StripeColor extends CarOptions
{
	String color;

	public StripeColor(ICar c, String col) {
		super(c);
		System.out.print("  StripeColor Constructor\n");
		this.color = col;
	}

	@Override
	public void GetDescription(){
		super.GetDescription();
		System.out.print(" \n  My stripe's color is " + color + ". ");
		System.out.print("My " + color + " stripe lets me drive very fast.");
	}
}
