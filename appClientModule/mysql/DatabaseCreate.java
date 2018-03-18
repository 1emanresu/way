package mysql;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import bean.mysqlDatabase;
import bean.mysqlLogin;
import bean.mysqlTable;
import shell.Chmod;
import shell.mysql.MysqlShellCreate;

public class DatabaseCreate {

	public boolean createDatabase(String... strings) throws IOException {
		new Chmod().exec(strings[0]);
		/*String[] cmd = strings;*/
		Process proc;
		proc = Runtime.getRuntime().exec(strings);
/*		while ((proc.isAlive())) {
		}
*/		System.out.println(proc.isAlive());
		return proc.isAlive();
	
	}

	public String getMysqlShell(String name) throws IOException {
		mysqlDatabase db = new mysqlDatabase();
		mysqlTable table = new mysqlTable();
		mysqlLogin login = new mysqlLogin();
		login.setHOSTNAME("localhost");
		login.setPASSWORD("root");
		login.setPORT("3306");
		login.setUSERNAME("root");
		db.setDBNAME("data_way");
		table.setTABLENAME("data_table_way");
		Map map = new HashMap();
		map.put("loginInfo", login);
		map.put("dbInfo", db);
		map.put("tableInfo", table);
		login.setHOSTNAME("localhost");
		login.setPASSWORD("root");
		login.setPORT("3306");
		login.setUSERNAME("root");
		db.setDBNAME("data_way");
		table.setTABLENAME("data_table_way");
		map.put("loginInfo", login);
		map.put("dbInfo", db);
		map.put("tableInfo", table);
		MysqlShellCreate mshell = new MysqlShellCreate(name);
		mshell.create(map);
		mshell.create(
				"mysql -h${HOSTNAME}  -P${PORT}  -u${USERNAME} -p${PASSWORD}   -e \"${createDbSql}\"");
		System.out.println(mshell.fileName);
		return mshell.fileName;
	}
}
