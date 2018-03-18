package bean;

public class mysqlDatabase {

	public String DBNAME;
	public String createDbSql;

	public String getCreateDbSql() {
		return createDbSql;
	}

	public String getDBNAME() {
		return DBNAME;
	}

	public void setDBNAME(String dBNAME) {
		DBNAME = dBNAME;
		this.createDbSql = "create database IF NOT EXISTS ${DBNAME}" ;
	}
}
