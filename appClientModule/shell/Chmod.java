package shell;

import java.io.IOException;

public class Chmod {
	public void exec(String file) throws IOException{
		String str="chmod +x "+file;
		Runtime.getRuntime().exec(str);
	}
	public void unExec(String file) throws IOException{
		String str="chmod -x "+file;
		Runtime.getRuntime().exec(str);
	}
}
