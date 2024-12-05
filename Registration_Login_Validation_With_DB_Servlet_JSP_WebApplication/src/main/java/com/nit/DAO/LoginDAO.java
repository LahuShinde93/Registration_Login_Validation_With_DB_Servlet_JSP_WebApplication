package com.nit.DAO;

import java.sql.*;

public class LoginDAO {

	boolean b = false;
	public boolean login(String uname,String pass) {
		
		try {
			Connection con = DBConnection.getCon();
			
			PreparedStatement ps = con.prepareStatement("select uname,pass from RegisterUser where uname=? and pass=?");
			
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				 if(rs.getString(1).equals(uname) && rs.getString(2).equals(pass)) {
					  b = true;
				 }
			}else { 
				  b = false; 
			}
			
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		  
		return b;
	} 
	
}
