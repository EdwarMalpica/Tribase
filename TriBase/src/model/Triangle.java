package model;

public abstract class Triangle {
/**
 * Metodo Abtracto que permite calcular el valor del area de un triangulo
 * @return
 */
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();

	protected abstract double getSideA();
	protected abstract double getSideB();
	protected abstract double getSideC();
}

