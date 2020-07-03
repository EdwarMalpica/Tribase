package view;

import properties.MyProperties;

public class Constants {
	
	private MyProperties myProperties;
	private AppInfo appInfo;
	private MenuOpcions menuOpcions;
	private MenuInfo menuInfo;
	private FormContent formContent;
	private ErrorContent errorContent;
	private String exitContent;
	private String[] resultContent;
	
	public Constants(MyProperties myProperties){
		this.myProperties = myProperties;
		generateAppInfo();
		generateMenuOpcions();
		generateMenuInfo();
		generateFormContent();
		generateErrorContent();
		generateExitContent();
		generateResultContent();
	}
	

	//Splash
	
	
	public static final AppInfo APP_INFO = new AppInfo("TRI","BASE","V2.0","@Edwar_Malpica","Calcular el area de un triangulo <<<----","2020");//Una forma de agrupar
	public void generateAppInfo() {
		String[] dates = myProperties.getKeyLanguage("appInfo").split(",");
		this.appInfo = new AppInfo(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5]);
	}
	public static final String SPLASH_IMAGE = "_________________________________________________________________________________________\r\n" + 
			"|											|\r\n" + 
			"|			   /\\								|\r\n" + 
			"|			  /  \\								|\r\n" + 
			"|			 /    \\								|\r\n" + 
			"|           		/______\\	    /\\						|\r\n" + 
			"|            				   /  \\  					|\r\n" + 
			"|			                  /    \\ 					|\r\n" + 
			"|			                 /      \\ 					|\r\n" + 
			"|			                /        \\  		   /\\			|\r\n" + 
			"|	   /\\		               /          \\  		  /  \\			|\r\n" + 
			"|	  /  \\		              /     /\\     \\  		 /    \\			|\r\n" + 
			"|	 /    \\		             /     /  \\     \\  		/______\\		|\r\n" + 
			"|	/______\\	            /     /    \\     \\ 					|\r\n" + 
			"|			           /     /      \\     \\  				|\r\n" + 
			"|			          /     /        \\     \\  				|\r\n" + 
			"|			         /     /          \\     \\  				|\r\n" + 
			"|			        /     /    %s\\     \\  				|\r\n" + 
			"|			       /     /     %s\\     \\  				|\r\n" + 
			"|			      /     /      %s\\     \\  				|\r\n" + 
			"|			     /     /                  \\     \\  				|\r\n" + 
			"|			    /     /____________________\\     \\  			|\r\n" + 
			"|			   /                                  \\  			|\r\n" + 
			"|			  /                                    \\  			|\r\n" + 
			"|			 /                                      \\  			|\r\n" + 
			"|			/________________________________________\\			|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|			---->>> %s |\r\n" + 
			"|											|\r\n" + 
			"|				%s-%s|\r\n" + 
			"|_______________________________________________________________________________________|\r\n";
	
	//Menu
	
	public static final MenuOpcions MENU_OPCION = new MenuOpcions("1.Base y Altura","2.Tres lados","3.Dos lados y un Angulo","4.Un lado y dos angulos","5.Salir");
	public void generateMenuOpcions() {
		String[] dates = myProperties.getKeyLanguage("menuOptions").split(",");
		this.menuOpcions = new MenuOpcions(dates[0], dates[1], dates[2],dates[3], dates[4]);
	}
	public static final String DESING_MENU = "_________________________________________________________________________________________\r\n" + 
			"|											|\r\n" + 
			"|		%s	__		|\r\n" + 
			"|		%s	      /\\       |  |		|\r\n" + 
			"|							     /	\\	 /		|\r\n" + 
			"|		--->	%s		    /	 \\	|		|\r\n" + 
			"|		--->	%s/�	� \\	|		|\r\n" + 
			"|		--->	%s/	   \\	�		|\r\n" + 
			"|		--->	%s	 /   ____   \\			|\r\n" + 
			"|		--->	%s		/____________\\			|\r\n" + 
			"|							   |     |			|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|%s							 %s|\r\n" + 
			"|_______________________________________________________________________________________|\r\n";
	public static final MenuInfo MENU_INFO = new MenuInfo("Segun los datos que tenga del triangulo","seleccione una opcion:");
	public void generateMenuInfo() {
		String[] dates = myProperties.getKeyLanguage("menuInfo").split(",");
		this.menuInfo = new MenuInfo(dates[0],dates[1]);
	}
	//Form
	
	public static final String DESING_FORM = "_________________________________________________________________________________________\r\n" + 
			"|%s										|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 		          /\\						|\r\n" + 
			"|				    � �  /  \\	� �					|\r\n" + 
			"|				   � \\  /�  �\\	/�					|\r\n" + 
			"|		 		      \\/      \\/					|\r\n" + 
			"|		  		      /  \\__/  \\  					|\r\n" + 
			"|	   			     /__________\\					|\r\n" + 
			"|		  		        |    |						|\r\n" + 
			"|											|\r\n" + 
			"|			---->%s		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|								%s|\r\n" + 
			"|_______________________________________________________________________________________|\r\n";
	public static final FormContent FORM_CONTENT = new FormContent("Ingrese el valor de la base<-----", "Ingrese el valor de la altura<-----", "Ingrese el valor del lado A<-----", "Ingrese el valor del lado B<-----","Ingrese el valor del lado C<-----","Ingrese el valor del angulo B<-----","Ingrese el valor del lado C<-----");
	public void generateFormContent() {
		String[] dates = myProperties.getKeyLanguage("formContent").split(",");
		this.formContent = new FormContent(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5],dates[6]);	
	}
	
	//Error
	public static final String DESING1_EROR = "_________________________________________________________________________________________ \r\n" + 
			"|%s										|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 						      /\\		|\r\n" + 
			"|		 ______	 _____	 _____   _____	 _____	  _	     /	\\		|\r\n" + 
			"|		|	|     | |     | |     | |     |	 | |	    /�	�\\		|\r\n" + 
			"|		|______	|_____|	|_____| |     |	|_____|  | |       /  __  \\		|\r\n" + 
			"|		|	|  \\	|  \\    |     |	|  \\     |_|      /  /  \\  \\		|\r\n" + 
			"|		|______	|   \\	|   \\   |_____|	|   \\     _      /__________\\		|\r\n" + 
			"|							 |_|	    |	  |		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>%s|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|				%s		|\r\n" + 
			"|											|\r\n" + 
			"|								%s|\r\n" + 
			"|_______________________________________________________________________________________|\r\n";
	public static final String DESING2_EROR = "_________________________________________________________________________________________ \r\n" + 
			"|%s										|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 						      /\\		|\r\n" + 
			"|		 ______	 _____	 _____   _____	 _____	  _	     /	\\		|\r\n" + 
			"|		|	|     | |     | |     | |     |	 | |	    /�	�\\		|\r\n" + 
			"|		|______	|_____|	|_____| |     |	|_____|  | |       /  __  \\		|\r\n" + 
			"|		|	|  \\	|  \\    |     |	|  \\     |_|      /  /  \\  \\		|\r\n" + 
			"|		|______	|   \\	|   \\   |_____|	|   \\     _      /__________\\		|\r\n" + 
			"|							 |_|	    |	  |		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>%s|\r\n" + 
			"|			----->%s	|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|				%s		|\r\n" + 
			"|											|\r\n" + 
			"|								%s|\r\n" + 
			"|_______________________________________________________________________________________|\r\n";
	public static final ErrorContent ERROR_CONTEN = new ErrorContent("Presione ENTER para volver al menu<<<-------","El Caracter ingresado no es una opcion valida<<<-------", 
			"Por favor ingrese una opcion de la lista<<<-------", "Los valores ingresados no son valores numericos<<<-------", "Los valores ingresados no corresponden a<<<-------", 
			"los lados de un triangulo<-----", "El angulo ingresado es mayor a 180� y<<<------- ", "ya no corresponde a un triangulo<-----");
	public void generateErrorContent() {
		String[] dates = myProperties.getKeyLanguage("errorContent").split(",");
		this.errorContent = new ErrorContent(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5],dates[6],dates[7]);
	}
	
	//Exit
	public static final String DESING_EXIT = "_________________________________________________________________________________________\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		 ____	  ___		  __   __   __		     /\\			|\r\n" + 
			"|		|    \\ 	 /   \\   \\    /	 |  | |	 | |  | 	    /  \\		|\r\n" + 
			"|		|____/  /     \\   \\  /	 |  | |	 | |  | 	   /����\\		|\r\n" + 
			"|		|    \\  |_____|    \\/	 |__| |__| |__|	       \\  /  __  \\		|\r\n" + 
			"|		|     | |     |     |	  __   __   __		\\/        \\		|\r\n" + 
			"|		|____/  |     |     |	 |__| |__| |__|	        /__________\\		|\r\n" + 
			"|			      			  	          |	|		|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|		------->>>%s %s%s %s%s		|\r\n" + 
			"|		  									|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|											|\r\n" + 
			"|								%s|\r\n" + 
			"|_______________________________________________________________________________________|\r\n";
	public static final String EXIT_CONTENT = "Gracias por usar";
	public void generateExitContent() {
		this.exitContent =  myProperties.getKeyLanguage("exitConten");
	}
	public static final String EXIT_ARROW = "<<<-------";
	
	//Results
	public static final String RESULT_DESING = "_________________________________________________________________________________________\r\n" + 
			"|%s										|\r\n" + 
			"|			------%s		|\r\n" + 
			"|											|\r\n" + 
			"|	 	 									|\r\n" + 
			"|											|\r\n" + 
			"|				       		       /|				|\r\n" + 
			"|	+ %s= %1.2f cm�      		      /	|				|\r\n" + 
			"|	+ %s= %1.2f cm   		     /	|				|\r\n" + 
			"|	+ %s= %1.2f cm   		    / 	|				|\r\n" + 
			"|	+ %s= %1.2f cm   		   /	|				|\r\n" + 
			"|				  	    %1.2f /     |				|\r\n" + 
			"|				 		 /	|%1.2f  			|\r\n" + 
			"|					 	/%1.2f  |				|\r\n" + 
			"|				  	       / 	|				|\r\n" + 
			"|					      /_________|				|\r\n" + 
			"|						  %1.2f         			|\r\n" + 
			"|											|\r\n" + 
			"|				%s		|\r\n" + 
			"|											|\r\n" + 
			"|								%s|\r\n" + 
			"|_______________________________________________________________________________________|\r\n";
	public static final String[] RESULT_CONTENT = new String[]{"RESULTADOS DATOS DEL TRIANGULO------","Area", "Lado a","Lado b","Lado c","Presion Enter para Volver al Menu"};
	public void generateResultContent() {
		resultContent = myProperties.getKeyLanguage("resultConten").split(",");
		
	}
	public MyProperties getMyProperties() {
		return myProperties;
	}
	public void setMyProperties(MyProperties myProperties) {
		this.myProperties = myProperties;
	}
	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public MenuOpcions getMenuOpcions() {
		return menuOpcions;
	}
	public void setMenuOpcions(MenuOpcions menuOpcions) {
		this.menuOpcions = menuOpcions;
	}
	public MenuInfo getMenuInfo() {
		return menuInfo;
	}
	public void setMenuInfo(MenuInfo menuInfo) {
		this.menuInfo = menuInfo;
	}
	public FormContent getFormContent() {
		return formContent;
	}
	public void setFormContent(FormContent formContent) {
		this.formContent = formContent;
	}
	public ErrorContent getErrorContent() {
		return errorContent;
	}
	public void setErrorContent(ErrorContent errorContent) {
		this.errorContent = errorContent;
	}
	public String getExitContent() {
		return exitContent;
	}
	public void setExitContent(String exitContent) {
		this.exitContent = exitContent;
	}
	public String[] getResultContent() {
		return resultContent;
	}
	public void setResultContent(String[] resultContent) {
		this.resultContent = resultContent;
	}
	
	

}
