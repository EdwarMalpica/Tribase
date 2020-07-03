package view;

public class AppInfo {

	private String appNameFirstPart;
	private String appNameSecondPart;
	private String appVersion;
	private String appAuthor;
	private String appDescription;
	private String appYear;
	
	
	/**
	 * 
	 * @param appName
	 * @param appVersion
	 * @param appAuthor
	 * @param appDescription
	 * @param appYear
	 */
	public AppInfo(String appNameFirstPart,String appNameSecondPart, String appVersion, String appAuthor, String appDescription, String appYear) {
		super();
		this.appNameFirstPart = appNameFirstPart;
		this.appNameSecondPart = appNameSecondPart;
		this.appVersion = appVersion;
		this.appAuthor = appAuthor;
		this.appDescription = appDescription;
		this.appYear = appYear;
	}

	public String getAppNameFirstPart() {
		return appNameFirstPart;
	}

	public void setAppNameFirstPart(String appNameFirstPart) {
		this.appNameFirstPart = appNameFirstPart;
	}
	public String getAppNameSecondPart() {
		return appNameSecondPart;
	}

	public void appNameSecondPart(String appNameSecondPart) {
		this.appNameSecondPart = appNameSecondPart;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppAuthor() {
		return appAuthor;
	}

	public void setAppAuthor(String appAuthor) {
		this.appAuthor = appAuthor;
	}

	public String getAppDescription() {
		return appDescription;
	}

	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}

	public String getAppYear() {
		return appYear;
	}

	public void setAppYear(String appYear) {
		this.appYear = appYear;
	}
	 
}
