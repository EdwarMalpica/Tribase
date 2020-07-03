package model;

public class TriangleRectangle extends Triangle {

	private double base;
	private double height;
	private double hipotenuse;
	
	public TriangleRectangle(double base, double height) {
		this.base = base;
		this.height = height;
		calculateHipotenuse();
	}
	@Override
	public double calculateArea() {
		
		return this.base*this.height/2;
	}
	
	@Override
	public double calculatePerimeter() {
		
		return 0;
	}
	public void calculateHipotenuse() {
		this.hipotenuse = Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
	}
	@Override
	public double getSideA() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	public double getSideB() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getSideC() {
		return hipotenuse;
	}
	public void setHipotenuse(double hipotenuse) {
		this.hipotenuse = hipotenuse;
	}

	
	
}
