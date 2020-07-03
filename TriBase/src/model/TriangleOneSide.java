package model;

public class TriangleOneSide extends Triangle{

	private double sideA;
	private double sideB;
	private double sideC;
	
	
	
	public TriangleOneSide(double sideA,double angleB, double angleC) {
	    this.sideA = sideA; 
	    calculateMissngSides(sideA,angleB,angleC, calculateMissingAngle(angleB,angleC));
	}
	
	
	private void calculateMissngSides(double sideA, double angleB, double angleC,double angleA) {
		this.sideB = Math.rint(100*(sideA*(Math.sin(Math.toRadians(angleB))))/(Math.sin(Math.toRadians(angleA))))/100;
		this.sideC = Math.rint(100*(sideA*(Math.sin(Math.toRadians(angleC))))/(Math.sin(Math.toRadians(angleA))))/100;
		
	}
	private double calculateMissingAngle(double angleB,double angleC) {
		return  (180 - (Math.rint(100*(angleB+angleC))/100));
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
		return sideA;
	}


	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	@Override
	public double getSideB() {
		return sideB;
	}


	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	@Override
	public double getSideC() {
		return sideC;
	}


	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	
}
