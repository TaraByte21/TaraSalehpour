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
 * <p>Java class for Patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="deceasedBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="deceasedDateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="multipleBirthBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="multipleBirthInteger" type="{http://hl7.org/fhir}integer"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="photo" type="{http://hl7.org/fhir}Attachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://hl7.org/fhir}Patient.Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animal" type="{http://hl7.org/fhir}Patient.Animal" minOccurs="0"/&gt;
 *         &lt;element name="communication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="careProvider" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="managingOrganization" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="link" type="{http://hl7.org/fhir}Patient.Link" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="active" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "identifiers",
    "names",
    "telecoms",
    "gender",
    "birthDate",
    "deceasedDateTime",
    "deceasedBoolean",
    "addresses",
    "maritalStatus",
    "multipleBirthInteger",
    "multipleBirthBoolean",
    "photos",
    "contacts",
    "animal",
    "communications",
    "careProviders",
    "managingOrganization",
    "links",
    "active"
})
@XmlRootElement(name = "Patient")
public class Patient
    extends Resource
    implements Serializable
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(name = "name")
    protected List<HumanName> names;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected CodeableConcept gender;
    protected DateTime birthDate;
    protected DateTime deceasedDateTime;
    protected Boolean deceasedBoolean;
    @XmlElement(name = "address")
    protected List<Address> addresses;
    protected CodeableConcept maritalStatus;
    protected Integer multipleBirthInteger;
    protected Boolean multipleBirthBoolean;
    @XmlElement(name = "photo")
    protected List<Attachment> photos;
    @XmlElement(name = "contact")
    protected List<PatientContact> contacts;
    protected PatientAnimal animal;
    @XmlElement(name = "communication")
    protected List<CodeableConcept> communications;
    @XmlElement(name = "careProvider")
    protected List<ResourceReference> careProviders;
    protected ResourceReference managingOrganization;
    @XmlElement(name = "link")
    protected List<PatientLink> links;
    protected Boolean active;

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
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HumanName }
     * 
     * 
     */
    public List<HumanName> getNames() {
        if (names == null) {
            names = new ArrayList<HumanName>();
        }
        return this.names;
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
     * Gets the value of the deceasedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDeceasedDateTime() {
        return deceasedDateTime;
    }

    /**
     * Sets the value of the deceasedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDeceasedDateTime(DateTime value) {
        this.deceasedDateTime = value;
    }

    /**
     * Gets the value of the deceasedBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    /**
     * Sets the value of the deceasedBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedBoolean(Boolean value) {
        this.deceasedBoolean = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMaritalStatus(CodeableConcept value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the multipleBirthInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultipleBirthInteger() {
        return multipleBirthInteger;
    }

    /**
     * Sets the value of the multipleBirthInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultipleBirthInteger(Integer value) {
        this.multipleBirthInteger = value;
    }

    /**
     * Gets the value of the multipleBirthBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMultipleBirthBoolean() {
        return multipleBirthBoolean;
    }

    /**
     * Sets the value of the multipleBirthBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleBirthBoolean(Boolean value) {
        this.multipleBirthBoolean = value;
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
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientContact }
     * 
     * 
     */
    public List<PatientContact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<PatientContact>();
        }
        return this.contacts;
    }

    /**
     * Gets the value of the animal property.
     * 
     * @return
     *     possible object is
     *     {@link PatientAnimal }
     *     
     */
    public PatientAnimal getAnimal() {
        return animal;
    }

    /**
     * Sets the value of the animal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientAnimal }
     *     
     */
    public void setAnimal(PatientAnimal value) {
        this.animal = value;
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

    /**
     * Gets the value of the careProviders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careProviders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareProviders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getCareProviders() {
        if (careProviders == null) {
            careProviders = new ArrayList<ResourceReference>();
        }
        return this.careProviders;
    }

    /**
     * Gets the value of the managingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * Sets the value of the managingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setManagingOrganization(ResourceReference value) {
        this.managingOrganization = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientLink }
     * 
     * 
     */
    public List<PatientLink> getLinks() {
        if (links == null) {
            links = new ArrayList<PatientLink>();
        }
        return this.links;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    public Patient withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public Patient withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public Patient withNames(HumanName... values) {
        if (values!= null) {
            for (HumanName value: values) {
                getNames().add(value);
            }
        }
        return this;
    }

    public Patient withNames(Collection<HumanName> values) {
        if (values!= null) {
            getNames().addAll(values);
        }
        return this;
    }

    public Patient withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public Patient withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public Patient withGender(CodeableConcept value) {
        setGender(value);
        return this;
    }

    public Patient withBirthDate(DateTime value) {
        setBirthDate(value);
        return this;
    }

    public Patient withDeceasedDateTime(DateTime value) {
        setDeceasedDateTime(value);
        return this;
    }

    public Patient withDeceasedBoolean(Boolean value) {
        setDeceasedBoolean(value);
        return this;
    }

    public Patient withAddresses(Address... values) {
        if (values!= null) {
            for (Address value: values) {
                getAddresses().add(value);
            }
        }
        return this;
    }

    public Patient withAddresses(Collection<Address> values) {
        if (values!= null) {
            getAddresses().addAll(values);
        }
        return this;
    }

    public Patient withMaritalStatus(CodeableConcept value) {
        setMaritalStatus(value);
        return this;
    }

    public Patient withMultipleBirthInteger(Integer value) {
        setMultipleBirthInteger(value);
        return this;
    }

    public Patient withMultipleBirthBoolean(Boolean value) {
        setMultipleBirthBoolean(value);
        return this;
    }

    public Patient withPhotos(Attachment... values) {
        if (values!= null) {
            for (Attachment value: values) {
                getPhotos().add(value);
            }
        }
        return this;
    }

    public Patient withPhotos(Collection<Attachment> values) {
        if (values!= null) {
            getPhotos().addAll(values);
        }
        return this;
    }

    public Patient withContacts(PatientContact... values) {
        if (values!= null) {
            for (PatientContact value: values) {
                getContacts().add(value);
            }
        }
        return this;
    }

    public Patient withContacts(Collection<PatientContact> values) {
        if (values!= null) {
            getContacts().addAll(values);
        }
        return this;
    }

    public Patient withAnimal(PatientAnimal value) {
        setAnimal(value);
        return this;
    }

    public Patient withCommunications(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getCommunications().add(value);
            }
        }
        return this;
    }

    public Patient withCommunications(Collection<CodeableConcept> values) {
        if (values!= null) {
            getCommunications().addAll(values);
        }
        return this;
    }

    public Patient withCareProviders(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getCareProviders().add(value);
            }
        }
        return this;
    }

    public Patient withCareProviders(Collection<ResourceReference> values) {
        if (values!= null) {
            getCareProviders().addAll(values);
        }
        return this;
    }

    public Patient withManagingOrganization(ResourceReference value) {
        setManagingOrganization(value);
        return this;
    }

    public Patient withLinks(PatientLink... values) {
        if (values!= null) {
            for (PatientLink value: values) {
                getLinks().add(value);
            }
        }
        return this;
    }

    public Patient withLinks(Collection<PatientLink> values) {
        if (values!= null) {
            getLinks().addAll(values);
        }
        return this;
    }

    public Patient withActive(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public Patient withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Patient withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Patient withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Patient withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Patient withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Patient withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Patient withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Patient withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Patient withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
