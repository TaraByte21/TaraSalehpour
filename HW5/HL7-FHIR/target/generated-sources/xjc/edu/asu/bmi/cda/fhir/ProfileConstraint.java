//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Constraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Constraint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://hl7.org/fhir}id"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="severity" type="{http://hl7.org/fhir}ConstraintSeverity"/&gt;
 *         &lt;element name="human" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="xpath" type="{http://hl7.org/fhir}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Constraint", propOrder = {
    "key",
    "name",
    "severity",
    "human",
    "xpath"
})
public class ProfileConstraint
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Id key;
    protected edu.asu.bmi.cda.fhir.String name;
    @XmlElement(required = true)
    protected ConstraintSeverity severity;
    @XmlElement(required = true)
    protected edu.asu.bmi.cda.fhir.String human;
    @XmlElement(required = true)
    protected edu.asu.bmi.cda.fhir.String xpath;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setKey(Id value) {
        this.key = value;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintSeverity }
     *     
     */
    public ConstraintSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintSeverity }
     *     
     */
    public void setSeverity(ConstraintSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the human property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getHuman() {
        return human;
    }

    /**
     * Sets the value of the human property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setHuman(edu.asu.bmi.cda.fhir.String value) {
        this.human = value;
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

    public ProfileConstraint withKey(Id value) {
        setKey(value);
        return this;
    }

    public ProfileConstraint withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public ProfileConstraint withSeverity(ConstraintSeverity value) {
        setSeverity(value);
        return this;
    }

    public ProfileConstraint withHuman(edu.asu.bmi.cda.fhir.String value) {
        setHuman(value);
        return this;
    }

    public ProfileConstraint withXpath(edu.asu.bmi.cda.fhir.String value) {
        setXpath(value);
        return this;
    }

    @Override
    public ProfileConstraint withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileConstraint withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileConstraint withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileConstraint withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileConstraint withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
