
package com.mera.borisgk98.autoshowroom.server.soap;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auto" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}auto" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}customer" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="seller" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}seller" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}orderStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "auto",
    "customer",
    "id",
    "seller",
    "status"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
public class Order implements Equals2, HashCode2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    protected Auto auto;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    protected Customer customer;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    protected Integer id;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    protected Seller seller;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    protected OrderStatus status;

    /**
     * Gets the value of the auto property.
     * 
     * @return
     *     possible object is
     *     {@link Auto }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Auto getAuto() {
        return auto;
    }

    /**
     * Sets the value of the auto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Auto }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public void setAuto(Auto value) {
        this.auto = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link Seller }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Seller getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seller }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public void setSeller(Seller value) {
        this.seller = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public void setStatus(OrderStatus value) {
        this.status = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Order withAuto(Auto value) {
        setAuto(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Order withCustomer(Customer value) {
        setCustomer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Order withId(Integer value) {
        setId(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Order withSeller(Seller value) {
        setSeller(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public Order withStatus(OrderStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Auto theAuto;
            theAuto = this.getAuto();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auto", theAuto), currentHashCode, theAuto, (this.auto!= null));
        }
        {
            Customer theCustomer;
            theCustomer = this.getCustomer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customer", theCustomer), currentHashCode, theCustomer, (this.customer!= null));
        }
        {
            Integer theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        {
            Seller theSeller;
            theSeller = this.getSeller();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seller", theSeller), currentHashCode, theSeller, (this.seller!= null));
        }
        {
            OrderStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Order that = ((Order) object);
        {
            Auto lhsAuto;
            lhsAuto = this.getAuto();
            Auto rhsAuto;
            rhsAuto = that.getAuto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auto", lhsAuto), LocatorUtils.property(thatLocator, "auto", rhsAuto), lhsAuto, rhsAuto, (this.auto!= null), (that.auto!= null))) {
                return false;
            }
        }
        {
            Customer lhsCustomer;
            lhsCustomer = this.getCustomer();
            Customer rhsCustomer;
            rhsCustomer = that.getCustomer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customer", lhsCustomer), LocatorUtils.property(thatLocator, "customer", rhsCustomer), lhsCustomer, rhsCustomer, (this.customer!= null), (that.customer!= null))) {
                return false;
            }
        }
        {
            Integer lhsId;
            lhsId = this.getId();
            Integer rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            Seller lhsSeller;
            lhsSeller = this.getSeller();
            Seller rhsSeller;
            rhsSeller = that.getSeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seller", lhsSeller), LocatorUtils.property(thatLocator, "seller", rhsSeller), lhsSeller, rhsSeller, (this.seller!= null), (that.seller!= null))) {
                return false;
            }
        }
        {
            OrderStatus lhsStatus;
            lhsStatus = this.getStatus();
            OrderStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-27T02:33:34+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
