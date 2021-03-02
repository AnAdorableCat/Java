package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestTT {
	public static void main(String[] args) throws Exception {
		/*
		 * 开发步骤：
		 * 1、注册驱动
		 * 2、获取链接
		 * 3、创建PS对象
		 * 4、设置？参数值
		 * 5、执行SQL
		 * 6、解析结果集
		 */
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/py-school-db"
				+ "?characterEncoding=utf8"
				+ "&serverTimezone=Asia/Shanghai";
		
		Connection cn = DriverManager.getConnection(url, "root", "root");
		
		//3-105	计算机导论	825
		String sql = "select * from courses"
				+ " where cno=? or tno=? or cname=?";
		PreparedStatement ps = cn.prepareStatement(sql);
		ps.setString(1, "3-105");
		ps.setString(2, "856");
		ps.setString(3, "操作系统");
		
		ResultSet rs = ps.executeQuery();
		while( rs.next() ) {
			for(int i=1; i<=rs.getMetaData().getColumnCount(); i++) {
				System.out.print( rs.getString(i)+"\t" );
			}
			System.out.println();  //换行
		}
	}
}



