package model;

public class TriangleThreeSide extends Triangle {

	private double sideA;
	private double sideB;
	private double sideC;
	
	
	public TriangleThreeSide(double sideA,double sideB,double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		
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
	protected double getSideA() {
		
		return this.sideA;
	}


	@Override
	protected double getSideB() {
		return this.sideB;
	}


	@Override
	protected double getSideC() {
		return this.sideC;
	}
	
	
	
}
