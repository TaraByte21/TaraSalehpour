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
import javax.xml.bind.annotation.XmlType;


/**
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * 
 * <p>Java class for Conformance.Messaging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Messaging"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endpoint" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="reliableCache" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://hl7.org/fhir}Conformance.Event" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Messaging", propOrder = {
    "endpoint",
    "reliableCache",
    "documentation",
    "events"
})
public class ConformanceMessaging
    extends BackboneElement
    implements Serializable
{

    protected Uri endpoint;
    protected Integer reliableCache;
    protected edu.asu.bmi.cad.fhir_model_noDB.String documentation;
    @XmlElement(name = "event", required = true)
    protected List<ConformanceEvent> events;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setEndpoint(Uri value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the reliableCache property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReliableCache() {
        return reliableCache;
    }

    /**
     * Sets the value of the reliableCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReliableCache(Integer value) {
        this.reliableCache = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public edu.asu.bmi.cad.fhir_model_noDB.String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public void setDocumentation(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceEvent }
     * 
     * 
     */
    public List<ConformanceEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<ConformanceEvent>();
        }
        return this.events;
    }

    public ConformanceMessaging withEndpoint(Uri value) {
        setEndpoint(value);
        return this;
    }

    public ConformanceMessaging withReliableCache(Integer value) {
        setReliableCache(value);
        return this;
    }

    public ConformanceMessaging withDocumentation(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        setDocumentation(value);
        return this;
    }

    public ConformanceMessaging withEvents(ConformanceEvent... values) {
        if (values!= null) {
            for (ConformanceEvent value: values) {
                getEvents().add(value);
            }
        }
        return this;
    }

    public ConformanceMessaging withEvents(Collection<ConformanceEvent> values) {
        if (values!= null) {
            getEvents().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceMessaging withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceMessaging withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceMessaging withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceMessaging withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceMessaging withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
