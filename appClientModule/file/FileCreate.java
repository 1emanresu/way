package file;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class FileCreate {
	public String create(String name) throws IOException {
		String addr=System.getProperty("user.dir") + "/shell/" ;
		new File(addr).mkdirs();
		File file = new File(addr+name);
		while(!file.createNewFile()) {
			file.delete();
		}
		return addr+name;
	}
}