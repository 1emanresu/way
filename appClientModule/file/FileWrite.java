package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileWrite {
	public boolean write(String fileLoc, String newstr) throws IOException {
		String temp;
		File file = new File(fileLoc);
		InputStream input = new FileInputStream(file);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; (temp = bufferedReader.readLine()) != null; i++) {
			stringBuffer.append(temp);
			stringBuffer = stringBuffer.append(System.getProperty("line.separator"));
		}
		stringBuffer.append(newstr);
		OutputStream outputStream = new FileOutputStream(file);
		outputStream.write(stringBuffer.toString().getBytes());
		outputStream.flush();
		outputStream.close();
		return true;
	}
}
