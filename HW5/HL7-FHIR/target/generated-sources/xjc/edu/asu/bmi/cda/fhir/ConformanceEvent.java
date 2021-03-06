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
import javax.xml.bind.annotation.XmlType;


/**
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * 
 * <p>Java class for Conformance.Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding"/&gt;
 *         &lt;element name="category" type="{http://hl7.org/fhir}MessageSignificanceCategory" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://hl7.org/fhir}ConformanceEventMode"/&gt;
 *         &lt;element name="protocol" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="focus" type="{http://hl7.org/fhir}code"/&gt;
 *         &lt;element name="request" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="response" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Event", propOrder = {
    "code",
    "category",
    "mode",
    "protocols",
    "focus",
    "request",
    "response",
    "documentation"
})
public class ConformanceEvent
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Coding code;
    protected MessageSignificanceCategory category;
    @XmlElement(required = true)
    protected ConformanceEventMode mode;
    @XmlElement(name = "protocol")
    protected List<Coding> protocols;
    @XmlElement(required = true)
    protected Code focus;
    @XmlElement(required = true)
    protected ResourceReference request;
    @XmlElement(required = true)
    protected ResourceReference response;
    protected edu.asu.bmi.cda.fhir.String documentation;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setCode(Coding value) {
        this.code = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    public MessageSignificanceCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    public void setCategory(MessageSignificanceCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceEventMode }
     *     
     */
    public ConformanceEventMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceEventMode }
     *     
     */
    public void setMode(ConformanceEventMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the protocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getProtocols() {
        if (protocols == null) {
            protocols = new ArrayList<Coding>();
        }
        return this.protocols;
    }

    /**
     * Gets the value of the focus property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFocus(Code value) {
        this.focus = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setRequest(ResourceReference value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setResponse(ResourceReference value) {
        this.response = value;
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

    public ConformanceEvent withCode(Coding value) {
        setCode(value);
        return this;
    }

    public ConformanceEvent withCategory(MessageSignificanceCategory value) {
        setCategory(value);
        return this;
    }

    public ConformanceEvent withMode(ConformanceEventMode value) {
        setMode(value);
        return this;
    }

    public ConformanceEvent withProtocols(Coding... values) {
        if (values!= null) {
            for (Coding value: values) {
                getProtocols().add(value);
            }
        }
        return this;
    }

    public ConformanceEvent withProtocols(Collection<Coding> values) {
        if (values!= null) {
            getProtocols().addAll(values);
        }
        return this;
    }

    public ConformanceEvent withFocus(Code value) {
        setFocus(value);
        return this;
    }

    public ConformanceEvent withRequest(ResourceReference value) {
        setRequest(value);
        return this;
    }

    public ConformanceEvent withResponse(ResourceReference value) {
        setResponse(value);
        return this;
    }

    public ConformanceEvent withDocumentation(edu.asu.bmi.cda.fhir.String value) {
        setDocumentation(value);
        return this;
    }

    @Override
    public ConformanceEvent withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceEvent withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceEvent withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceEvent withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceEvent withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
