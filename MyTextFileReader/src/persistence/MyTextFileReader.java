package persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyTextFileReader {
	
	private File file;
	private FileReader fileReader;

	public MyTextFileReader(String FileName) {
		this.file = new File(FileName);
		try {
			this.fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
	public void read() throws IOException {
		int c = 0;
		while(c != -1) {
			c = fileReader.read();
			System.out.println(" " + c);
		}
	}
	public void close() throws IOException {
		this.fileReader.close();
	}

}
