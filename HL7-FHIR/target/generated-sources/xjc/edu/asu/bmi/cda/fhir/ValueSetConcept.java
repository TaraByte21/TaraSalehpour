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
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Concept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Concept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code"/&gt;
 *         &lt;element name="abstract" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="display" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="concept" type="{http://hl7.org/fhir}ValueSet.Concept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Concept", propOrder = {
    "code",
    "_abstract",
    "display",
    "definition",
    "concepts"
})
public class ValueSetConcept
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Code code;
    @XmlElement(name = "abstract")
    protected Boolean _abstract;
    protected edu.asu.bmi.cda.fhir.String display;
    protected edu.asu.bmi.cda.fhir.String definition;
    @XmlElement(name = "concept")
    protected List<ValueSetConcept> concepts;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setDisplay(edu.asu.bmi.cda.fhir.String value) {
        this.display = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setDefinition(edu.asu.bmi.cda.fhir.String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the concepts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concepts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcepts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetConcept }
     * 
     * 
     */
    public List<ValueSetConcept> getConcepts() {
        if (concepts == null) {
            concepts = new ArrayList<ValueSetConcept>();
        }
        return this.concepts;
    }

    public ValueSetConcept withCode(Code value) {
        setCode(value);
        return this;
    }

    public ValueSetConcept withAbstract(Boolean value) {
        setAbstract(value);
        return this;
    }

    public ValueSetConcept withDisplay(edu.asu.bmi.cda.fhir.String value) {
        setDisplay(value);
        return this;
    }

    public ValueSetConcept withDefinition(edu.asu.bmi.cda.fhir.String value) {
        setDefinition(value);
        return this;
    }

    public ValueSetConcept withConcepts(ValueSetConcept... values) {
        if (values!= null) {
            for (ValueSetConcept value: values) {
                getConcepts().add(value);
            }
        }
        return this;
    }

    public ValueSetConcept withConcepts(Collection<ValueSetConcept> values) {
        if (values!= null) {
            getConcepts().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetConcept withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetConcept withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetConcept withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetConcept withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetConcept withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
