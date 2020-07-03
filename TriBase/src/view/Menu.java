package view;



public class Menu {

	
	private String desing;
	private MenuDesing menuDesing;
	
	public Menu(String desing, MenuInfo menuInfo, MenuOpcions menuOpcions,AppInfo appInfo) {
		super();
		this.desing = desing;
	
		this.menuDesing = new MenuDesing(menuInfo.getDescripcion1(), menuInfo.getDescripcion2(), menuOpcions.getOption1()
				, menuOpcions.getOption2(), menuOpcions.getOption3(), menuOpcions.getOption4()
				, menuOpcions.getOption5(), appInfo.getAppVersion(), appInfo.getAppAuthor());
	}
	
	public void show() {
		System.out.printf(desing,menuDesing.getFinalString1(),menuDesing.getFinalString2(),menuDesing.getFinalString3()
				,menuDesing.getFinalString4(),menuDesing.getFinalString5(),menuDesing.getFinalString6(),menuDesing.getFinalString7()
				,menuDesing.getFinalString8(),menuDesing.getFinalString9());
	}
}
