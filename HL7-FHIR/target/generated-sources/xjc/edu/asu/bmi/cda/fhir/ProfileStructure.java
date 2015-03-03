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
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Structure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}code"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="publish" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="element" type="{http://hl7.org/fhir}Profile.Element" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="searchParam" type="{http://hl7.org/fhir}Profile.SearchParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Structure", propOrder = {
    "type",
    "name",
    "publish",
    "purpose",
    "elements",
    "searchParams"
})
public class ProfileStructure
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Code type;
    protected edu.asu.bmi.cda.fhir.String name;
    protected Boolean publish;
    protected edu.asu.bmi.cda.fhir.String purpose;
    @XmlElement(name = "element")
    protected List<ProfileElement> elements;
    @XmlElement(name = "searchParam")
    protected List<ProfileSearchParam> searchParams;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setType(Code value) {
        this.type = value;
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
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublish(Boolean value) {
        this.publish = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setPurpose(edu.asu.bmi.cda.fhir.String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileElement }
     * 
     * 
     */
    public List<ProfileElement> getElements() {
        if (elements == null) {
            elements = new ArrayList<ProfileElement>();
        }
        return this.elements;
    }

    /**
     * Gets the value of the searchParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileSearchParam }
     * 
     * 
     */
    public List<ProfileSearchParam> getSearchParams() {
        if (searchParams == null) {
            searchParams = new ArrayList<ProfileSearchParam>();
        }
        return this.searchParams;
    }

    public ProfileStructure withType(Code value) {
        setType(value);
        return this;
    }

    public ProfileStructure withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public ProfileStructure withPublish(Boolean value) {
        setPublish(value);
        return this;
    }

    public ProfileStructure withPurpose(edu.asu.bmi.cda.fhir.String value) {
        setPurpose(value);
        return this;
    }

    public ProfileStructure withElements(ProfileElement... values) {
        if (values!= null) {
            for (ProfileElement value: values) {
                getElements().add(value);
            }
        }
        return this;
    }

    public ProfileStructure withElements(Collection<ProfileElement> values) {
        if (values!= null) {
            getElements().addAll(values);
        }
        return this;
    }

    public ProfileStructure withSearchParams(ProfileSearchParam... values) {
        if (values!= null) {
            for (ProfileSearchParam value: values) {
                getSearchParams().add(value);
            }
        }
        return this;
    }

    public ProfileStructure withSearchParams(Collection<ProfileSearchParam> values) {
        if (values!= null) {
            getSearchParams().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileStructure withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileStructure withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileStructure withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileStructure withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileStructure withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
