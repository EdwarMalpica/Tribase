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
			this.load(new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-2020\\TriBase\\src\\properties\\userSettings.properties"));
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
			defaultLanguage.load(new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-2020\\TriBase\\src\\properties\\in.properties"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			language = new Properties();
			language.load(new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-2020\\TriBase\\src\\properties\\"+this.getProperty("language")+".properties"));
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
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
			this.store(new FileOutputStream("C:\\Users\\USUARIO\\eclipse-workspace-2020\\TriBase\\src\\properties\\userSettings.properties"), "UserProperties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		MyProperties pro = new MyProperties();
//		System.out.println(pro.getKeyLanguage("nombre"));
//	}
	
}
