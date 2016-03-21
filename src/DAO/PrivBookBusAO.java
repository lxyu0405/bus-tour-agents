package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.PrivBookBusModel;
import SQLConnection.ConnectSQLServer;

/*
 * CREATE TABLE [dbo].[Private_Booking_Bus]
(
  [BUS_NO] [char](10)  NOT NULL,
  [SEAT_CAPACITY] [int]  NULL,
  [DRIVER_NO] [int]  NULL,
  [DEPART_DATE] [date]  NOT NULL,
  [DEPART_TIME] [time]  NOT NULL,
  [DEPART_LOCATION] [varchar](50)  NULL,
  [RETURN_DATE] [date]  NULL,
  [RETURN_TIME] [time]  NULL,
  [RETURN_LOCATION] [varchar](50)  NULL,
  [CONTACT_PERSON] [varchar](50)  NULL,
  [CONTACT_TEL] [int]  NULL
)
 *
 */

public class PrivBookBusAO {
	
	public ArrayList<PrivBookBusModel> getAllPrivBookBus(){
		ArrayList<PrivBookBusModel> privList = new ArrayList<PrivBookBusModel>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			String sql = "SELECT * FROM dbo.Private_Booking_Bus;";
			conn = new ConnectSQLServer().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()){
				int i = 1;
				PrivBookBusModel one = new PrivBookBusModel(
						rs.getString(i++),
						rs.getInt(i++),
						rs.getInt(i++),
						rs.getDate(i++),
						rs.getTime(i++),
						rs.getString(i++),
						rs.getDate(i++),
						rs.getTime(i++),
						rs.getString(i++),
						rs.getString(i++),
						rs.getInt(i++));
				privList.add(one);
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
		return privList;
	}
	
}
