//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 01:43:53 PM MST 
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
 * <p>Java class for ValueSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ValueSetStatus"/&gt;
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="extensible" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="define" type="{http://hl7.org/fhir}ValueSet.Define" minOccurs="0"/&gt;
 *         &lt;element name="compose" type="{http://hl7.org/fhir}ValueSet.Compose" minOccurs="0"/&gt;
 *         &lt;element name="expansion" type="{http://hl7.org/fhir}ValueSet.Expansion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecoms",
    "description",
    "copyright",
    "status",
    "experimental",
    "extensible",
    "date",
    "define",
    "compose",
    "expansion"
})
@XmlRootElement(name = "ValueSet")
public class ValueSet
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
    @XmlElement(required = true)
    protected edu.asu.bmi.cda.fhir.String description;
    protected edu.asu.bmi.cda.fhir.String copyright;
    @XmlElement(required = true)
    protected ValueSetStatus status;
    protected Boolean experimental;
    protected Boolean extensible;
    protected DateTime date;
    protected ValueSetDefine define;
    protected ValueSetCompose compose;
    protected ValueSetExpansion expansion;

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
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setCopyright(edu.asu.bmi.cda.fhir.String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetStatus }
     *     
     */
    public ValueSetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetStatus }
     *     
     */
    public void setStatus(ValueSetStatus value) {
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
     * Gets the value of the extensible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtensible() {
        return extensible;
    }

    /**
     * Sets the value of the extensible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtensible(Boolean value) {
        this.extensible = value;
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
     * Gets the value of the define property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetDefine }
     *     
     */
    public ValueSetDefine getDefine() {
        return define;
    }

    /**
     * Sets the value of the define property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetDefine }
     *     
     */
    public void setDefine(ValueSetDefine value) {
        this.define = value;
    }

    /**
     * Gets the value of the compose property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetCompose }
     *     
     */
    public ValueSetCompose getCompose() {
        return compose;
    }

    /**
     * Sets the value of the compose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetCompose }
     *     
     */
    public void setCompose(ValueSetCompose value) {
        this.compose = value;
    }

    /**
     * Gets the value of the expansion property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetExpansion }
     *     
     */
    public ValueSetExpansion getExpansion() {
        return expansion;
    }

    /**
     * Sets the value of the expansion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetExpansion }
     *     
     */
    public void setExpansion(ValueSetExpansion value) {
        this.expansion = value;
    }

    public ValueSet withIdentifier(edu.asu.bmi.cda.fhir.String value) {
        setIdentifier(value);
        return this;
    }

    public ValueSet withVersion(edu.asu.bmi.cda.fhir.String value) {
        setVersion(value);
        return this;
    }

    public ValueSet withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public ValueSet withPublisher(edu.asu.bmi.cda.fhir.String value) {
        setPublisher(value);
        return this;
    }

    public ValueSet withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public ValueSet withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public ValueSet withDescription(edu.asu.bmi.cda.fhir.String value) {
        setDescription(value);
        return this;
    }

    public ValueSet withCopyright(edu.asu.bmi.cda.fhir.String value) {
        setCopyright(value);
        return this;
    }

    public ValueSet withStatus(ValueSetStatus value) {
        setStatus(value);
        return this;
    }

    public ValueSet withExperimental(Boolean value) {
        setExperimental(value);
        return this;
    }

    public ValueSet withExtensible(Boolean value) {
        setExtensible(value);
        return this;
    }

    public ValueSet withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public ValueSet withDefine(ValueSetDefine value) {
        setDefine(value);
        return this;
    }

    public ValueSet withCompose(ValueSetCompose value) {
        setCompose(value);
        return this;
    }

    public ValueSet withExpansion(ValueSetExpansion value) {
        setExpansion(value);
        return this;
    }

    @Override
    public ValueSet withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public ValueSet withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public ValueSet withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSet withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSet withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSet withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSet withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSet withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSet withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
