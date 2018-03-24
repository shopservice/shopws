package com.logistic;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shiporder")
public class Shiporder implements Serializable {

   private static final long serialVersionUID = 1L;
   private int orderid;
   private String fromaddress;
   private String toaddress;
   private Date orderday;
   private Float amount;
   private String notes;

   public Shiporder(){}
   
   public Shiporder(int id, String fraddr, String toaddr, Date orderday, Float amnt, String notes ){
      this.orderid = id;
      this.fromaddress = fraddr;
      this.toaddress = toaddr;
      this.orderday = orderday;
      this.amount = amnt;
      this.notes = notes;
    }

   public int getOrderid() {
      return orderid;
   }

   @XmlElement
   public void setOrderid(int id) {
      this.orderid = id;
   }
   
   public String getFromaddress() {
      return fromaddress;
   }
   @XmlElement
   public void setFromaddress(String fraddr) {
      this.fromaddress = fraddr;
   }

   public String getToaddress() {
      return toaddress;
   }
   @XmlElement
   public void setToaddress(String toaddr) {
      this.toaddress = toaddr;
   }	
   
   public Date getOrderday() {
	      return orderday;
   }
   @XmlElement
   public void setOrderday(Date today) {
	     this.orderday = today;
    }  
   
   public Float getAmount() {
	      return amount;
   }
   @XmlElement
   public void setAmount(Float amnt) {
	     this.amount = amnt;
   }  

   public String getNotes() {
	      return notes;
   }
   @XmlElement
   public void setNotes(String nt) {
	     this.notes = nt;
   }  

}