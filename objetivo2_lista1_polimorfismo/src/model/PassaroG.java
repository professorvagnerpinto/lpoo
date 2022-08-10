package model;

public class PassaroG extends AnimalG {
	
	private double z = 0.0;
	
	public PassaroG() {
		super();
	}

	public PassaroG(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public PassaroG(double x, double y) {
		super(x, y);
	}

	@Override
	public void desenhar() {
		System.out.print("\nDesenhou um Passaro.");
	}
	
	public void mover(double x, double y, double z) {
		super.mover(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "\nPassaroG [ x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
