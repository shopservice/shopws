
package com.pay;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pay package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Receipt_QNAME = new QName("http://pay.com/", "receipt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pay
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Receipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pay.com/", name = "receipt")
    public JAXBElement<Receipt> createReceipt(Receipt value) {
        return new JAXBElement<Receipt>(_Receipt_QNAME, Receipt.class, null, value);
    }

}
