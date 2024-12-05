package com.nit.DAO;

import java.sql.*;

import com.nit.Bean.UserBean;

public class UserDAO {

	int k = 0;
	public int rerister(UserBean e) {
		try {
			Connection con = DBConnection.getCon();
 
			PreparedStatement ps = con.prepareStatement("insert into RegisterUser values(?,?,?,?,?,?,?)");
			ps.setString(1, e.getUserName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getAddress());
			ps.setString(4, e.getMailId());
			ps.setString(5, e.getPhNo());
			ps.setString(6, e.getState());
			ps.setString(7, e.getCountry());

			k = ps.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return k;
	}
}
