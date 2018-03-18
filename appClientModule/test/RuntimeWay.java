package test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.URL;
import java.util.*;

import bean.*;
import file.FileCreate;
import file.FileWrite;
import mysql.DatabaseCreate;
import mysql.TableCreate;
import shell.Chmod;
import shell.mysql.MysqlShellCreate;

public class RuntimeWay {

	public static void main(String[] args) throws IOException {
		try {
			TableCreate databaseCreate = new TableCreate();
			boolean bool = databaseCreate.createDatabase(databaseCreate.getMysqlShell("his4"));
			System.out.println(bool);
			Runtime.getRuntime().exit(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
