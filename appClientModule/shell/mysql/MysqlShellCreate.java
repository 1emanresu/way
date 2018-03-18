package shell.mysql;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import bean.mysqlDatabase;
import bean.mysqlLogin;
import bean.mysqlTable;
import file.FileCreate;
import file.FileWrite;
import shell.ShellCreate;

public class MysqlShellCreate extends ShellCreate {
	public MysqlShellCreate(String name) throws IOException {
		super(name);
	}

	public boolean create(Map map) throws IOException {
		StringBuffer sb = new StringBuffer();
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Object obj = map.get(iterator.next());
			Field[] fields = obj.getClass().getFields();
			for (int i = 0; i < fields.length; i++) {
				try {
					sb.append(fields[i].getName() + "="+"\"" + fields[i].get(obj)+"\"" + "\n");
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		String newstr = sb.toString();
		FileWrite fw = new FileWrite();
		return fw.write(fileName, newstr);
	}
	public boolean create(String str) throws IOException {
		FileWrite fw = new FileWrite();
		return fw.write(fileName, str);
	}
}