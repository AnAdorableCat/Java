package jt20122;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cn.tedu.jt.mapper.ItemCatMapper;
import cn.tedu.jt.mapper.ItemMapper;
import cn.tedu.jt.pojo.Item;
import cn.tedu.jt.pojo.ItemCat;

public class TestMybatis {
	private SqlSessionFactory factory;
	
	@BeforeEach  //初始化，创建factory对象
	public void init() throws IOException {
		InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
		factory = new SqlSessionFactoryBuilder().build(is);
	}
	
	@Test
	public void findItemCat() {
		SqlSession session = factory.openSession();
		ItemCatMapper mapper = session.getMapper(ItemCatMapper.class);
		
		List<ItemCat> itemCatList = mapper.findItemCat();
		for(ItemCat ic : itemCatList) {
			System.out.println(ic);
		}
	}
	
	@Test
	public void findItem() {
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);
		
		List<Item> itemList = mapper.findItem();
		for(Item o : itemList) {
			System.out.println(o);
		}
	}
	
}



