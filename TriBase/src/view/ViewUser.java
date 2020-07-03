package view;

import java.util.Scanner;

/**
 * Clase vista la cual se encarga de la interaccion con el usuario
 * pedir datos y mostrar datos
 * @author Edwar Malpica
 * @Date 7/06/2020
 * @Version TODO
 */
public class ViewUser {

	private Scanner scanner;
	/**
	 * Constantes las cuales se usan para mostrar diferentes mensajes a lo largo
	 * de la ejecucion del programa
	 */
	public static final String MESAGE_INTRO =
			"_________________________________________________________________________________________"
			+ "|											|\r\n" + 
			"|			   /\\								|\r\n" + 
			"|			  /  \\								|\r\n" + 
			"|			 /    \\								|\r\n" + 
			"|           		/______\\	    /\\						|												\r\n" + 
			"|            				   /  \\  					|\r\n" + 
			"|			                  /    \\ 					|\r\n" + 
			"|			                 /      \\ 					|\r\n" + 
			"|			                /        \\  		   /\\			|\r\n" + 
			"|	   /\\		               /          \\  		  /  \\			|\r\n" + 
			"|	  /  \\		              /     /\\     \\  		 /    \\			|\r\n" + 
			"|	 /    \\		             /     /  \\     \\  		/______\\		|\r\n" + 
			"|	/______\\	            /     /    \\     \\ 					| 				\r\n" + 
			"|			           /     /      \\     \\  				|\r\n" + 
			"|			          /     /        \\     \\  				|\r\n" + 
			"|			         /     /          \\     \\  				|\r\n" + 
			"|			        /     /    TRI     \\     \\  				|\r\n" + 
			"|			       /     /     BASE     \\     \\  				|\r\n" + 
			"|			      /     /                \\     \\  				|\r\n" + 
			"|			     /     /                  \\     \\  				|\r\n" + 
			"|			    /     /____________________\\     \\  			|\r\n" + 
			"|			   /                                  \\  			|\r\n" + 
			"|			  /                                    \\  			|\r\n" + 
			"|			 /                                      \\  			|\r\n" + 
			"|			/________________________________________\\			|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" +  
			"|\t\t----PROGRAMA PARA CALCULAR LOS DATOS DE UN TRIANGULO----\t\t|\n|											|\n|\t\t\tElija una de las siguientes opciones:\t\t\t\t|";
	
