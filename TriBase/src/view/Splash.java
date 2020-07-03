package view;

public class Splash  {

	
	private SplashDesing format;
	private String desing;
	
	/**
	 * 
	 * @param info
	 */
	public Splash(AppInfo info, String desing) {
		super();
		this.desing = desing;
		this.format = new SplashDesing(desing,info.getAppNameFirstPart() , info.getAppNameSecondPart(),
				info.getAppVersion(), info.getAppDescription(), info.getAppAuthor(), info.getAppYear());
	}
	public void show() {
		System.out.printf(desing,format.getFinalString1(),format.getFinalString2()
				,format.getFinalString3(),format.getFinalString4(),format.getFinalString5(),format.getFinalString6());
	}
	
	
	
	
}
