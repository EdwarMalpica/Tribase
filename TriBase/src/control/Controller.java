package control;

import model.*;
import properties.MyProperties;
import view.ViewPrincipal;
//import view.ViewUser;
import java.lang.NumberFormatException;
import java.lang.StringIndexOutOfBoundsException;



/**
 * Clase Controller la cual se encarga de las funciones como son
 * llamada de metodos del modelo
 * llamda de metodos de la vista
 * @author Edwar Malpica
 * @Date 7/06/2020
 * @Version TODO
 */
public class Controller {
	
	private ViewPrincipal view;
	//private ViewUser viU;
	private Manager ma;
	private MyProperties pro;
/**
 * Constructor el cual inicia las instancias de la clase del modelo y la clase
 * de las vistas, ademas de llamar al metodo de bienvenida e iniciar 
 * el metodo init el cual contiene el menu
 */
	public Controller() {
		pro = new MyProperties();
		//viU = new ViewUser();
		view = new ViewPrincipal(getPro());
		
		//ma = new Manager(3.77,50.69,68.16,1);
		
		//viU.sendMessageIntro();
		init();
		
	}
	
	/**
	 * metodo el cual contiene el menu de opciones mediante la evalucion
	 * del valor obtenido por la vista
	 */
	private void init() {
		try {
			switch (validateOpcion(view.getMenuOpcion())) {
			case 1:
				threeSidesArea();
				init();
				break;
			case 2:
				areaTwoSidesAndAnAngle();
				init();
				break;
			case 3:
				areaOneSideAndTwoAngles();
				init();
				break;
			case 4:
				baseAreaAndHeight();
				init();
				break;
			case 5:
				endClose();
				break;
			
			default:
				defaultMessage();
				init();
				break;
			}
		} catch (StringIndexOutOfBoundsException e) {
			//viU.sendMessageErrorNotOption();
			view.showErrorInvalidOption();
			init();
		}
		
	}
	
	/**
	 * metodo para validad que la opcion ingresada sea un numero 
	 * de las opciones disponibles
	 * @param input
	 * @return
	 */
	private int validateOpcion(String input) {
		int result = 0;
		if (input!=null) {
			if(input.charAt(0)>48&&input.charAt(0)<54 && input.length() == 1) {
				result = Integer.parseInt(input);
			}
		}
		
		return result;
	}
	/**
	 * metodo fachada el cual llama al metodo de la vista para mostrar un mensaje
	 * 
	 */
	private void defaultMessage() {
		//viU.sendDeoultMessage();
		view.showErrorNotOption();
	}
	/**
	 * metodo fachada el cual se encarga de llamar a la vista para la obtencio de datos
	 * para el metodo threeSidesArea, ademas de hacer las respectivas validaciones de estos
	 */
	
	public void threeSidesArea() {
		view.showFormRequestSideAData();
		String sideA = view.getDoubleData();
		view.showFormRequestSideBData();
		String sideB = view.getDoubleData();
		view.showFormRequestSideCData();
		String sideC = view.getDoubleData();
		if(validateIfTriangleThreeSides(sideA,sideB,sideC)) {
			ma = new Manager( Double.parseDouble(sideA), Double.parseDouble(sideB),Double.parseDouble(sideC));
			view.showResult(ma.getArea(),ma.getSideA(), ma.getSideB(),ma.getSideC());
		}
	}
	/**
	 * metodo para validar que los datos tengan el formato correspondiente
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 * @return
	 */
	private boolean validateIfTriangleThreeSides(String sideA,String sideB,String sideC) {
		boolean result = false;
		try {
			double sideADouble = Double.parseDouble(sideA);
			double sideBDouble = Double.parseDouble(sideB);
			double sideCDouble = Double.parseDouble(sideC);
			if((sideADouble+sideBDouble)>sideCDouble&&(sideADouble+sideCDouble)>sideBDouble&&(sideCDouble+sideBDouble)>sideADouble) {
				result = true;
			}else {
				view.showErrorNotTriangle();
				//viU.sendMessageForErrorNotTriangle2();
				init();
			}
		} catch (NumberFormatException e) {
			view.showErrorNotNumber();
			//viU.sendMessageForErrorNotTriangle();
			init();
		}
		
		return result;
	}
	/**
	 * metodo fachada el cual se encarga de llamar a la vista para la obtencio de datos
	 * para el metodo areaTwoSidesAndAnAngle, ademas de hacer las respectivas validaciones de estos
	 */
	