	public static final String MESSAGE_MENU = "|_______________________________________________________________________________________|\r\n" + 
			"|											|\r\n" + 
			"|		Seleccion alguna opcion....				__		|\r\n" + 
			"|							      /\\       |  |		|\r\n" + 
			"|						  	     /	\\	 /		|\r\n" + 
			"|		--->	1.Tres lados			    /	 \\	|		|\r\n" + 
			"|		--->	2.Dos lados y un angulo		   /°	° \\	|		|\r\n" + 
			"|		--->	3.Un lado y dos angulos		  /	   \\	°		|\r\n" + 
			"|		--->	4.base y altura			 /   ____   \\			|\r\n" + 
			"|		--->	5.Salir				/____________\\			|\r\n" + 
			"|							   |     |			|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|V1.0								by @Edwar_Malpica	|\r\n" + 
			"|_______________________________________________________________________________________|\n"
			+ "_________________________________________________________________________________________";
	public static final String DEFOULT_MESSAGE = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 						      /\\		|\r\n" + 
			"|		 ______	 _____	 _____   _____	 _____	  _	     /	\\		|\r\n" + 
			"|		|	|     | |     | |     | |     |	 | |	    /°	°\\		|\r\n" + 
			"|		|______	|_____|	|_____| |     |	|_____|  | |       /  __  \\		|\r\n" + 
			"|		|	|  \\	|  \\    |     |	|  \\     |_|      /  /  \\  \\		|\r\n" + 
			"|		|______	|   \\	|   \\   |_____|	|   \\     _      /__________\\		|\r\n" + 
			"|							 |_|	    |	  |		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>El Caracter ingresado no es una opcion valida<<<-------	|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|				Presion Enter para Volver al Menu			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String MESSAGE_ERROR_NOT_OPTION = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 						      /\\		|\r\n" + 
			"|		 ______	 _____	 _____   _____	 _____	  _	     /	\\		|\r\n" + 
			"|		|	|     | |     | |     | |     |	 | |	    /°	°\\		|\r\n" + 
			"|		|______	|_____|	|_____| |     |	|_____|  | |       /  __  \\		|\r\n" + 
			"|		|	|  \\	|  \\    |     |	|  \\     |_|      /  /  \\  \\		|\r\n" + 
			"|		|______	|   \\	|   \\   |_____|	|   \\     _      /__________\\		|\r\n" + 
			"|							 |_|	    |	  |		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>Por favor ingrese una opcion de la lista<<<-------		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|				Presion Enter para Volver al Menu			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String REQUEST_DATAA = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    ° °  /  \\	° °					|\r\n" + 
			"|				   ° \\  /°  °\\	/°					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			----->>Ingresa el Valor del lado A<<-----			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String REQUEST_DATAB = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    ° °  /  \\	° °					|\r\n" + 
			"|				   ° \\  /°  °\\	/°					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			----->>Ingresa el Valor del lado B<<-----			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String REQUEST_DATAC = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    ° °  /  \\	° °					|\r\n" + 
			"|				   ° \\  /°  °\\	/°					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			----->>Ingresa el Valor del lado C<<-----			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String REQUEST_DATA_ANGLE_B = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    ° °  /  \\	° °					|\r\n" + 
			"|				   ° \\  /°  °\\	/°					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			----->>Ingresa el Valor del angulo B<<-----			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String REQUEST_DATA_ANGLE_C = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    ° °  /  \\	° °					|\r\n" + 
			"|				   ° \\  /°  °\\	/°					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			----->>Ingresa el Valor del angulo C<<-----			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String REQUEST_DATA_BASE = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    ° °  /  \\	° °					|\r\n" + 
			"|				   ° \\  /°  °\\	/°					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			----->>Ingresa el Valor de la base<<-----			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String REQUEST_DATA_HEIGHT = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    ° °  /  \\	° °					|\r\n" + 
			"|				   ° \\  /°  °\\	/°					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			----->>Ingresa el Valor de la altura<<-----			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|";
	public static final String MESSAGE_FOR_ERROR_NOT_TRIANGLE = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 						      /\\		|\r\n" + 
			"|		 ______	 _____	 _____   _____	 _____	  _	     /	\\		|\r\n" + 
			"|		|	|     | |     | |     | |     |	 | |	    /°	°\\		|\r\n" + 
			"|		|______	|_____|	|_____| |     |	|_____|  | |       /  __  \\		|\r\n" + 
			"|		|	|  \\	|  \\    |     |	|  \\     |_|      /  /  \\  \\		|\r\n" + 
			"|		|______	|   \\	|   \\   |_____|	|   \\     _      /__________\\		|\r\n" + 
			"|							 |_|	    |	  |		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>Los valores ingresados no son valores numericos<<<-------	|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|				Presion Enter para Volver al Menu			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String MESSAGE_FOR_ERROR_NOT_TRIANGLE2 = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 						      /\\		|\r\n" + 
			"|		 ______	 _____	 _____   _____	 _____	  _	     /	\\		|\r\n" + 
			"|		|	|     | |     | |     | |     |	 | |	    /°	°\\		|\r\n" + 
			"|		|______	|_____|	|_____| |     |	|_____|  | |       /  __  \\		|\r\n" + 
			"|		|	|  \\	|  \\    |     |	|  \\     |_|      /  /  \\  \\		|\r\n" + 
			"|		|______	|   \\	|   \\   |_____|	|   \\     _      /__________\\		|\r\n" + 
			"|							 |_|	    |	  |		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>Los valores ingresados no corresponden a<<<-------		|\r\n" + 
			"|			------->>>los lados de un triangulo<<<-------			|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|				Presion Enter para Volver al Menu			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String MESSAGE_FOR_ERROR_NOT_TRIANGLE3 = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 						      /\\		|\r\n" + 
			"|		 ______	 _____	 _____   _____	 _____	  _	     /	\\		|\r\n" + 
			"|		|	|     | |     | |     | |     |	 | |	    /°	°\\		|\r\n" + 
			"|		|______	|_____|	|_____| |     |	|_____|  | |       /  __  \\		|\r\n" + 
			"|		|	|  \\	|  \\    |     |	|  \\     |_|      /  /  \\  \\		|\r\n" + 
			"|		|______	|   \\	|   \\   |_____|	|   \\     _      /__________\\		|\r\n" + 
			"|							 |_|	    |	  |		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>El angulo ingresado es mayor a 180° y <<<-------		|\r\n" + 
			"|		   ------->>>ya no corresponde a un triangulo<<<-------			|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|				Presion Enter para Volver al Menu			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|\n";
	public static final String MESSAGE_FOR_RESULT_AREA_TRIANGLE = "_________________________________________________________________________________________\r\n" + 
			"|V1.0											|\r\n" + 
			"|			------RESULTADOS DATOS DEL TRIANGULO------			|\r\n" + 
			"|											|\r\n" + 
			"|	+ Clasificacion por Magnitud de lados = %s 	 			|\r\n" + 
			"|	+ Clasificacion por Angulos = %s					|\r\n" + 
			"|	+ Perimetro = %1.2f cm			       /|				|\r\n" + 
			"|	+ Area = %1.2f cm²			      /	|				|\r\n" + 
			"|	+ Lado a = %1.2f cm			     /	|				|\r\n" + 
			"|	+ Lado b = %1.2f cm			    / 	|				|\r\n" + 
			"|	+ Lado c = %1.2f cm			   /	|				|\r\n" + 
			"|	+ Angulo A = %1.2f°			  /     |				|\r\n" + 
			"|	+ Angulo B = %1.2f°			 /	|				|\r\n" + 
			"|	+ Angulo C = %1.2f°			/_______|				|\r\n" + 
			"|	+ Base = %1.2f cm								|\r\n" + 
			"|	+ Altura A = %1.2f cm								|\r\n" + 
			"|	+ Altura B = %1.2f cm								|\r\n" + 
			"|	+ Altura C = %1.2f cm								|\r\n" + 
			"|				Presion Enter para Volver al Menu			|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|" + 
			"";
	public static final String MESSAGE_END ="_________________________________________________________________________________________\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 ____	  ___		  __   __   __		     /\\			|\r\n" + 
			"|		|    \\ 	 /   \\   \\    /	 |  | |	 | |  | 	    /  \\		|\r\n" + 
			"|		|____/  /     \\   \\  /	 |  | |	 | |  | 	   /°¬°¬\\		|\r\n" + 
			"|		|    \\  |_____|    \\/	 |__| |__| |__|	       \\  /  __  \\		|\r\n" + 
			"|		|     | |     |     |	  __   __   __		\\/        \\		|\r\n" + 
			"|		|____/  |     |     |	 |__| |__| |__|	        /__________\\		|\r\n" + 
			"|			      			  	          |	|		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>GRACIAS POR USAR TRIBASE V1.0<<<-------			|\r\n" + 
			"|		  									|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|								@Edwar_Malpica		|\r\n" + 
			"|_______________________________________________________________________________________|";
	/**
	 * Metodo constructor que inicializa la instancia de la clase
	 * Scanner
	 */
	public ViewUser() {
		scanner = new Scanner(System.in);
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendMessageIntro() {
		System.out.println(MESAGE_INTRO);
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendMessageMenu() {
		System.out.println(MESSAGE_MENU);
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendMessageErrorNotOption() {
		System.out.println(MESSAGE_ERROR_NOT_OPTION);
		scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String inputOpcion() {
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendDeoultMessage() {
		System.out.println(DEFOULT_MESSAGE);
		scanner.nextLine();
		
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String sendRequestDataA() {
		System.out.println(REQUEST_DATAA);
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String sendRequestDataB() {
		System.out.println(REQUEST_DATAB);
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String sendRequestDataC() {
		System.out.println(REQUEST_DATAC);
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String sendRequestDataAngleB() {
		System.out.println(REQUEST_DATA_ANGLE_B);
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String sendRequestDataAngleC() {
		System.out.println(REQUEST_DATA_ANGLE_C);
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String sendRequestDataBase() {
		System.out.println(REQUEST_DATA_BASE);
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo y recoge un dato
	 */
	public String sendRequestDataHeight() {
		System.out.println(REQUEST_DATA_HEIGHT);
		return scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendMessageForErrorNotTriangle() {
		System.out.println(MESSAGE_FOR_ERROR_NOT_TRIANGLE);
		scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendMessageForErrorNotTriangle2() {
		System.out.println(MESSAGE_FOR_ERROR_NOT_TRIANGLE2);
		scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendMessageForErrorNotTriangle3() {
		System.out.println(MESSAGE_FOR_ERROR_NOT_TRIANGLE3);
		scanner.nextLine();
	}
	/**
	 * Metodo que muestra un mensaje informativo
	 */
	public void sendMessageForResultAreaTriangle(String type,String typeForAngle,double perimeter,double area, double sideA,double sideB,double sideC,double angleA,double angleB,double angleC,double base,double heightA,double heightB, double heightC ) {
		System.out.printf(MESSAGE_FOR_RESULT_AREA_TRIANGLE,type,typeForAngle,perimeter,area,sideA,sideB,sideC,angleA,angleB,angleC,base,heightA,heightB,heightC);
		scanner.nextLine();
	}
	/**
	 * Metodo que cierra la instancia de la clase Scanner
	 */
	public void endClose() {
		scanner.close();
		System.out.println(MESSAGE_END);
	}
	
}
