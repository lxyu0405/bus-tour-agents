package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	public boolean insertReguScheBookBus(ReguScheBookBusModel newRegu){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "INSERT INTO dbo.Regularly_Scheduled_Bus_Booking_Status VALUES (?,?,?,?,?,?,?,?,?,?);";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			pstmt.setString(i++, newRegu.getTour_code());
			pstmt.setString(i++, newRegu.getDestination());
			pstmt.setString(i++, newRegu.getDescription());		
			pstmt.setInt(i++, newRegu.getBus_no());			
			pstmt.setInt(i++, newRegu.getDriver_no());
			pstmt.setString(i++, newRegu.getDepart_location());
			pstmt.setDate(i++, newRegu.getDepart_date());
			pstmt.setTime(i++, newRegu.getDepart_time());
			pstmt.setInt(i++, newRegu.getMax_participants());
			pstmt.setInt(i++, newRegu.getNo_of_participants());
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
	
	
	
	public boolean updateReguScheBookBus(ReguScheBookBusModel updateRegu){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "UPDATE dbo.Regularly_Scheduled_Bus_Booking_Status "
					+ "SET DESTINATION=?, DESCRIPTION=?, BUS_NO=?, "
					+ "DRIVER_NO=?, DEPART_LOCATION=?, DEPART_DATE=?, "
					+ "DEPART_TIME=?, MAX_PARTICIPANTS=?, NO_OF_PARTICIPANTS=? "
					+ "WHERE TOUR_CODE=?;";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			pstmt.setString(i++, updateRegu.getDestination());
			pstmt.setString(i++, updateRegu.getDescription());		
			pstmt.setInt(i++, updateRegu.getBus_no());			
			pstmt.setInt(i++, updateRegu.getDriver_no());
			pstmt.setString(i++, updateRegu.getDepart_location());
			pstmt.setDate(i++, updateRegu.getDepart_date());
			pstmt.setTime(i++, updateRegu.getDepart_time());
			pstmt.setInt(i++, updateRegu.getMax_participants());
			pstmt.setInt(i++, updateRegu.getNo_of_participants());
			pstmt.setString(i++, updateRegu.getTour_code());
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
	
	public boolean deleteReguScheBookBus(ReguScheBookBusModel deleteRegu){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "DELETE FROM dbo.Regularly_Scheduled_Bus_Booking_Status WHERE TOUR_CODE=?;";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deleteRegu.getTour_code());
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
