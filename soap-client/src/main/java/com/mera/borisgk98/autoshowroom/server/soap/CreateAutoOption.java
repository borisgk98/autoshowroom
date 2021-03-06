
package com.mera.borisgk98.autoshowroom.server.soap;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for createAutoOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAutoOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}autoOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAutoOption", propOrder = {
    "arg0"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
public class CreateAutoOption implements Equals2, HashCode2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    protected AutoOption arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link AutoOption }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public AutoOption getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoOption }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public void setArg0(AutoOption value) {
        this.arg0 = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public CreateAutoOption withArg0(AutoOption value) {
        setArg0(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            AutoOption theArg0;
            theArg0 = this.getArg0();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arg0", theArg0), currentHashCode, theArg0, (this.arg0 != null));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreateAutoOption that = ((CreateAutoOption) object);
        {
            AutoOption lhsArg0;
            lhsArg0 = this.getArg0();
            AutoOption rhsArg0;
            rhsArg0 = that.getArg0();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arg0", lhsArg0), LocatorUtils.property(thatLocator, "arg0", rhsArg0), lhsArg0, rhsArg0, (this.arg0 != null), (that.arg0 != null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:37+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
