package file;

import java.io.IOException;

public class ShellExec {
/**
 * 
 * @param strings
 * @throws IOException 
 * @author root
 * @return boolean
 */
	public boolean exec(String...strings) throws IOException {
		String[] cmd = strings;
		Process proc;
			proc = Runtime.getRuntime().exec(cmd[0]);
			while((proc.isAlive())) {
				System.out.println(proc.isAlive());
			}
			System.out.println(proc.isAlive());
			return proc.isAlive();
	}
}
