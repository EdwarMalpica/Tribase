package view;

public class ResultDesing {

	private String string1;
	private String string2;
	private String string3;
	private String string5;
	private String string7;
	private String string9;
	private String string16;
	private String string17;
	private String finalString1;
	private String finalString2;
	private String finalString3;
	private String finalString5;
	private String finalString7;
	private String finalString9;
	private String finalString16;
	private String finalString17;
	
	
	
	public ResultDesing(String string1, String string2, String string3, String string5, String string7, String string9,
			 String string16, String string17) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;
		this.string5 = string5;
		this.string7 = string7;
		this.string9 = string9;
		this.string16 = string16;
		this.string17 = string17;
		buildDesing();
	}


	public void buildDesing() {
		finalString1 = addSpace(string1, ConstantsSpaceString.RESULT_String_1);
		finalString2 = addSpace(string2, ConstantsSpaceString.RESULT_String_2);
		finalString3 = addSpace(string3, ConstantsSpaceString.RESULT_String_3);
		finalString5 = addSpace(string5, ConstantsSpaceString.RESULT_String_5);
		finalString7 = addSpace(string7, ConstantsSpaceString.RESULT_String_7);
		finalString9 = addSpace(string9, ConstantsSpaceString.RESULT_String_9);
		finalString16 = addSpace(string16, ConstantsSpaceString.RESULT_String_16);
		finalString17 = addSpace(string17, ConstantsSpaceString.RESULT_String_17);
		
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

	public String getFinalString5() {
		return finalString5;
	}

	public void setFinalString5(String finalString5) {
		this.finalString5 = finalString5;
	}

	public String getFinalString7() {
		return finalString7;
	}

	public void setFinalString7(String finalString7) {
		this.finalString7 = finalString7;
	}

	public String getFinalString9() {
		return finalString9;
	}

	public void setFinalString9(String finalString9) {
		this.finalString9 = finalString9;
	}

	public String getFinalString16() {
		return finalString16;
	}

	public void setFinalString16(String finalString16) {
		this.finalString16 = finalString16;
	}

	public String getFinalString17() {
		return finalString17;
	}

	public void setFinalString17(String finalString17) {
		this.finalString17 = finalString17;
	}

	
	
	
	
}



