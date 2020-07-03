package view;

public class Result {

	private String desing;
	private ResultContent resultContent;
	private ResultDesing resultDesing;
	
	public Result(String desing, AppInfo appInfo, ResultContent resultContent) {
		super();
		this.desing = desing;
		this.resultContent = resultContent;
		this.resultDesing = new ResultDesing(appInfo.getAppVersion(), resultContent.getDescription(), resultContent.getAreaString(),
				resultContent.getSideAString(),resultContent.getSideBString(), resultContent.getSideCString(), 
				resultContent.getPressEnter() ,appInfo.getAppAuthor());
	}
	
	public void show() {
		System.out.printf(desing,resultDesing.getFinalString1(),resultDesing.getFinalString2(),resultDesing.getFinalString3(),
				resultContent.getAreaValue(),resultDesing.getFinalString5(),resultContent.getSideAValue(),resultDesing.getFinalString7(),
				resultContent.getSideBValue(),resultDesing.getFinalString9(),resultContent.getSideCValue(),resultContent.getSideCValue(),
				resultContent.getSideBValue(),resultContent.getAreaValue(),resultContent.getSideAValue(),resultDesing.getFinalString16(),
				resultDesing.getFinalString17());
	}
	
	
}
