
package com.mera.borisgk98.autoshowroom.server.soap;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for readCustomerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readCustomerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}customer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readCustomerResponse", propOrder = {
    "_return"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
public class ReadCustomerResponse implements Equals2, HashCode2
{

    @XmlElement(name = "return")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    protected Customer _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public Customer getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public void setReturn(Customer value) {
        this._return = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public ReadCustomerResponse withReturn(Customer value) {
        setReturn(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Customer theReturn;
            theReturn = this.getReturn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_return", theReturn), currentHashCode, theReturn, (this._return!= null));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReadCustomerResponse that = ((ReadCustomerResponse) object);
        {
            Customer lhsReturn;
            lhsReturn = this.getReturn();
            Customer rhsReturn;
            rhsReturn = that.getReturn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_return", lhsReturn), LocatorUtils.property(thatLocator, "_return", rhsReturn), lhsReturn, rhsReturn, (this._return!= null), (that._return!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-03T11:44:06+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
