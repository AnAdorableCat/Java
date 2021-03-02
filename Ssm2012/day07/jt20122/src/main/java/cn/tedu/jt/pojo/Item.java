package cn.tedu.jt.pojo;

//商品对象
public class Item {
	//对象关联，对一
	private ItemDesc itemDesc;
	
	private Long id;
	private String title;
	private Integer price;
	
	public ItemDesc getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(ItemDesc itemDesc) {
		this.itemDesc = itemDesc;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemDesc=" + itemDesc + ", id=" + id + ", title=" + title + ", price=" + price + "]";
	}
}
