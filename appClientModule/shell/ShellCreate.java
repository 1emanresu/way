package shell;

import java.io.IOException;
import java.util.Map;

import file.FileCreate;
import file.FileWrite;

public class ShellCreate {
	public String fileName;
	protected ShellCreate(String name) throws IOException{
		fileName=new FileCreate().create(name);
		new FileWrite().write(fileName, "#!/bin/bash");
	}
	public boolean create(Map map) throws IOException {
		return true;
	}
}