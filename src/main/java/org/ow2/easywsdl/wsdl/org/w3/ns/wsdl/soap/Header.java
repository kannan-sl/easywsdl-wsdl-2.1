//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 03:46:51 PM CET 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
import org.ow2.easywsdl.wsdl.org.w3.ns.wsdl.ExtensibleDocumentedType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType">
 *       &lt;attribute name="element" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="mustUnderstand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "header")
public class Header
    extends ExtensibleDocumentedType
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlAttribute(required = true)
    protected QName element;
    @XmlAttribute
    protected Boolean mustUnderstand;
    @XmlAttribute
    protected Boolean required;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setElement(QName value) {
        this.element = value;
    }

    /**
     * Gets the value of the mustUnderstand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustUnderstand() {
        return mustUnderstand;
    }

    /**
     * Sets the value of the mustUnderstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustUnderstand(Boolean value) {
        this.mustUnderstand = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            QName theElement;
            theElement = this.getElement();
            toStringBuilder.append("element", theElement);
        }
        {
            Boolean theMustUnderstand;
            theMustUnderstand = this.isMustUnderstand();
            toStringBuilder.append("mustUnderstand", theMustUnderstand);
        }
        {
            Boolean theRequired;
            theRequired = this.isRequired();
            toStringBuilder.append("required", theRequired);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof Header)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final Header that = ((Header) object);
        equalsBuilder.append(this.getElement(), that.getElement());
        equalsBuilder.append(this.isMustUnderstand(), that.isMustUnderstand());
        equalsBuilder.append(this.isRequired(), that.isRequired());
    }

    public boolean equals(Object object) {
        if (!(object instanceof Header)) {
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
        hashCodeBuilder.append(this.getElement());
        hashCodeBuilder.append(this.isMustUnderstand());
        hashCodeBuilder.append(this.isRequired());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final Header copy = ((target == null)?((Header) createCopy()):((Header) target));
        super.copyTo(copy, copyBuilder);
        {
            QName sourceElement;
            sourceElement = this.getElement();
            QName copyElement = ((QName) copyBuilder.copy(sourceElement));
            copy.setElement(copyElement);
        }
        {
            Boolean sourceMustUnderstand;
            sourceMustUnderstand = this.isMustUnderstand();
            Boolean copyMustUnderstand = ((Boolean) copyBuilder.copy(sourceMustUnderstand));
            copy.setMustUnderstand(copyMustUnderstand);
        }
        {
            Boolean sourceRequired;
            sourceRequired = this.isRequired();
            Boolean copyRequired = ((Boolean) copyBuilder.copy(sourceRequired));
            copy.setRequired(copyRequired);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new Header();
    }

}
