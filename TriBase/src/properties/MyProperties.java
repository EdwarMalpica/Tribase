package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

/**
 * Clase la cual carga las configuraciones de la app
 * @author USUARIO
 *
 */
public class MyProperties extends Properties {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4011509660599456565L;
	
	private Properties defaultLanguage;
	private Properties language;
	 /**
	  * Constructor el cual carga la configuracion del usuario, si esta no existe
	  * crea una por defecto
	  */
	
	public MyProperties() {
		
		 try {
			 String path = MyProperties.class.getResource("userSettings.properties").getPath();
			 this.load(new FileInputStream(path));
		} catch (IOException e) {
			 initDefaultProperties();	
			 saveConfiguration();
		}
		
		 loadLanguage();
	}
	
	
	/**
	 * Carga el lenguaje escogido por el usuario, y el lenguaje por defecto en caso de
	 * que se requiera
	 */
	private void loadLanguage() {
		defaultLanguage = new Properties();
		try {
			 String path = MyProperties.class.getResource("in.properties").getPath();
			defaultLanguage.load(new FileInputStream(path));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			language = new Properties();
			language.load(new FileInputStream(MyProperties.class.getResource(this.getProperty("language")+".properties").getPath()));
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
	}
	
	public String getKeyLanguage(String key) {
		String result = "";
		if( language.getProperty(key)!=null) {
			result =  language.getProperty(key);
		}else {
			result = defaultLanguage.getProperty(key);
		}
		return result;
	}
	/**
	 * carga una configuracion por defecto el cual se almacena en la ram
	 */
	public void initDefaultProperties() {
		this.put("language", Locale.getDefault().getLanguage());
	
	}
	/**
	 * guarda la configuracion que se este trabajando
	 */
	public void saveConfiguration() {
		try {
			System.out.println("entre perro");
			this.store(new FileOutputStream(MyProperties.class.getResource("").getPath()+"userSettings.properties"),"UserProperties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		MyProperties pro = new MyProperties();
//		System.out.println(pro.getKeyLanguage("appInfo"));
//	}
	
}
