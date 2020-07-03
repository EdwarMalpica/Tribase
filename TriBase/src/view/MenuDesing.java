package view;

public class MenuDesing {
	
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	private String string6;
	private String string7;
	private String string8;
	private String string9;
	private String finalString1;
	private String finalString2;
	private String finalString3;
	private String finalString4;
	private String finalString5;
	private String finalString6;
	private String finalString7;
	private String finalString8;
	private String finalString9;
	
	public MenuDesing(String string1, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9) {
		super();
		
		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;
		this.string4 = string4;
		this.string5 = string5;
		this.string6 = string6;
		this.string7 = string7;
		this.string8 = string8;
		this.string9 = string9;
		buildDesing();
	}
	
	public void buildDesing() {
		finalString1 = addSpace(string1, ConstantsSpaceString.MENU_String_1);
		finalString2 = addSpace(string2, ConstantsSpaceString.MENU_String_2);
		finalString3 = addSpace(string3, ConstantsSpaceString.MENU_String_3);
		finalString4 = addSpace(string4, ConstantsSpaceString.MENU_String_4);
		finalString5 = addSpace(string5, ConstantsSpaceString.MENU_String_5);
		finalString6 = addSpace(string6, ConstantsSpaceString.MENU_String_6);
		finalString7 = addSpace(string7, ConstantsSpaceString.MENU_String_7);
		finalString8 = addSpace(string8, ConstantsSpaceString.MENU_String_8);
		finalString9 = addSpace(string9, ConstantsSpaceString.MENU_String_9);
		
	}
	
	
	public String addSpace(String text,int length) {
		String newText = "";
		newText += text;
		for(int space = (length-text.length());space>0;space--) {
			newText += " ";
		}
		return newText;
		
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

	public String getFinalString7() {
		return finalString7;
	}

	public void setFinalString7(String finalString7) {
		this.finalString7 = finalString7;
	}

	public String getFinalString8() {
		return finalString8;
	}

	public void setFinalString8(String finalString8) {
		this.finalString8 = finalString8;
	}

	public String getFinalString9() {
		return finalString9;
	}

	public void setFinalString9(String finalString9) {
		this.finalString9 = finalString9;
	}
	
	
	
	
	
}
