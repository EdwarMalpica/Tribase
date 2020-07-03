package view;

public class ExitDesing {
 

	private String string1;
	private String string2;
	private String finalString1;
	private String finalString2;
	
	public ExitDesing(String string1, String string2) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		buildDesing();
	}
	
	public void buildDesing() {
		finalString1 = addSpace(string1, ConstantsSpaceString.EXIT_String_1);
		finalString2 = addSpace(string2, ConstantsSpaceString.EXIT_String_2);
		
		
		
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
	
	
	
}
