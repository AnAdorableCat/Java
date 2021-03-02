package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cn.tedu.jt.mapper.ItemMapper;
import cn.tedu.jt.pojo.Item;

//以接口方法完成
public class TestMybatisInterface {
	private SqlSessionFactory factory;
	
	@BeforeEach
	private void init() throws IOException {
		InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
		factory = new SqlSessionFactoryBuilder().build(is);
	}
	
	@Test
	public void find() {
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);		//它的参数是一个接口，ItemMapper.java
		
		List<Item> list = mapper.find("%诺基亚%");
		for(Item o : list) {
			System.out.println(o);
		}
	}
	
	@Test
	public void get() {
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);		//它的参数是一个接口，ItemMapper.java
		
		Item item = mapper.get(1474391946L);
		System.out.println( item );
		//查询不需要事务的，不需要提交，新增、修改、删除，session.commit();
	}
	
	@Test
	public void count() {
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);		//它的参数是一个接口，ItemMapper.java
		
		Integer count = mapper.count();
		System.out.println("记录个数：" + count );
	}	
	
	@Test
	public void insert() {
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);
		
		//怎么把众多参数赋值，如果某个字段没有set，包装类型，默认值null
		Item item = new Item();		//不是说有了框架就不能new
		item.setTitle("苹果12 pro");
		item.setSellPoint("好用");
		item.setPrice(10000L);
		item.setNum(99);
		item.setCid(560);
		
		mapper.insert(item);
		session.commit();  //mysql默认自动提交false，需要手动提交
	}
	
	@Test
	public void update() {
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);
		
		Item item = new Item();
		item.setId(1474391946L);
		item.setTitle("华为x40");
		item.setSellPoint("摄像头非常棒");
		item.setPrice(888L);
		item.setNum(66);
		item.setCid(560);
		item.setStatus(1);
		
		mapper.update(item);
		session.commit();
	}
	
	@Test
	public void delete() {
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);
		
		mapper.delete(1474391950L);
		session.commit();
	}	
}




