package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.ReguScheBookBusModel;
import SQLConnection.ConnectSQLServer;

public class ReguScheBookBusAO {
	public ArrayList<ReguScheBookBusModel> getAllReguScheBookBus(){
		ArrayList<ReguScheBookBusModel> reguList = new ArrayList<ReguScheBookBusModel>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			String sql = "SELECT * FROM dbo.Regularly_Scheduled_Bus_Booking_Status;";
			conn = new ConnectSQLServer().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()){
				int i = 1;
				ReguScheBookBusModel one = new ReguScheBookBusModel(
						rs.getString(i++),
						rs.getString(i++),
						rs.getString(i++),
						rs.getInt(i++),
						rs.getInt(i++),
						rs.getString(i++),
						rs.getDate(i++),
						rs.getTime(i++),
						rs.getInt(i++),
						rs.getInt(i++));
				reguList.add(one);
			}
		} catch (Exception e){
			
		} finally {
			try{
				if (rs != null){ rs.close();}
				if (stmt != null){ stmt.close();}
				if (conn != null){ conn.close();}
			} catch(Exception e){
				e.printStackTrace();
			}
		}
		return reguList;
	}
}
