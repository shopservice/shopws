package com.shopping;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.pay.Receipt;
import com.logistic.Shiporder;;

@XmlRootElement(name = "confirm")
public class Confirm implements Serializable {

   private static final long serialVersionUID = 1L;
   private String orderid;
   private Receipt receipt;
   private Shiporder shiporder;
 
   public Confirm(){}
   
   public String getOrderid() {
      return orderid;
   }

   @XmlElement
   public void setOrderid(String id) {
      this.orderid = id;
   }
   
   public Receipt getReceipt() {
      return receipt;
   }
   @XmlElement
   public void setReceipt(Receipt recp) {
      this.receipt = recp;
   }
   public Shiporder getShiporder() {
	      return shiporder;
	   }
	   @XmlElement
	   public void setShiporder(Shiporder order) {
	      this.shiporder = order;
	   }
 
}