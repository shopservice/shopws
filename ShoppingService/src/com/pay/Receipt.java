
package com.pay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receipt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fromaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receipt", propOrder = {
    "amount",
    "fromaccount",
    "id",
    "toaccount"
})
public class Receipt {

    protected Float amount;
    protected String fromaccount;
    protected String id;
    protected String toaccount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmount(Float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the fromaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromaccount() {
        return fromaccount;
    }

    /**
     * Sets the value of the fromaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromaccount(String value) {
        this.fromaccount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the toaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToaccount() {
        return toaccount;
    }

    /**
     * Sets the value of the toaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToaccount(String value) {
        this.toaccount = value;
    }

}
