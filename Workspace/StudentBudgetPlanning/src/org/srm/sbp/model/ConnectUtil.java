package org.srm.sbp.model;

import java.sql.*;

public class ConnectUtil 
{
	public static Connection getMyConnection()  throws SQLException,
    ClassNotFoundException
	{
		String hostName="localhost";
		String dbName="questionnaire";
		String userName="root";
		String pass="admin";
		return getMyConnection(hostName,dbName,userName,pass);
	}
	public static  Connection getMyConnection(String hostName,String dbName,String userName,String pass) throws SQLException,
    ClassNotFoundException
	{
		 Class.forName("com.mysql.jdbc.Driver");
		 String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		 Connection conn = DriverManager.getConnection(connectionURL, userName,pass);
		 return conn;
	}
}
