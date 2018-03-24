package com.shopping;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {

    private int memberid;
    
    private int productid;
    
    private int quantity;     //number of products
    
    private String price;
    
    private String totalpay;   //total amount

    private String toaddress;

    private String notes;

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int id) {
		this.memberid = id;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int id) {
		this.productid = id;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int qt) {
		this.quantity = qt;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTotalpay() {
		return totalpay;
	}

	public void setTotalpay(String total) {
		this.totalpay = total;
	}

	
	public String getToaddress() {
		return toaddress;
	}

	public void setToaddress(String addr) {
		this.toaddress = addr;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	
}
