package view;

public class Exit {

	private String desing;
	private AppInfo appInfo;
	private String description;
	private ExitDesing exitDesing;
	
	public Exit(String desing,AppInfo appInfo, String description) {
		super();
		this.desing = desing;
		this.appInfo = appInfo;
		this.description = description;
		this.exitDesing = new ExitDesing(Constants.EXIT_ARROW,appInfo.getAppAuthor());
		
	}
	
	public void showExit() {
		System.out.printf(desing,description,appInfo.getAppNameFirstPart(),appInfo.getAppNameSecondPart(),appInfo.getAppVersion(),exitDesing.getFinalString1(),exitDesing.getFinalString2());
	}
}
