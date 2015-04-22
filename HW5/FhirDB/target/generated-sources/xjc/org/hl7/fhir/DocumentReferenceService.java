//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * A reference to a document.
 * 
 * <p>Java class for DocumentReference.Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentReference.Service">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="address" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}DocumentReference.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference.Service", propOrder = {
    "type",
    "address",
    "parameter"
})
@Entity(name = "DocumentReferenceService")
@Table(name = "DOCUMENTREFERENCESERVICE")
public class DocumentReferenceService
    extends BackboneElement
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected org.hl7.fhir.String address;
    protected List<DocumentReferenceParameter> parameter;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__DOCUMENTREFERENCESERVI_0")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDRESS_DOCUMENTREFERENCESER_0")
    public org.hl7.fhir.String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setAddress(org.hl7.fhir.String value) {
        this.address = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceParameter }
     * 
     * 
     */
    @OneToMany(targetEntity = DocumentReferenceParameter.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARAMETER__DOCUMENTREFERENCE_0")
    public List<DocumentReferenceParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<DocumentReferenceParameter>();
        }
        return this.parameter;
    }

    /**
     * 
     * 
     */
    public void setParameter(List<DocumentReferenceParameter> parameter) {
        this.parameter = parameter;
    }

    public DocumentReferenceService withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public DocumentReferenceService withAddress(org.hl7.fhir.String value) {
        setAddress(value);
        return this;
    }

    public DocumentReferenceService withParameter(DocumentReferenceParameter... values) {
        if (values!= null) {
            for (DocumentReferenceParameter value: values) {
                getParameter().add(value);
            }
        }
        return this;
    }

    public DocumentReferenceService withParameter(Collection<DocumentReferenceParameter> values) {
        if (values!= null) {
            getParameter().addAll(values);
        }
        return this;
    }

    public DocumentReferenceService withParameter(List<DocumentReferenceParameter> parameter) {
        setParameter(parameter);
        return this;
    }

    @Override
    public DocumentReferenceService withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentReferenceService withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentReferenceService withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public DocumentReferenceService withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentReferenceService withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentReferenceService withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public DocumentReferenceService withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DocumentReferenceService)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DocumentReferenceService that = ((DocumentReferenceService) object);
        {
            CodeableConcept lhsType;
            lhsType = this.getType();
            CodeableConcept rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsAddress;
            lhsAddress = this.getAddress();
            org.hl7.fhir.String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            List<DocumentReferenceParameter> lhsParameter;
            lhsParameter = (((this.parameter!= null)&&(!this.parameter.isEmpty()))?this.getParameter():null);
            List<DocumentReferenceParameter> rhsParameter;
            rhsParameter = (((that.parameter!= null)&&(!that.parameter.isEmpty()))?that.getParameter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameter", lhsParameter), LocatorUtils.property(thatLocator, "parameter", rhsParameter), lhsParameter, rhsParameter)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            org.hl7.fhir.String theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
        }
        {
            List<DocumentReferenceParameter> theParameter;
            theParameter = (((this.parameter!= null)&&(!this.parameter.isEmpty()))?this.getParameter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameter", theParameter), currentHashCode, theParameter);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}