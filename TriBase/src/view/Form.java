package view;

public class Form {

	
	private String desing;
	private FormDesing formDesing;
	
	
	public Form(AppInfo appInfo, FormContent formContent, String desing) {
		super();
		this.desing = desing;
		formDesing = new FormDesing(appInfo.getAppVersion(), formContent.getRequesBaseData(), formContent.getRequesHeightData(),
				formContent.getRequesSideAData(), formContent.getRequesSideBData(), formContent.getRequesSideCData(), 
				formContent.getRequesAngleBData(), formContent.getRequesAngleCData(), appInfo.getAppAuthor());
	}
	
	
	public void FormRequesBaseData() {
		System.out.printf(desing,formDesing.getFinalString1(),formDesing.getFinalString2(),formDesing.getFinalString9());
	}
	public void FormRequesHeightData() {
		System.out.printf(desing,formDesing.getFinalString1(),formDesing.getFinalString3(),formDesing.getFinalString9());
	}
	public void FormRequesSideAData() {
		System.out.printf(desing,formDesing.getFinalString1(),formDesing.getFinalString4(),formDesing.getFinalString9());
	}
	public void FormRequesSideBData() {
		System.out.printf(desing,formDesing.getFinalString1(),formDesing.getFinalString5(),formDesing.getFinalString9());
	}
	public void FormRequesSideCData() {
		System.out.printf(desing,formDesing.getFinalString1(),formDesing.getFinalString6(),formDesing.getFinalString9());
	}
	public void FormRequesAngleBData() {
		System.out.printf(desing,formDesing.getFinalString1(),formDesing.getFinalString7(),formDesing.getFinalString9());
	}
	public void FormRequesAngleCData() {
		System.out.printf(desing,formDesing.getFinalString1(),formDesing.getFinalString8(),formDesing.getFinalString9());
	}
}
