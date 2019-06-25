
package com.mera.borisgk98.autoshowroom.server.soap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for auto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mark" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}autoMark" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}autoModel" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{http://soap.server.autoshowroom.borisgk98.mera.com/}autoOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auto", propOrder = {
    "id",
    "mark",
    "model",
    "options"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
public class Auto implements Equals2, HashCode2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    protected Integer id;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    protected AutoMark mark;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    protected AutoModel model;
    @XmlElement(nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    protected List<AutoOption> options;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link AutoMark }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public AutoMark getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoMark }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public void setMark(AutoMark value) {
        this.mark = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link AutoModel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public AutoModel getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoModel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public void setModel(AutoModel value) {
        this.model = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoOption }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public List<AutoOption> getOptions() {
        if (options == null) {
            options = new ArrayList<AutoOption>();
        }
        return this.options;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public Auto withId(Integer value) {
        setId(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public Auto withMark(AutoMark value) {
        setMark(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public Auto withModel(AutoModel value) {
        setModel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public Auto withOptions(AutoOption... values) {
        if (values!= null) {
            for (AutoOption value: values) {
                getOptions().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public Auto withOptions(Collection<AutoOption> values) {
        if (values!= null) {
            getOptions().addAll(values);
        }
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Integer theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        {
            AutoMark theMark;
            theMark = this.getMark();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mark", theMark), currentHashCode, theMark, (this.mark!= null));
        }
        {
            AutoModel theModel;
            theModel = this.getModel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "model", theModel), currentHashCode, theModel, (this.model!= null));
        }
        {
            List<AutoOption> theOptions;
            theOptions = (((this.options!= null)&&(!this.options.isEmpty()))?this.getOptions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "options", theOptions), currentHashCode, theOptions, ((this.options!= null)&&(!this.options.isEmpty())));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Auto that = ((Auto) object);
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
            AutoMark lhsMark;
            lhsMark = this.getMark();
            AutoMark rhsMark;
            rhsMark = that.getMark();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mark", lhsMark), LocatorUtils.property(thatLocator, "mark", rhsMark), lhsMark, rhsMark, (this.mark!= null), (that.mark!= null))) {
                return false;
            }
        }
        {
            AutoModel lhsModel;
            lhsModel = this.getModel();
            AutoModel rhsModel;
            rhsModel = that.getModel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "model", lhsModel), LocatorUtils.property(thatLocator, "model", rhsModel), lhsModel, rhsModel, (this.model!= null), (that.model!= null))) {
                return false;
            }
        }
        {
            List<AutoOption> lhsOptions;
            lhsOptions = (((this.options!= null)&&(!this.options.isEmpty()))?this.getOptions():null);
            List<AutoOption> rhsOptions;
            rhsOptions = (((that.options!= null)&&(!that.options.isEmpty()))?that.getOptions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "options", lhsOptions), LocatorUtils.property(thatLocator, "options", rhsOptions), lhsOptions, rhsOptions, ((this.options!= null)&&(!this.options.isEmpty())), ((that.options!= null)&&(!that.options.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-05-31T12:27:38+03:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
