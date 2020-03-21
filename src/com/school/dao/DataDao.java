package com.school.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.school.pojo.Student;

public class DataDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public void queryCase(Student stu) throws SQLException {
//		查询某个学生的情况
		RegistrationDriven();
		String sql = "select * from student where name = ?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1,stu.getName());
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("date")+"是否密切接触-："+rs.getString("isContact")+" ***是否武汉-："+rs.getString("isWuhan")+" ***是否湖北-："+rs.getString("isHubei")+" ***是否疑似-："+rs.getString("isYiSi")+" ***是否确诊-："+rs.getString("isQueZhen"));
		}
	}
	
	public List<Integer> getAllInfo() throws SQLException, ParseException {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
//		查询所有情况
		List<Integer> list = new ArrayList<>(); 
		Student stu = new Student();
		RegistrationDriven();
//		是否密切接触
		String sql = "select count(isContact) as te from student WHERE isContact = ? ";
		
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "是");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			list.add(Integer.parseInt(rs.getString("te")));
		}
		
		
//		统计是否武汉
		String sql1 = "select count(isWuhan) as te1 from student WHERE isWuhan = ? ";
		
		PreparedStatement pst1 = conn.prepareStatement(sql1);
		pst1.setString(1, "是");
		ResultSet rs1 = pst1.executeQuery();
		while(rs1.next()) {
			list.add(Integer.parseInt(rs1.getString("te1")));
		}
		
//		统计是否湖北
		String sql2 = "select count(isHubei) as te2 from student WHERE isHubei = ? ";
		
		PreparedStatement pst2 = conn.prepareStatement(sql2);
		pst2.setString(1, "是");
		ResultSet rs2 = pst2.executeQuery();
		while(rs2.next()) {
			list.add(Integer.parseInt(rs2.getString("te2")));
		}
		
		
//		统计是否疑似
		String sql3 = "select count(isYiSi) as te3 from student WHERE isYiSi = ? ";
		
		PreparedStatement pst3 = conn.prepareStatement(sql3);
		pst3.setString(1, "是");
		ResultSet rs3 = pst3.executeQuery();
		while(rs3.next()) {
			list.add(Integer.parseInt(rs3.getString("te3")));
		}
		
		
//		统计是否确诊
		String sql4 = "select count(isQueZhen) as te4 from student WHERE isQueZhen = ? ";
		
		PreparedStatement pst4 = conn.prepareStatement(sql4);
		pst4.setString(1, "是");
		ResultSet rs4 = pst4.executeQuery();
		while(rs4.next()) {
			list.add(Integer.parseInt(rs4.getString("te4")));
		}
		

		
//		while(rs.next()) {
//			stu.setId(Integer.parseInt(rs.getString("id")));
//			stu.setName(rs.getString("name"));
//			stu.setClassl(rs.getString("classl"));
//			stu.setCollege(rs.getString("college"));
//			stu.setDate(sdf.parse(rs.getString("date")));
//			stu.setIsContact(rs.getString("isContact"));
//			stu.setIsHubei(rs.getString("isHubei"));
//			stu.setIsWuhan(rs.getString("isWuhan"));
//			stu.setIsContact(rs.getString("isContact"));
//			stu.setIsYiSi(rs.getString("isYiSi"));
//			stu.setIsQueZhen(rs.getString("isQueZhen"));
//			list.add(stu);
//		}
		return list;
	}
	

	private void RegistrationDriven() {
		try {
			// 1）注册驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2）创建连接对象
//					String url = "jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";
			String url = "jdbc:mysql://localhost:3306/studentinfo?serverTimezone=GMT%2B8";
			String username = "root";
			String password = "root";
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
