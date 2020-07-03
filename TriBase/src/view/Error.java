package view;

public class Error {

	private String desing1;
	private String desing2;
	private ErrorDesing errorDesing;
	
	public Error(String desing1, String desing2, ErrorContent errorContent, AppInfo appInfo) {
		super();
		this.desing1 = desing1;
		this.desing2 = desing2;
		this.errorDesing = new ErrorDesing(errorContent.getPressEnter(), errorContent.getErrorInvalidOption(), errorContent.getErrorNotOption(), 
				errorContent.getErrorNotNumber(), errorContent.getErrorNotTriangle1(), errorContent.getErrorNotTriangle2(),
				errorContent.getErrorNotAngle1(), errorContent.getErrorNotTriangle2(),appInfo.getAppVersion(),appInfo.getAppAuthor());
	}
	
	public void showErrorInvalidOption() {
		System.out.printf(desing1,errorDesing.getFinalString9(),errorDesing.getFinalString2(),
				errorDesing.getFinalString1(),errorDesing.getFinalString10());
	}
	public void showErrorNotOption() {
		System.out.printf(desing1,errorDesing.getFinalString9(),errorDesing.getFinalString3(),
				errorDesing.getFinalString1(),errorDesing.getFinalString10());
	}
	public void showErrorNotNumber() {
		System.out.printf(desing1,errorDesing.getFinalString9(),errorDesing.getFinalString4(),
				errorDesing.getFinalString1(),errorDesing.getFinalString10());
	}
	public void showErrorNotTriangle() {
		System.out.printf(desing2,errorDesing.getFinalString9(),errorDesing.getFinalString5(),errorDesing.getFinalString6(),
				errorDesing.getFinalString1(),errorDesing.getFinalString10());
	}
	public void showErrorNotAngle() {
		System.out.printf(desing2,errorDesing.getFinalString9(),errorDesing.getFinalString7(),errorDesing.getFinalString8(),
				errorDesing.getFinalString1(),errorDesing.getFinalString10());
	}
	
}
