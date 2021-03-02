package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import cn.tedu.jt.pojo.Item;

public class TestMybatis {
	private SqlSessionFactory factory;			//成员变量，各个方法共享，线程安全
	
	@Test
	public void mybatis() throws IOException {
		//读取资源文件，解析xml文件
		InputStream is 
		= Resources.getResourceAsStream("sqlMapConfig.xml");
		
		factory = new SqlSessionFactoryBuilder().build(is);
		
		//局部变量，只能方法内使用，线程非安全
		SqlSession session = factory.openSession();
		
		String statement = "cn.tedu.jt.mapper.ItemMapper.find"; //namespace.id 找到对应<select>标签
		//mybatis，它会去找<select>标签，sql语句执行ResultSet，自动映射List<Item>
		List<Item> list = session.selectList(statement);
		for(Item o : list) {
			System.out.println(o);
		}
	}
}
