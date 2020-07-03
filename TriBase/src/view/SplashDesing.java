package view;



public class SplashDesing {

	private String desing;
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	private String string6;
	private String finalString1;
	private String finalString2;
	private String finalString3;
	private String finalString4;
	private String finalString5;
	private String finalString6;
	
	

	public SplashDesing(String desing, String string1, String string2, String string3, String string4, String string5,
			String string6) {
		super();
		this.desing = desing;
		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;
		this.string4 = string4;
		this.string5 = string5;
		this.string6 = string6;
		buildDesing();
	}
	
	

	public void buildDesing() {
		finalString1 = addSpace(string1, ConstantsSpaceString.SPLASH_STRING_1);
		finalString2 = addSpace(string2, ConstantsSpaceString.SPLASH_STRING_2);
		finalString3 = addSpace(string3, ConstantsSpaceString.SPLASH_STRING_3);
		finalString4 = addSpace(string4, ConstantsSpaceString.SPLASH_STRING_4);
		finalString5 = addSpace(string5, ConstantsSpaceString.SPLASH_STRING_5);
		finalString6 = addSpace(string6, ConstantsSpaceString.SPLASH_STRING_6);
		
	}
	
	public String addSpace(String text,int length) {
		String newText = "";
		newText += text;
		for(int space = (length-text.length());space>0;space--) {
			newText += " ";
		}
		return newText;
		
	}



	public String getDesing() {
		return desing;
	}



	public void setDesing(String desing) {
		this.desing = desing;
	}



	public String getString1() {
		return string1;
	}



	public void setString1(String string1) {
		this.string1 = string1;
	}



	public String getString2() {
		return string2;
	}



	public void setString2(String string2) {
		this.string2 = string2;
	}



	public String getString3() {
		return string3;
	}



	public void setString3(String string3) {
		this.string3 = string3;
	}



	public String getString4() {
		return string4;
	}



	public void setString4(String string4) {
		this.string4 = string4;
	}



	public String getString5() {
		return string5;
	}



	public void setString5(String string5) {
		this.string5 = string5;
	}



	public String getString6() {
		return string6;
	}



	public void setString6(String string6) {
		this.string6 = string6;
	}



	public String getFinalString1() {
		return finalString1;
	}



	public void setFinalString1(String finalString1) {
		this.finalString1 = finalString1;
	}



	public String getFinalString2() {
		return finalString2;
	}



	public void setFinalString2(String finalString2) {
		this.finalString2 = finalString2;
	}



	public String getFinalString3() {
		return finalString3;
	}



	public void setFinalString3(String finalString3) {
		this.finalString3 = finalString3;
	}



	public String getFinalString4() {
		return finalString4;
	}



	public void setFinalString4(String finalString4) {
		this.finalString4 = finalString4;
	}



	public String getFinalString5() {
		return finalString5;
	}



	public void setFinalString5(String finalString5) {
		this.finalString5 = finalString5;
	}



	public String getFinalString6() {
		return finalString6;
	}



	public void setFinalString6(String finalString6) {
		this.finalString6 = finalString6;
	}
	
	
	
	
}
