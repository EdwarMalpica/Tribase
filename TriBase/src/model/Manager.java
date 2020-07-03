package model;

public class Manager {

	
	private Triangle triangle;
	public Manager (double base, double height) {
		triangle = new TriangleRectangle(base, height);
	}
	
	public Manager(double sideA, double sideB,double sideC) {
		triangle = new TriangleThreeSide(sideA,sideB,sideC);
	}
	public Manager(int opcion1,double sideA, double sideB,double angleC) {
		triangle = new TriangleTwoSides(sideA, sideB,angleC);
	}
	public Manager(double sideA, double angleB,double angleC,int opcion2) {
		triangle = new TriangleOneSide(sideA,angleB,angleC);
	}
	
	
	
	public double getSideA() {
		return triangle.getSideA();
	}

	public double getSideB() {
		return triangle.getSideB();
	}

	public double getSideC() {
		return triangle.getSideC();
	}

	public double getArea() {
		return triangle.calculateArea();
	}


	
	public double getHeight() {
		return triangle.getSideA();
	}



	public double getBase() {
		return triangle.getSideB();
	}

	
}
