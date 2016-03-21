package SQLConnection;


import java.sql.*;

public class ConnectSQLServer {
	private Connection conn = null;
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String username = "team10";
	private String passward = "crl1fle4";
	private String url = "jdbc:sqlserver://137.189.76.26;DatabaseName=Team10";
	public Connection getConnection(){
		try {
			Class.forName(driver);
			if (conn == null || conn.isClosed()){
				conn = DriverManager.getConnection(url, username, passward);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public void closeConnection(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
