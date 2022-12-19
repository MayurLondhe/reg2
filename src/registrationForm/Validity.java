package registrationForm;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import registrationForm.Member;

public class Validity {
	private String url="jdbc:mysql://localhost:3306/Mayur";
	private String uname="root";
	private String pss="Mayur@2002";
	private String driver="com.mysql.cj.jdbc.Driver";
	public void loadDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,uname,pss);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Member member) {
		loadDriver(driver);
		Connection con=getConnection();
		String results="Data Enter Successfully";
		String sql="insert into Mayur.Emp values(?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getUname());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getContact());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			results="Data Not Enter";
		}
		return results;
		
	}
}
