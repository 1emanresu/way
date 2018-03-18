package bean;

public class mysqlTable {
	public String TABLENAME;
	public String createTableSql;

	public String getCreateTableSql() {
		return createTableSql;
	}

	public String getTABLENAME() {
		return TABLENAME;
	}

	public void setTABLENAME(String tABLENAME) {
		TABLENAME = tABLENAME;
		this.createTableSql = "create table IF NOT EXISTS ${TABLENAME} (  name varchar(20), id int(11) default 0 )";
	}
}
