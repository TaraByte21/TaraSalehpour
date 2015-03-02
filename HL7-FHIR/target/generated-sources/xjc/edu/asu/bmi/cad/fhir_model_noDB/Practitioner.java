//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 10:25:06 PM MST 
//


package edu.asu.bmi.cad.fhir_model_noDB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Practitioner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Practitioner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="photo" type="{http://hl7.org/fhir}Attachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specialty" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="qualification" type="{http://hl7.org/fhir}Practitioner.Qualification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="communication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Practitioner", propOrder = {
    "identifiers",
    "name",
    "telecoms",
    "address",
    "gender",
    "birthDate",
    "photos",
    "organization",
    "roles",
    "specialties",
    "period",
    "locations",
    "qualifications",
    "communications"
})
@XmlRootElement(name = "Practitioner")
public class Practitioner
    extends Resource
    implements Serializable
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    protected HumanName name;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected Address address;
    protected CodeableConcept gender;
    protected DateTime birthDate;
    @XmlElement(name = "photo")
    protected List<Attachment> photos;
    protected ResourceReference organization;
    @XmlElement(name = "role")
    protected List<CodeableConcept> roles;
    @XmlElement(name = "specialty")
    protected List<CodeableConcept> specialties;
    protected Period period;
    @XmlElement(name = "location")
    protected List<ResourceReference> locations;
    @XmlElement(name = "qualification")
    protected List<PractitionerQualification> qualifications;
    @XmlElement(name = "communication")
    protected List<CodeableConcept> communications;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
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

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setBirthDate(DateTime value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the photos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getPhotos() {
        if (photos == null) {
            photos = new ArrayList<Attachment>();
        }
        return this.photos;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
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

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getRoles() {
        if (roles == null) {
            roles = new ArrayList<CodeableConcept>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the specialties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSpecialties() {
        if (specialties == null) {
            specialties = new ArrayList<CodeableConcept>();
        }
        return this.specialties;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getLocations() {
        if (locations == null) {
            locations = new ArrayList<ResourceReference>();
        }
        return this.locations;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PractitionerQualification }
     * 
     * 
     */
    public List<PractitionerQualification> getQualifications() {
        if (qualifications == null) {
            qualifications = new ArrayList<PractitionerQualification>();
        }
        return this.qualifications;
    }

    /**
     * Gets the value of the communications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCommunications() {
        if (communications == null) {
            communications = new ArrayList<CodeableConcept>();
        }
        return this.communications;
    }

    public Practitioner withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public Practitioner withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public Practitioner withName(HumanName value) {
        setName(value);
        return this;
    }

    public Practitioner withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public Practitioner withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public Practitioner withAddress(Address value) {
        setAddress(value);
        return this;
    }

    public Practitioner withGender(CodeableConcept value) {
        setGender(value);
        return this;
    }

    public Practitioner withBirthDate(DateTime value) {
        setBirthDate(value);
        return this;
    }

    public Practitioner withPhotos(Attachment... values) {
        if (values!= null) {
            for (Attachment value: values) {
                getPhotos().add(value);
            }
        }
        return this;
    }

    public Practitioner withPhotos(Collection<Attachment> values) {
        if (values!= null) {
            getPhotos().addAll(values);
        }
        return this;
    }

    public Practitioner withOrganization(ResourceReference value) {
        setOrganization(value);
        return this;
    }

    public Practitioner withRoles(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getRoles().add(value);
            }
        }
        return this;
    }

    public Practitioner withRoles(Collection<CodeableConcept> values) {
        if (values!= null) {
            getRoles().addAll(values);
        }
        return this;
    }

    public Practitioner withSpecialties(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getSpecialties().add(value);
            }
        }
        return this;
    }

    public Practitioner withSpecialties(Collection<CodeableConcept> values) {
        if (values!= null) {
            getSpecialties().addAll(values);
        }
        return this;
    }

    public Practitioner withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    public Practitioner withLocations(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getLocations().add(value);
            }
        }
        return this;
    }

    public Practitioner withLocations(Collection<ResourceReference> values) {
        if (values!= null) {
            getLocations().addAll(values);
        }
        return this;
    }

    public Practitioner withQualifications(PractitionerQualification... values) {
        if (values!= null) {
            for (PractitionerQualification value: values) {
                getQualifications().add(value);
            }
        }
        return this;
    }

    public Practitioner withQualifications(Collection<PractitionerQualification> values) {
        if (values!= null) {
            getQualifications().addAll(values);
        }
        return this;
    }

    public Practitioner withCommunications(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getCommunications().add(value);
            }
        }
        return this;
    }

    public Practitioner withCommunications(Collection<CodeableConcept> values) {
        if (values!= null) {
            getCommunications().addAll(values);
        }
        return this;
    }

    @Override
    public Practitioner withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Practitioner withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Practitioner withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Practitioner withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Practitioner withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Practitioner withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Practitioner withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Practitioner withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Practitioner withId(java.lang.String value) {
        setId(value);
        return this;
    }

}