package view;

public class ResultContent {

	private String description;
	private String areaString;
	private double areaValue;
	private String sideAString;
	private double sideAValue;
	private String sideBString;
	private double sideBValue;
	private String sideCString;
	private double sideCValue;
	private String pressEnter;
	public ResultContent(String description, String areaString, double areaValue, String sideAString, double sideAValue,
			String sideBString, double sideBValue, String sideCString, double sideCValue, String pressEnter) {
		super();
		this.description = description;
		this.areaString = areaString;
		this.areaValue = areaValue;
		this.sideAString = sideAString;
		this.sideAValue = sideAValue;
		this.sideBString = sideBString;
		this.sideBValue = sideBValue;
		this.sideCString = sideCString;
		this.sideCValue = sideCValue;
		this.pressEnter = pressEnter;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAreaString() {
		return areaString;
	}
	public void setAreaString(String areaString) {
		this.areaString = areaString;
	}
	public double getAreaValue() {
		return areaValue;
	}
	public void setAreaValue(double areaValue) {
		this.areaValue = areaValue;
	}
	public String getSideAString() {
		return sideAString;
	}
	public void setSideAString(String sideAString) {
		this.sideAString = sideAString;
	}
	public double getSideAValue() {
		return sideAValue;
	}
	public void setSideAValue(double sideAValue) {
		this.sideAValue = sideAValue;
	}
	public String getSideBString() {
		return sideBString;
	}
	public void setSideBString(String sideBString) {
		this.sideBString = sideBString;
	}
	public double getSideBValue() {
		return sideBValue;
	}
	public void setSideBValue(double sideBValue) {
		this.sideBValue = sideBValue;
	}
	public String getSideCString() {
		return sideCString;
	}
	public void setSideCString(String sideCString) {
		this.sideCString = sideCString;
	}
	public double getSideCValue() {
		return sideCValue;
	}
	public void setSideCValue(double sideCValue) {
		this.sideCValue = sideCValue;
	}
	public String getPressEnter() {
		return pressEnter;
	}
	public void setPressEnter(String pressEnter) {
		this.pressEnter = pressEnter;
	}
	
	
}

