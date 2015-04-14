//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
//


package edu.asu.bmi.cda.fhir;

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
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ResourceProfileStatus"/&gt;
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}id" minOccurs="0"/&gt;
 *         &lt;element name="mapping" type="{http://hl7.org/fhir}Profile.Mapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="structure" type="{http://hl7.org/fhir}Profile.Structure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extensionDefn" type="{http://hl7.org/fhir}Profile.ExtensionDefn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="query" type="{http://hl7.org/fhir}Profile.Query" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecoms",
    "description",
    "codes",
    "status",
    "experimental",
    "date",
    "requirements",
    "fhirVersion",
    "mappings",
    "structures",
    "extensionDefns",
    "queries"
})
@XmlRootElement(name = "Profile")
public class Profile
    extends Resource
    implements Serializable
{

    protected edu.asu.bmi.cda.fhir.String identifier;
    protected edu.asu.bmi.cda.fhir.String version;
    @XmlElement(required = true)
    protected edu.asu.bmi.cda.fhir.String name;
    protected edu.asu.bmi.cda.fhir.String publisher;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected edu.asu.bmi.cda.fhir.String description;
    @XmlElement(name = "code")
    protected List<Coding> codes;
    @XmlElement(required = true)
    protected ResourceProfileStatus status;
    protected Boolean experimental;
    protected DateTime date;
    protected edu.asu.bmi.cda.fhir.String requirements;
    protected Id fhirVersion;
    @XmlElement(name = "mapping")
    protected List<ProfileMapping> mappings;
    @XmlElement(name = "structure")
    protected List<ProfileStructure> structures;
    @XmlElement(name = "extensionDefn")
    protected List<ProfileExtensionDefn> extensionDefns;
    @XmlElement(name = "query")
    protected List<ProfileQuery> queries;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setIdentifier(edu.asu.bmi.cda.fhir.String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setVersion(edu.asu.bmi.cda.fhir.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setName(edu.asu.bmi.cda.fhir.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setPublisher(edu.asu.bmi.cda.fhir.String value) {
        this.publisher = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setDescription(edu.asu.bmi.cda.fhir.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getCodes() {
        if (codes == null) {
            codes = new ArrayList<Coding>();
        }
        return this.codes;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceProfileStatus }
     *     
     */
    public ResourceProfileStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceProfileStatus }
     *     
     */
    public void setStatus(ResourceProfileStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setRequirements(edu.asu.bmi.cda.fhir.String value) {
        this.requirements = value;
    }

    /**
     * Gets the value of the fhirVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getFhirVersion() {
        return fhirVersion;
    }

    /**
     * Sets the value of the fhirVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setFhirVersion(Id value) {
        this.fhirVersion = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileMapping }
     * 
     * 
     */
    public List<ProfileMapping> getMappings() {
        if (mappings == null) {
            mappings = new ArrayList<ProfileMapping>();
        }
        return this.mappings;
    }

    /**
     * Gets the value of the structures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileStructure }
     * 
     * 
     */
    public List<ProfileStructure> getStructures() {
        if (structures == null) {
            structures = new ArrayList<ProfileStructure>();
        }
        return this.structures;
    }

    /**
     * Gets the value of the extensionDefns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionDefns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionDefns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileExtensionDefn }
     * 
     * 
     */
    public List<ProfileExtensionDefn> getExtensionDefns() {
        if (extensionDefns == null) {
            extensionDefns = new ArrayList<ProfileExtensionDefn>();
        }
        return this.extensionDefns;
    }

    /**
     * Gets the value of the queries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileQuery }
     * 
     * 
     */
    public List<ProfileQuery> getQueries() {
        if (queries == null) {
            queries = new ArrayList<ProfileQuery>();
        }
        return this.queries;
    }

    public Profile withIdentifier(edu.asu.bmi.cda.fhir.String value) {
        setIdentifier(value);
        return this;
    }

    public Profile withVersion(edu.asu.bmi.cda.fhir.String value) {
        setVersion(value);
        return this;
    }

    public Profile withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public Profile withPublisher(edu.asu.bmi.cda.fhir.String value) {
        setPublisher(value);
        return this;
    }

    public Profile withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public Profile withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public Profile withDescription(edu.asu.bmi.cda.fhir.String value) {
        setDescription(value);
        return this;
    }

    public Profile withCodes(Coding... values) {
        if (values!= null) {
            for (Coding value: values) {
                getCodes().add(value);
            }
        }
        return this;
    }

    public Profile withCodes(Collection<Coding> values) {
        if (values!= null) {
            getCodes().addAll(values);
        }
        return this;
    }

    public Profile withStatus(ResourceProfileStatus value) {
        setStatus(value);
        return this;
    }

    public Profile withExperimental(Boolean value) {
        setExperimental(value);
        return this;
    }

    public Profile withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public Profile withRequirements(edu.asu.bmi.cda.fhir.String value) {
        setRequirements(value);
        return this;
    }

    public Profile withFhirVersion(Id value) {
        setFhirVersion(value);
        return this;
    }

    public Profile withMappings(ProfileMapping... values) {
        if (values!= null) {
            for (ProfileMapping value: values) {
                getMappings().add(value);
            }
        }
        return this;
    }

    public Profile withMappings(Collection<ProfileMapping> values) {
        if (values!= null) {
            getMappings().addAll(values);
        }
        return this;
    }

    public Profile withStructures(ProfileStructure... values) {
        if (values!= null) {
            for (ProfileStructure value: values) {
                getStructures().add(value);
            }
        }
        return this;
    }

    public Profile withStructures(Collection<ProfileStructure> values) {
        if (values!= null) {
            getStructures().addAll(values);
        }
        return this;
    }

    public Profile withExtensionDefns(ProfileExtensionDefn... values) {
        if (values!= null) {
            for (ProfileExtensionDefn value: values) {
                getExtensionDefns().add(value);
            }
        }
        return this;
    }

    public Profile withExtensionDefns(Collection<ProfileExtensionDefn> values) {
        if (values!= null) {
            getExtensionDefns().addAll(values);
        }
        return this;
    }

    public Profile withQueries(ProfileQuery... values) {
        if (values!= null) {
            for (ProfileQuery value: values) {
                getQueries().add(value);
            }
        }
        return this;
    }

    public Profile withQueries(Collection<ProfileQuery> values) {
        if (values!= null) {
            getQueries().addAll(values);
        }
        return this;
    }

    @Override
    public Profile withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Profile withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Profile withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Profile withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Profile withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Profile withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Profile withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Profile withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Profile withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
