package model;

public class TriangleTwoSides  extends Triangle{

	private double sideA;
	private double sideB;
	private double sideC;
	
	
	public TriangleTwoSides(double sideA,double sideB, double angleC) {
		this.sideA = sideA;
		this.sideB = sideB;
		calculateMissingSide(angleC);
	}
	
	
	private void calculateMissingSide(double angleC) {
		this.sideC =Math.round( Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2)-2*sideA*sideB*Math.cos(Math.toRadians(angleC))));
		
	}
	
	
	@Override
	public double calculateArea() {
		return  Math.sqrt(semiPerimeter()*(semiPerimeter()-this.sideA)*(semiPerimeter()-this.sideB)*(semiPerimeter()-this.sideC) );
	}
	
	public double semiPerimeter() {
		return (this.sideA+this.sideB+this.sideC)/2;
	}


	@Override
	public double calculatePerimeter() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	@Override
	public double getSideA() {
		return this.sideA;
	}
	@Override
	public double getSideB() {
		return this.sideB;
	}
	@Override
	public double getSideC() {
		return this.sideC;
	}

}
