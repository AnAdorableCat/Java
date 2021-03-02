package cn.tedu.jt.mapper;

import java.util.List;
import java.util.Map;

import cn.tedu.jt.pojo.Item;

//接口，规定方法
public interface ItemMapper {
	//泛型，List集合中必须方法Item对象，其他的不行，约束检查
	public List<Item> find(Item item);
	public Item get(Long id);
	public Integer count();
	
	public void insert(Item item);
	public void update(Item item);
	public void delete(Long id);
	
	//删除多条，使用map集合作为参数，它是一个值，只put一次
	public void deleteMuch(Map<String, Object> map);

//	<select id="find" resultMap="itemRM">
//select * from tb_item
//	</select>
}
