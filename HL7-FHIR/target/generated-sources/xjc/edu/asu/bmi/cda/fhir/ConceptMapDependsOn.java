//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 01:43:53 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A statement of relationships from one set of concepts to one or more other concept systems.
 * 
 * <p>Java class for ConceptMap.DependsOn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap.DependsOn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concept" type="{http://hl7.org/fhir}uri"/&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.DependsOn", propOrder = {
    "concept",
    "system",
    "code"
})
public class ConceptMapDependsOn
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Uri concept;
    @XmlElement(required = true)
    protected Uri system;
    @XmlElement(required = true)
    protected Code code;

    /**
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setConcept(Uri value) {
        this.concept = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSystem(Uri value) {
        this.system = value;
    }

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

    public ConceptMapDependsOn withConcept(Uri value) {
        setConcept(value);
        return this;
    }

    public ConceptMapDependsOn withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    public ConceptMapDependsOn withCode(Code value) {
        setCode(value);
        return this;
    }

    @Override
    public ConceptMapDependsOn withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMapDependsOn withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMapDependsOn withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMapDependsOn withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMapDependsOn withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
