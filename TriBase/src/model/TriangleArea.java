package model;



/**
 * 
 * @author Edwar Malpica
 * @Date 8/06/2020
 * @version 1.0
 * Logica del Programa el cual cumple con la funcion de hallar el area de un tringulos
 * mediante la obtencion de datos por el usuario como pueden ser, lados, angulos, base o altura
 */

public class TriangleArea {

	
	private double area;
	 /**
	  * Constructor, inicializa la variable area
	  */
	public TriangleArea() {
		this.area = 0;
	}
	/**
	 * Metodo al cual le entran tres parametros que son tres lados de un triangulo, 
	 * halla el area mediante la formura de Herón
	 * la guarda en la variable global area
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 */
	
	public void threeSidesArea(double sideA ,double sideB ,double  sideC) {
		
		double semiPerimeter = (sideA+sideB+sideC)/2;
		double catA = semiPerimeter-sideA;
		double catB = semiPerimeter-sideB;
		double catC = semiPerimeter-sideC;
		double sqrt = semiPerimeter*(catA*catB*catC);
		this.area = Math.sqrt(sqrt);
	}
	/**
	 * Metodo al cual calcula el area de un triangulo mediante
	 * la base y altura conocidos
	 * @param base
	 * @param height
	 */
	
	public void baseAreaAndHeight(double base, double height) {
		
		this.area = (base*height)/2;
	}
	/**
	 * Metodo que calcula el area mediante el conocimiento de dos lados y un angulo, 
	 * usando razones trigonometricas para esto
	 * @param sideA
	 * @param sideB
	 * @param angleC
	 */
	
	public void areaTwoSidesAndAnAngle(double sideA, double sideB, double angleC) {
		this.area = (sideA*sideB*Math.sin((angleC*Math.PI)/180))/2;
		
	}
	/**
	 * Metodo para calcular el area de un triangulo mediante el conocimiento de un lado y
	 * dos angulos
	 * @param sideA
	 * @param angleB
	 * @param angleC
	 */
	
	public void areaOneSideAndTwoAngles(double sideA, double angleB, double angleC) {
		this.area = (Math.pow(sideA, 2)*Math.sin((angleB*Math.PI)/180)*Math.sin((angleC*Math.PI)/180))/(2*Math.sin(((angleC+angleB)*Math.PI)/180));
	}
	/**
	 * metodo de obtencion de la variable area
	 * @return
	 */

	public double getArea() {
		return area;
	}
}
