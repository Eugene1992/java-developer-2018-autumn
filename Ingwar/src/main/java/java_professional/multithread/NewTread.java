package java_professional.multithread;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class NewTread extends Thread {
	private final String FILE_URL;
	private final String FILE_TARGET;

	public NewTread(String fILE_URL, String fILE_TARGET) {
		FILE_URL = fILE_URL;
		FILE_TARGET = fILE_TARGET;
	}
	
	public void run() {
		try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
			FileOutputStream fileOutputStream =  new FileOutputStream(FILE_TARGET)) {
			byte dataBuffer[] = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				fileOutputStream.write(dataBuffer, 0, bytesRead);
			}
			System.out.println("Download comleted!");
		} catch (IOException e) {
				    // handle exception
		}
	}

}