	public void areaTwoSidesAndAnAngle() {
		
		view.showFormRequestSideAData();
		String sideA = view.getDoubleData();
		view.showFormRequestAngleBData();
		String sideB = view.getDoubleData();
		view.showFormRequestAngleCData();;
		String angleC = view.getDoubleData();
		if(validateIfAreaTwoSidesAndAnAngle(sideA,sideB,angleC)) {
			ma = new Manager(1,Double.parseDouble(sideA),Double.parseDouble(sideB),Double.parseDouble(angleC));
//			viU.sendMessageForResultAreaTriangle(ma.getType().toString(),
//					ma.getTypeForAngle().toString(),ma.getPerimeter(),
//					ma.getArea(),ma.getSideA(),ma.getSideB(),ma.getSideC(),
//					ma.getAngleA(),ma.getAngleB(),ma.getAngleC(),ma.getBase(),
//					ma.getHeight(),ma.getHeightB(),ma.getHeightC());
			view.showResult(ma.getArea(),ma.getSideA(), ma.getSideB(),ma.getSideC());
		}
	}
	/**
	 * metodo para validar que los datos tengan el formato correspondiente
	 * @param sideA
	 * @param sideB
	 * @param angleC
	 * @return
	 */
	private boolean validateIfAreaTwoSidesAndAnAngle(String sideA, String sideB, String angleC) {
		boolean result = false;
		try {
			Double.parseDouble(sideA);
			Double.parseDouble(sideB);
			double angleCDouble = Double.parseDouble(angleC);
			if(angleCDouble< 180) {
				result = true;
			}else {
				//viU.sendMessageForErrorNotTriangle3();
				view.showErrorNotAngle();
				init();
			}
		} catch (NumberFormatException e) {
			//viU.sendMessageForErrorNotTriangle();
			view.showErrorNotNumber();
			init();
		}
		return result;
	}
	/**
	  * metodo fachada el cual se encarga de llamar a la vista para la obtencio de datos
	 * para el metodo areaOneSideAndTwoAngles, ademas de hacer las respectivas validaciones de estos
	 */
	
	public void areaOneSideAndTwoAngles(){
		view.showFormRequestSideAData();
		String sideA = view.getDoubleData();
		view.showFormRequestAngleBData();
		String angleB = view.getDoubleData();
		view.showFormRequestAngleCData();
		String angleC = view.getDoubleData();
		if(validateIfAreaOneSideAndTwoAngles(sideA,angleB,angleC)) {
			ma = new Manager(Double.parseDouble(sideA), Double.parseDouble(angleB), Double.parseDouble(angleC),1);
//			viU.sendMessageForResultAreaTriangle(ma.getType().toString(),
//					ma.getTypeForAngle().toString(),ma.getPerimeter(),ma.getArea(),
//					ma.getSideA(),ma.getSideB(),ma.getSideC(),ma.getAngleA(),
//					ma.getAngleB(),ma.getAngleC(),ma.getBase(),ma.getHeight(),
//					ma.getHeightB(),ma.getHeightC());
			view.showResult(ma.getArea(),ma.getSideA(), ma.getSideB(),ma.getSideC());
		}
		
	}
	/**
	 * metodo para validar que los datos tengan el formato correspondiente
	 * @param sideA
	 * @param angleB
	 * @param angleC
	 * @return
	 */
	private boolean validateIfAreaOneSideAndTwoAngles(String sideA,String angleB,String angleC) {
		boolean result = false;
		try {
			Double.parseDouble(sideA);
			double angleBDouble =Double.parseDouble(angleB);
			double angleCDouble = Double.parseDouble(angleC);
			if(angleCDouble+angleBDouble< 180) {
				result = true;
			}else {
				//viU.sendMessageForErrorNotTriangle3();
				view.showErrorNotAngle();
				init();
			}
		} catch (NumberFormatException e) {
			//viU.sendMessageForErrorNotTriangle();
			view.showErrorNotNumber();
			init();
		}
		return result;
	}
	/**
	 * * metodo fachada el cual se encarga de llamar a la vista para la obtencio de datos
	 * para el metodo baseAreaAndHeight, ademas de hacer las respectivas validaciones de estos
	 */
	
	public void baseAreaAndHeight() {
		view.showFormRequestBaseData();
		String base = view.getDoubleData();
		view.showFormRequestHeightData();
		String height = view.getDoubleData();
		if(validateIfbaseAreaAndHeight(base,height)) {
			ma = new Manager(Double.parseDouble(base),Double.parseDouble(height));
//			viU.sendMessageForResultAreaTriangle(ma.getType().toString(),
//					ma.getTypeForAngle().toString(),ma.getPerimeter(),
//					ma.getArea(),ma.getSideA(),ma.getSideB(),ma.getSideC(),
//					ma.getAngleA(),ma.getAngleB(),ma.getAngleC(),ma.getBase(),
//					ma.getHeight(),ma.getHeightB(),ma.getHeightC());
			view.showResult(ma.getArea(),ma.getSideA(), ma.getSideB(),ma.getSideC());
		}
		
	}
	/**
	 * metodo para validar que los datos tengan el formato correspondiente
	 * @param base
	 * @param height
	 * @return
	 */
	private boolean validateIfbaseAreaAndHeight(String base, String height) {
		boolean result = false;
		try {
			Double.parseDouble(base);
			Double.parseDouble(height);
			result = true;
		} catch (NumberFormatException e) {
			//viU.sendMessageForErrorNotTriangle();
			view.showErrorNotNumber();
			init();
		}
		
		
		return result;
		
	}
	
	public MyProperties getPro() {
		return pro;
	}

	public void setPro(MyProperties pro) {
		this.pro = pro;
	}

	/**
	 * metodo que se encarga de cerrar las instancias iniciadas en el programa
	 */
	private void endClose() {
		//viU.endClose();
		view.close();
	}
	/**
	 * Metodo el principal el cual se encarga de instanciar la clase controller
	 * @param args
	 */
	public static void main(String[] args) {
		new Controller();
	}
	
}
