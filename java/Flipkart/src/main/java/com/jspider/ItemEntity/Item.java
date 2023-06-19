package com.jspider.ItemEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM_INFO")
public class Item implements Serializable{

	@Id
	@Column(name="item_id")
	private long itemId;
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_price")
	private double itemPrice;
	@Column(name="item_stock")
	private double totalItemStock;
	@Column(name="item_create_date")
	private String itemCreateDate;
	
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getTotalItemStock() {
		return totalItemStock;
	}
	public void setTotalItemStock(double totalItemStock) {
		this.totalItemStock = totalItemStock;
	}
	public String getItemCreateDate() {
		return itemCreateDate;
	}
	public void setItemCreateDate(String itemCreateDate) {
		this.itemCreateDate = itemCreateDate;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", totalItemStock="
				+ totalItemStock + ", itemCreateDate=" + itemCreateDate + "]";
	}
	
}
