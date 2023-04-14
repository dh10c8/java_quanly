package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.SinhVienModel;

public class SinhVienDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	private String URL = "jdbc:mysql://localhost:3306/java_quanly?useSSL=false";
	private String Username = "root";
	private String Password = "";

	private Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, Username, Password);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Kết nối thất bại!!");
		}
		return conn;
	}

	public List<SinhVienModel> getAllStudent() {
		List<SinhVienModel> list = new ArrayList<>();
		String sql = "SELECT * FROM sinhvien";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new SinhVienModel(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public void deleteStudent(String id) {
		String sql = "DELETE FROM `sinhvien` WHERE id = ?";
		try {
			conn =  getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void addStudent(SinhVienModel sv) {
		String sql = "INSERT INTO `sinhvien`(`name`, `email`) VALUES (?,?)";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, sv.getName());
			ps.setString(2, sv.getEmail());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public SinhVienModel getStudentById(String id) {
		String sql = "SELECT * FROM sinhvien WHERE id = ?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new SinhVienModel(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	} 
	
	public void edit(SinhVienModel sv) {
		String sql = "UPDATE `sinhvien` SET `name` = ?, `email` = ? WHERE `id` = ?";
		System.out.println(sv.getName());
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, sv.getName());
			ps.setString(2, sv.getEmail());
			ps.setString(3, Integer.toString(sv.getId()));
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
