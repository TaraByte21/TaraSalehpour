//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/ProfileSearchParam.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/ProfileSearchParam.java
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
 * <p>Java class for Profile.SearchParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.SearchParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}SearchParamType"/&gt;
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="xpath" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://hl7.org/fhir}code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.SearchParam", propOrder = {
    "name",
    "type",
    "documentation",
    "xpath",
    "targets"
})
public class ProfileSearchParam
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected edu.asu.bmi.cda.fhir.String name;
    @XmlElement(required = true)
    protected SearchParamType type;
    @XmlElement(required = true)
    protected edu.asu.bmi.cda.fhir.String documentation;
    protected edu.asu.bmi.cda.fhir.String xpath;
    @XmlElement(name = "target")
    protected List<Code> targets;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchParamType }
     *     
     */
    public SearchParamType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParamType }
     *     
     */
    public void setType(SearchParamType value) {
        this.type = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setDocumentation(edu.asu.bmi.cda.fhir.String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setXpath(edu.asu.bmi.cda.fhir.String value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getTargets() {
        if (targets == null) {
            targets = new ArrayList<Code>();
        }
        return this.targets;
    }

    public ProfileSearchParam withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public ProfileSearchParam withType(SearchParamType value) {
        setType(value);
        return this;
    }

    public ProfileSearchParam withDocumentation(edu.asu.bmi.cda.fhir.String value) {
        setDocumentation(value);
        return this;
    }

    public ProfileSearchParam withXpath(edu.asu.bmi.cda.fhir.String value) {
        setXpath(value);
        return this;
    }

    public ProfileSearchParam withTargets(Code... values) {
        if (values!= null) {
            for (Code value: values) {
                getTargets().add(value);
            }
        }
        return this;
    }

    public ProfileSearchParam withTargets(Collection<Code> values) {
        if (values!= null) {
            getTargets().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileSearchParam withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileSearchParam withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileSearchParam withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileSearchParam withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileSearchParam withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
