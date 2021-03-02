package cn.tedu.jt.pojo;

import java.util.List;

//商品分类对象
public class ItemCat {
	//对象关联：一对多
	private List<Item> items;
	
	private Long id;
	private String name;
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ItemCat [items=" + items + ", id=" + id + ", name=" + name + "]";
	}
}
