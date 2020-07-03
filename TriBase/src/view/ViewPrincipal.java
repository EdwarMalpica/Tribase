package view;


import java.util.Scanner;

import properties.MyProperties;

public class ViewPrincipal {

	private Scanner scanner;
	private Splash splash;
	private Menu menu;
	private Form form;
	private Error error;
	private Exit exit;
	private Constants constants;
	
	
	public ViewPrincipal(MyProperties pro) {
		constants = new Constants(pro);
		scanner = new Scanner(System.in);
		splash = new Splash(constants.getAppInfo(),Constants.SPLASH_IMAGE);
		menu = new Menu(Constants.DESING_MENU,constants.getMenuInfo(),constants.getMenuOpcions(),constants.getAppInfo());
		form = new Form(constants.getAppInfo(),constants.getFormContent(),Constants.DESING_FORM);
		error = new Error(Constants.DESING1_EROR,Constants.DESING2_EROR,constants.getErrorContent(),constants.getAppInfo());
		exit = new Exit(Constants.DESING_EXIT,constants.getAppInfo(),constants.getExitContent());
		init();
	}
	
	public void init() {
		splash.show();
		menu.show();
	}
	//get data
	public String getMenuOpcion() {
		return scanner.nextLine();
	}
	public String getDoubleData() {
		return scanner.nextLine();
	}
	//Forms
	public void showFormRequestBaseData() {
		form.FormRequesBaseData();
	}
	public void showFormRequestHeightData() {
		form.FormRequesHeightData();
	}
	public void showFormRequestSideAData() {
		form.FormRequesSideAData();
	}
	public void showFormRequestSideBData() {
		form.FormRequesSideBData();
	}
	public void showFormRequestSideCData() {
		form.FormRequesSideCData();
	}
	public void showFormRequestAngleBData() {
		form.FormRequesAngleBData();
	}
	public void showFormRequestAngleCData() {
		form.FormRequesAngleCData();
	}
											
	//ERRORS
	public void showErrorInvalidOption() {
		error.showErrorInvalidOption();
	}
	public void showErrorNotOption() {
		error.showErrorNotOption();
	}
	public void showErrorNotNumber() {
		error.showErrorNotNumber();
	}
	public void showErrorNotTriangle() {
		error.showErrorNotTriangle();
	}
	public void showErrorNotAngle() {
		error.showErrorNotAngle();
	}
	//Results
	public void showResult(double area,double sideA,double sideB,double sideC) {
		Result result = new Result(Constants.RESULT_DESING,Constants.APP_INFO,
				new ResultContent(constants.getResultContent()[0],constants.getResultContent()[1], area,
						constants.getResultContent()[2],sideA,constants.getResultContent()[3], sideB,
						constants.getResultContent()[4], sideC,constants.getResultContent()[5]));
		result.show();
	}
	
	//Exit
	public void showExit() {
		exit.showExit();
	}
	public void close() {
		scanner.close();
	}
	
	public static void main(String[] args) {
		//new ViewPrincipal();
	}
}
