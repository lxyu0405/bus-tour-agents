package DAO;

import java.sql.Connection;
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
}
