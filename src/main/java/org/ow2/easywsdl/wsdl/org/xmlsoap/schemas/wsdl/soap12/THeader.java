//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 03:46:51 PM CET 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for tHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/soap12/}tExtensibilityElementOpenAttrs">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.xmlsoap.org/wsdl/soap12/}headerfault" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://schemas.xmlsoap.org/wsdl/soap12/}tHeaderAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tHeader", propOrder = {
    "headerfault"
})
public class THeader
    extends TExtensibilityElementOpenAttrs
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    protected List<THeaderFault> headerfault;
    @XmlAttribute(required = true)
    protected QName message;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String part;
    @XmlAttribute(required = true)
    protected UseChoice use;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String encodingStyle;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String namespace;

    /**
     * Gets the value of the headerfault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerfault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderfault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THeaderFault }
     * 
     * 
     */
    public List<THeaderFault> getHeaderfault() {
        if (headerfault == null) {
            headerfault = new ArrayList<THeaderFault>();
        }
        return this.headerfault;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setMessage(QName value) {
        this.message = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPart(String value) {
        this.part = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link UseChoice }
     *     
     */
    public UseChoice getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseChoice }
     *     
     */
    public void setUse(UseChoice value) {
        this.use = value;
    }

    /**
     * Gets the value of the encodingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingStyle() {
        return encodingStyle;
    }

    /**
     * Sets the value of the encodingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingStyle(String value) {
        this.encodingStyle = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            List<THeaderFault> theHeaderfault;
            theHeaderfault = this.getHeaderfault();
            toStringBuilder.append("headerfault", theHeaderfault);
        }
        {
            QName theMessage;
            theMessage = this.getMessage();
            toStringBuilder.append("message", theMessage);
        }
        {
            String thePart;
            thePart = this.getPart();
            toStringBuilder.append("part", thePart);
        }
        {
            UseChoice theUse;
            theUse = this.getUse();
            toStringBuilder.append("use", theUse);
        }
        {
            String theEncodingStyle;
            theEncodingStyle = this.getEncodingStyle();
            toStringBuilder.append("encodingStyle", theEncodingStyle);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            toStringBuilder.append("namespace", theNamespace);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof THeader)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final THeader that = ((THeader) object);
        equalsBuilder.append(this.getHeaderfault(), that.getHeaderfault());
        equalsBuilder.append(this.getMessage(), that.getMessage());
        equalsBuilder.append(this.getPart(), that.getPart());
        equalsBuilder.append(this.getUse(), that.getUse());
        equalsBuilder.append(this.getEncodingStyle(), that.getEncodingStyle());
        equalsBuilder.append(this.getNamespace(), that.getNamespace());
    }

    public boolean equals(Object object) {
        if (!(object instanceof THeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        super.hashCode(hashCodeBuilder);
        hashCodeBuilder.append(this.getHeaderfault());
        hashCodeBuilder.append(this.getMessage());
        hashCodeBuilder.append(this.getPart());
        hashCodeBuilder.append(this.getUse());
        hashCodeBuilder.append(this.getEncodingStyle());
        hashCodeBuilder.append(this.getNamespace());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final THeader copy = ((target == null)?((THeader) createCopy()):((THeader) target));
        super.copyTo(copy, copyBuilder);
        {
            List<THeaderFault> sourceHeaderfault;
            sourceHeaderfault = this.getHeaderfault();
            List<THeaderFault> copyHeaderfault = ((List<THeaderFault> ) copyBuilder.copy(sourceHeaderfault));
            copy.headerfault = null;
            List<THeaderFault> uniqueHeaderfaultl = copy.getHeaderfault();
            uniqueHeaderfaultl.addAll(copyHeaderfault);
        }
        {
            QName sourceMessage;
            sourceMessage = this.getMessage();
            QName copyMessage = ((QName) copyBuilder.copy(sourceMessage));
            copy.setMessage(copyMessage);
        }
        {
            String sourcePart;
            sourcePart = this.getPart();
            String copyPart = ((String) copyBuilder.copy(sourcePart));
            copy.setPart(copyPart);
        }
        {
            UseChoice sourceUse;
            sourceUse = this.getUse();
            UseChoice copyUse = ((UseChoice) copyBuilder.copy(sourceUse));
            copy.setUse(copyUse);
        }
        {
            String sourceEncodingStyle;
            sourceEncodingStyle = this.getEncodingStyle();
            String copyEncodingStyle = ((String) copyBuilder.copy(sourceEncodingStyle));
            copy.setEncodingStyle(copyEncodingStyle);
        }
        {
            String sourceNamespace;
            sourceNamespace = this.getNamespace();
            String copyNamespace = ((String) copyBuilder.copy(sourceNamespace));
            copy.setNamespace(copyNamespace);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new THeader();
    }

}
