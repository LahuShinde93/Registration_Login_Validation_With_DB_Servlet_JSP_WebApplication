package com.nit.DAO;

import java.sql.*;
import java.util.ArrayList;

import com.nit.Bean.UserBean;


public class ViewUsersDAO {
	
	ArrayList<UserBean> al = new ArrayList<>();


	public ArrayList<UserBean> viewUsers(){ {
		
		try {
			
			Connection con = DBConnection.getCon();
			
			PreparedStatement ps = con.prepareStatement("select * from RegisterUser");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				UserBean ub = new UserBean();
				
				ub.setUserName(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setAddress(rs.getString(3));
				ub.setMailId(rs.getString(4));
				ub.setPhNo(rs.getString(5));
				ub.setState(rs.getString(6));
				ub.setCountry(rs.getString(7));
				
				al.add(ub); //Bean Object Added to ArrayList
				 
			}
			
		}catch(Exception e) {
			e.printStackTrace();  
		}
		
		return al;
	}
}
}
