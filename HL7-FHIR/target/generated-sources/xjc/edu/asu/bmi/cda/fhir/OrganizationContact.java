//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:21:42 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
 * 
 * <p>Java class for Organization.Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization.Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization.Contact", propOrder = {
    "purpose",
    "name",
    "telecoms",
    "address",
    "gender"
})
public class OrganizationContact
    extends BackboneElement
    implements Serializable
{

    protected CodeableConcept purpose;
    protected HumanName name;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected Address address;
    protected CodeableConcept gender;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPurpose(CodeableConcept value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setName(HumanName value) {
        this.name = value;
    }

    /**
     * Gets the value of the telecoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getTelecoms() {
        if (telecoms == null) {
            telecoms = new ArrayList<Contact>();
        }
        return this.telecoms;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setGender(CodeableConcept value) {
        this.gender = value;
    }

    public OrganizationContact withPurpose(CodeableConcept value) {
        setPurpose(value);
        return this;
    }

    public OrganizationContact withName(HumanName value) {
        setName(value);
        return this;
    }

    public OrganizationContact withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public OrganizationContact withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public OrganizationContact withAddress(Address value) {
        setAddress(value);
        return this;
    }

    public OrganizationContact withGender(CodeableConcept value) {
        setGender(value);
        return this;
    }

    @Override
    public OrganizationContact withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public OrganizationContact withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public OrganizationContact withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public OrganizationContact withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public OrganizationContact withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
