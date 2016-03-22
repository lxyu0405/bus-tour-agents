package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	
	public boolean insertPrivBookBus(PrivBookBusModel newPriv){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "INSERT INTO dbo.Private_Booking_Bus VALUES (?,?,?,?,?,?,?,?,?,?,?);";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			pstmt.setString(i++, newPriv.getBus_no());
			pstmt.setInt(i++, newPriv.getSeat_capacity());
			pstmt.setInt(i++, newPriv.getDriver_no());
			pstmt.setDate(i++, newPriv.getDepart_date());
			pstmt.setTime(i++, newPriv.getDepart_time());
			pstmt.setString(i++, newPriv.getDepart_location());
			pstmt.setDate(i++, newPriv.getReturn_date());
			pstmt.setTime(i++, newPriv.getReturn_time());
			pstmt.setString(i++, newPriv.getReturn_location());
			pstmt.setString(i++, newPriv.getContact_person());
			pstmt.setInt(i++, newPriv.getContact_tel());
			if(pstmt.executeUpdate() > 0 ){
				flag = true;
			}
		} catch (Exception e){
			
		} finally {
			try{
				if (pstmt != null){ pstmt.close();}
				if (conn != null){ conn.close();}
			} catch(Exception e){
				e.printStackTrace();
			}
		}	
		return flag;
	}
	
	
	
	public boolean updatePrivBookBus(PrivBookBusModel updatePriv){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "UPDATE dbo.Private_Booking_Bus "
					+ "SET SEAT_CAPACITY=?, DRIVER_NO=?, DEPART_DATE=?,"
					+ " DEPART_TIME=?, DEPART_LOCATION=?, RETURN_DATE=?, "
					+ "RETURN_TIME=?, RETURN_LOCATION=?, CONTACT_PERSON=?,"
					+ " CONTACT_TEL=? "
					+ "WHERE BUS_NO=?;";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			pstmt.setInt(i++, updatePriv.getSeat_capacity());
			pstmt.setInt(i++, updatePriv.getDriver_no());
			pstmt.setDate(i++, updatePriv.getDepart_date());
			pstmt.setTime(i++, updatePriv.getDepart_time());
			pstmt.setString(i++, updatePriv.getDepart_location());
			pstmt.setDate(i++, updatePriv.getReturn_date());
			pstmt.setTime(i++, updatePriv.getReturn_time());
			pstmt.setString(i++, updatePriv.getReturn_location());
			pstmt.setString(i++, updatePriv.getContact_person());
			pstmt.setInt(i++, updatePriv.getContact_tel());
			pstmt.setString(i++, updatePriv.getBus_no());
			if(pstmt.executeUpdate() > 0 ){
				flag = true;
			}
		} catch (Exception e){
			
		} finally {
			try{
				if (pstmt != null){ pstmt.close();}
				if (conn != null){ conn.close();}
			} catch(Exception e){
				e.printStackTrace();
			}
		}	
		return flag;
	}
	
	public boolean deletePrivBookBus(PrivBookBusModel deletePriv){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "DELETE FROM dbo.Private_Booking_Bus WHERE BUS_NO=?;;";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deletePriv.getBus_no());
			if(pstmt.executeUpdate() > 0 ){
				flag = true;
			}
		} catch (Exception e){
			
		} finally {
			try{
				if (pstmt != null){ pstmt.close();}
				if (conn != null){ conn.close();}
			} catch(Exception e){
				e.printStackTrace();
			}
		}	
		return flag;
	}
	
}
