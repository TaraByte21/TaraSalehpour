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
 * Demographics and other administrative information about a person or animal receiving care or other health-related services.
 * 
 * <p>Java class for Patient.Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient.Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient.Contact", propOrder = {
    "relationship",
    "name",
    "telecom",
    "address",
    "gender",
    "organization"
})
@Entity(name = "PatientContact")
@Table(name = "PATIENTCONTACT")
public class PatientContact
    extends BackboneElement
    implements Equals, HashCode
{

    protected List<CodeableConcept> relationship;
    protected HumanName name;
    protected List<Contact> telecom;
    protected Address address;
    protected CodeableConcept gender;
    protected ResourceReference organization;

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATIONSHIP_PATIENTCONTACT__0")
    public List<CodeableConcept> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<CodeableConcept>();
        }
        return this.relationship;
    }

    /**
     * 
     * 
     */
    public void setRelationship(List<CodeableConcept> relationship) {
        this.relationship = relationship;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    @ManyToOne(targetEntity = HumanName.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__PATIENTCONTACT_HJID")
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
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    @OneToMany(targetEntity = Contact.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TELECOM_PATIENTCONTACT_HJID")
    public List<Contact> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Contact>();
        }
        return this.telecom;
    }

    /**
     * 
     * 
     */
    public void setTelecom(List<Contact> telecom) {
        this.telecom = telecom;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    @ManyToOne(targetEntity = Address.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDRESS_PATIENTCONTACT_HJID")
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
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "GENDER_PATIENTCONTACT_HJID")
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

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGANIZATION_PATIENTCONTACT__0")
    public ResourceReference getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOrganization(ResourceReference value) {
        this.organization = value;
    }

    public PatientContact withRelationship(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getRelationship().add(value);
            }
        }
        return this;
    }

    public PatientContact withRelationship(Collection<CodeableConcept> values) {
        if (values!= null) {
            getRelationship().addAll(values);
        }
        return this;
    }

    public PatientContact withRelationship(List<CodeableConcept> relationship) {
        setRelationship(relationship);
        return this;
    }

    public PatientContact withName(HumanName value) {
        setName(value);
        return this;
    }

    public PatientContact withTelecom(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecom().add(value);
            }
        }
        return this;
    }

    public PatientContact withTelecom(Collection<Contact> values) {
        if (values!= null) {
            getTelecom().addAll(values);
        }
        return this;
    }

    public PatientContact withTelecom(List<Contact> telecom) {
        setTelecom(telecom);
        return this;
    }

    public PatientContact withAddress(Address value) {
        setAddress(value);
        return this;
    }

    public PatientContact withGender(CodeableConcept value) {
        setGender(value);
        return this;
    }

    public PatientContact withOrganization(ResourceReference value) {
        setOrganization(value);
        return this;
    }

    @Override
    public PatientContact withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public PatientContact withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public PatientContact withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public PatientContact withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public PatientContact withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public PatientContact withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public PatientContact withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PatientContact)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PatientContact that = ((PatientContact) object);
        {
            List<CodeableConcept> lhsRelationship;
            lhsRelationship = (((this.relationship!= null)&&(!this.relationship.isEmpty()))?this.getRelationship():null);
            List<CodeableConcept> rhsRelationship;
            rhsRelationship = (((that.relationship!= null)&&(!that.relationship.isEmpty()))?that.getRelationship():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationship", lhsRelationship), LocatorUtils.property(thatLocator, "relationship", rhsRelationship), lhsRelationship, rhsRelationship)) {
                return false;
            }
        }
        {
            HumanName lhsName;
            lhsName = this.getName();
            HumanName rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            List<Contact> lhsTelecom;
            lhsTelecom = (((this.telecom!= null)&&(!this.telecom.isEmpty()))?this.getTelecom():null);
            List<Contact> rhsTelecom;
            rhsTelecom = (((that.telecom!= null)&&(!that.telecom.isEmpty()))?that.getTelecom():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecom", lhsTelecom), LocatorUtils.property(thatLocator, "telecom", rhsTelecom), lhsTelecom, rhsTelecom)) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            CodeableConcept lhsGender;
            lhsGender = this.getGender();
            CodeableConcept rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            ResourceReference lhsOrganization;
            lhsOrganization = this.getOrganization();
            ResourceReference rhsOrganization;
            rhsOrganization = that.getOrganization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organization", lhsOrganization), LocatorUtils.property(thatLocator, "organization", rhsOrganization), lhsOrganization, rhsOrganization)) {
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
            List<CodeableConcept> theRelationship;
            theRelationship = (((this.relationship!= null)&&(!this.relationship.isEmpty()))?this.getRelationship():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationship", theRelationship), currentHashCode, theRelationship);
        }
        {
            HumanName theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<Contact> theTelecom;
            theTelecom = (((this.telecom!= null)&&(!this.telecom.isEmpty()))?this.getTelecom():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecom", theTelecom), currentHashCode, theTelecom);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
        }
        {
            CodeableConcept theGender;
            theGender = this.getGender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gender", theGender), currentHashCode, theGender);
        }
        {
            ResourceReference theOrganization;
            theOrganization = this.getOrganization();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organization", theOrganization), currentHashCode, theOrganization);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
