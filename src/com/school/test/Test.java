package com.school.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.school.JFreeChartTest2.JFreeChartTest2;
import com.school.dao.DataDao;
import com.school.pojo.Student;
//有一个数据文件，保存了100天 2000 个教职工/学生的所有防疫信息，
//请设计一个命令行程序， 
//支持查询某人在某一天的疫情情况，  查询某种数据的周/月的疫情统计情况，并用柱状图显示统计结果。
public class Test {
	public static void main(String[] args) throws SQLException, ParseException {
		DataDao dd = new DataDao();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1、查询的 指定学生名称");
			System.out.println("2、查询数据统计图");
			System.out.println("3、退出");
			System.out.println("请输入你的选项");
			String choose = sc.nextLine();
			switch(choose){
				case "1":
					System.out.println("请输入学生名称");
					String name = sc.nextLine();
					Student stu = new Student();
					stu.setName(name);
					dd.queryCase(stu);
					break;
				case "2":
					List<Integer> list = dd.getAllInfo();
					JFreeChartTest2.picture(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4));
					break;
				case "3":
					System.out.println("已退出");
					return;
				default :
				System.out.println("你输入的格式不正确");
			}
		}
	}

	private static void getAllInfo() {
		// TODO Auto-generated method stub
		
	}
}
