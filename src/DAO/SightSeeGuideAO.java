package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.SightSeeGuideModel;
import SQLConnection.ConnectSQLServer;

public class SightSeeGuideAO {
	public ArrayList<SightSeeGuideModel> getAllSightSeeGuide(){
		ArrayList<SightSeeGuideModel> sightList = new ArrayList<SightSeeGuideModel>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			String sql = "SELECT * FROM dbo.Sight_Seeing_Guide;";
			conn = new ConnectSQLServer().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()){
				int i = 1;
				SightSeeGuideModel one = new SightSeeGuideModel(
						rs.getString(i++),
						rs.getString(i++),
						rs.getString(i++));
				sightList.add(one);
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
		return sightList;
	}
	
	
	
	public boolean insertSightSeeGuide(SightSeeGuideModel newSight){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "INSERT INTO dbo.Sight_Seeing_Guide VALUES (?,?,?);";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newSight.getTour_code());
			pstmt.setString(2, newSight.getGuide_no());
			pstmt.setString(3, newSight.getGuide_name());
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
	
	
	
	public boolean updateSightSeeGuide(SightSeeGuideModel updateSight){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "UPDATE dbo.Sight_Seeing_Guide SET GUIDE_NAME=? WHERE TOUR_CODE=?;";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updateSight.getGuide_name());
			pstmt.setString(2, updateSight.getTour_code());
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
	
	public boolean deleteSightSeeGuide(SightSeeGuideModel deleteSight){
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "DELETE FROM dbo.Sight_Seeing_Guide WHERE TOUR_CODE=?;";
			conn = new ConnectSQLServer().getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deleteSight.getTour_code());
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
