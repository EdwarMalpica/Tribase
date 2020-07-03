package model;



public class AbstractTriangle {

	private double sideA;
	private double sideB;
	private double sideC;
	private double angleA;
	private double angleB;
	private double angleC;
	private double base;
	private double height;
	private double heightB;
	private double heightC;
	private double area;
	private double perimeter;
	private double pointA;
	private double pointB;
	private double pointC;
	private TriangleType type;
	private TypeOfTriangleByAngles typeForAngle;
	
	
	public AbstractTriangle(double base,double height) {
		this.base = base;this.sideA = base;
		this.height = height;this.sideB = height;
		baseAreaAndHeight(this.base,this.height);
		pythagorasTheorem(this.sideA,this.sideB);
		calculatePerimeter(this.sideA,this.sideB,this.sideC);
		calculateAngleForRectangle(this.sideA,this.sideB,this.sideC);
		
		this.type = TriangleType.ESCALENO;
		this.typeForAngle = TypeOfTriangleByAngles.RECTANGULO;
	}
	
	public AbstractTriangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		threeSidesArea(this.sideA,this.sideB,this.sideC);
		calculatePerimeter(this.sideA,this.sideB,this.sideC);
		calculateAngleForThreeSide(this.sideA,this.sideB,this.sideC);
		calculateHeight(this.sideA,this.sideB,this.sideC);
		definedTypeOfTriangle();
		definedTypeOfTriangleForAngle();
		
		
	}
	public AbstractTriangle(int opcion1, double sideA,double sideB, double angleC) {
		this.sideA = sideA;
		this.sideB = sideB;
		calculateMissingSide(sideA,sideB,angleC);
		calculateAngleForThreeSide(sideA,sideB,this.sideC);
		areaTwoSidesAndAnAngle(sideA,sideB,angleC);
		calculatePerimeter(sideA, sideB, this.sideC);
		calculateHeight(sideA,sideB,this.sideC);
		definedTypeOfTriangle();
		definedTypeOfTriangleForAngle();
		
	}
	public AbstractTriangle(double sideA, double angleB, double angleC,int opcion2) {
		this.sideA = sideA;
		this.angleB= angleB;
		this.angleB= angleB;
		calculateMissingAngle(angleB,angleC);
		calculateMissngSides(sideA,angleB,angleC);
		calculateAngleForThreeSide(sideA,this.sideB,this.sideC);
		threeSidesArea(sideA,this.sideB,this.sideC);
		calculatePerimeter(sideA, this.sideB, this.sideC);
		calculateHeight(sideA,this.sideB,this.sideC);
		definedTypeOfTriangle();
		definedTypeOfTriangleForAngle();
		
	}
	
	
	


	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", angleA=" + angleA + ", angleB="
				+ angleB + ", angleC=" + angleC + ", base=" + base + ", height=" + height + ", heightB=" + heightB
				+ ", heightC=" + heightC + ", area=" + area + ", perimeter=" + perimeter + ", pointA=" + pointA
				+ ", pointB=" + pointB + ", pointC=" + pointC + ", type=" + type + ", typeForAngle=" + typeForAngle
				+ "]";
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
	 * Metodo que calcula el area mediante el conocimiento de dos lados y un angulo, 
	 * usando razones trigonometricas para esto
	 * @param sideA
	 * @param sideB
	 * @param angleC
	 */
	
	public void areaTwoSidesAndAnAngle(double sideA, double sideB, double angleC) {
		this.area = Math.rint(100*((sideA*sideB*Math.sin((angleC*Math.PI)/180))/2))/100;
		
	}
	
	public void pythagorasTheorem(double catA,double catB) {
		this.sideC = Math.sqrt( Math.pow(catA, 2)+Math.pow(catB, 2));
		
	}
	
	
	public void calculatePerimeter(double sideA, double sideB, double sideC) {
		this.perimeter = sideA+sideB+sideC;
	}
	
	private void calculateAngleForRectangle(double sideA, double sideB, double sideC) {
		this.angleA = Math.round( Math.toDegrees(Math.asin(sideA/sideC)));
		this.angleB = Math.round( Math.toDegrees(Math.asin(sideB/sideC)));
		this.angleC = 180 - (angleA+angleB);
		
	}
	
	private void calculateAngleForThreeSide(double sideA, double sideB, double sideC) {
		this.angleA =Math.rint(100*(Math.toDegrees(Math.acos((-(Math.pow(sideA,2))+(Math.pow(sideB, 2))+(Math.pow(sideC, 2)))/(2*sideB*sideC)))))/100;
		this.angleB =Math.rint(100*(Math.toDegrees(Math.acos((-(Math.pow(sideB,2))+(Math.pow(sideA, 2))+(Math.pow(sideC, 2)))/(2*sideA*sideC)))))/100;
		//this.angleB =Math.round(Math.toDegrees(Math.asin((sideB*Math.sin(Math.toRadians(this.angleA)))/sideA)));
		this.angleC = 180-(this.angleA+this.angleB);
	}
	private void calculateHeight(double sideA,double sideB,double sideC) {
		double semiPerimeter = (sideA+sideB+sideC)/2;
		double catA = semiPerimeter-sideA;
		double catB = semiPerimeter-sideB;
		double catC = semiPerimeter-sideC;
		double sqrt = semiPerimeter*(catA*catB*catC);
		this.height = Math.rint(100* ((2*( Math.sqrt(sqrt) ))/sideA))/100;
		this.heightB =Math.rint(100*  ((2*( Math.sqrt(sqrt) ))/sideB))/100;
		this.heightC = Math.rint(100* ((2*( Math.sqrt(sqrt) ))/sideC))/100;
		
	}
	
	private void calculateMissingSide(double sideA,double sideB,double angleC) {
		this.sideC =Math.round( Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2)-2*sideA*sideB*Math.cos(Math.toRadians(angleC))));
		
	}
	
	private void calculateMissingAngle(double angleB,double angleC) {
		this.angleA = 180 - (Math.rint(100*(angleB+angleC))/100);
	}
	private void calculateMissngSides(double sideA, double angleB, double angleC) {
		this.sideB = Math.rint(100*(sideA*(Math.sin(Math.toRadians(angleB))))/(Math.sin(Math.toRadians(this.angleA))))/100;
	
		this.sideC = Math.rint(100*(sideA*(Math.sin(Math.toRadians(angleC))))/(Math.sin(Math.toRadians(this.angleA))))/100;
		
	}
	
	public void definedTypeOfTriangle() {
		if(sideA==sideB&&sideA==sideC&&sideB==sideC) {
			this.type = TriangleType.EQUILATERO;
		}else if(sideA==sideB||sideA==sideB||sideC==sideB) {
			this.type = TriangleType.ISOCELES;
		}else {
			this.type = TriangleType.ESCALENO;
		}
	}
	public void definedTypeOfTriangleForAngle() {
		if(angleA==90||angleB==90||angleC==90) {
			this.typeForAngle = TypeOfTriangleByAngles.RECTANGULO;
		}else if(angleA>90||angleB>90||angleC>90) {
			this.typeForAngle = TypeOfTriangleByAngles.OBTUSANGULO;
		}else {
			this.typeForAngle = TypeOfTriangleByAngles.ACUTANGULO;
		}
	}
	
	
	
	public double getSideA() {
		return sideA;
	}


	public void setSideA(double sideA) {
		this.sideA = sideA;
	}


	public double getSideB() {
		return sideB;
	}


	public void setSideB(double sideB) {
		this.sideB = sideB;
	}


	public double getSideC() {
		return sideC;
	}


	public void setSideC(double sideC) {
		this.sideC = sideC;
	}


	public double getAngleA() {
		return angleA;
	}


	public void setAngleA(double angleA) {
		this.angleA = angleA;
	}


	public double getAngleB() {
		return angleB;
	}


	public void setAngleB(double angleB) {
		this.angleB = angleB;
	}


	public double getAngleC() {
		return angleC;
	}


	public void setAngleC(double angleC) {
		this.angleC = angleC;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public double getPointA() {
		return pointA;
	}







	public void setPointA(double pointA) {
		this.pointA = pointA;
	}







	public double getPointB() {
		return pointB;
	}







	public void setPointB(double pointB) {
		this.pointB = pointB;
	}







	public double getPointC() {
		return pointC;
	}







	public void setPointC(double pointC) {
		this.pointC = pointC;
	}







	public TriangleType getType() {
		return type;
	}


	public void setType(TriangleType type) {
		this.type = type;
	}


	public TypeOfTriangleByAngles getTypeForAngle() {
		return typeForAngle;
	}


	public void setTypeForAngle(TypeOfTriangleByAngles typeForAngle) {
		this.typeForAngle = typeForAngle;
	}







	public double getHeight() {
		return height;
	}







	public void setHeight(double height) {
		this.height = height;
	}







	public double getBase() {
		return base;
	}







	public void setBase(double base) {
		this.base = base;
	}

	public double getHeightB() {
		return heightB;
	}

	public void setHeightB(double heightB) {
		this.heightB = heightB;
	}

	public double getHeightC() {
		return heightC;
	}

	public void setHeightC(double heightC) {
		this.heightC = heightC;
	}
	
}
