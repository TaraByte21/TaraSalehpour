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
 * A request for a diagnostic investigation service to be performed.
 * 
 * <p>Java class for DiagnosticOrder.Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticOrder.Event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}DiagnosticOrderStatus"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *         &lt;element name="actor" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticOrder.Event", propOrder = {
    "status",
    "description",
    "dateTime",
    "actor"
})
public class DiagnosticOrderEvent
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected DiagnosticOrderStatus status;
    protected CodeableConcept description;
    @XmlElement(required = true)
    protected DateTime dateTime;
    protected ResourceReference actor;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticOrderStatus }
     *     
     */
    public DiagnosticOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticOrderStatus }
     *     
     */
    public void setStatus(DiagnosticOrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDescription(CodeableConcept value) {
        this.description = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateTime(DateTime value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setActor(ResourceReference value) {
        this.actor = value;
    }

    public DiagnosticOrderEvent withStatus(DiagnosticOrderStatus value) {
        setStatus(value);
        return this;
    }

    public DiagnosticOrderEvent withDescription(CodeableConcept value) {
        setDescription(value);
        return this;
    }

    public DiagnosticOrderEvent withDateTime(DateTime value) {
        setDateTime(value);
        return this;
    }

    public DiagnosticOrderEvent withActor(ResourceReference value) {
        setActor(value);
        return this;
    }

    @Override
    public DiagnosticOrderEvent withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticOrderEvent withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticOrderEvent withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticOrderEvent withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticOrderEvent withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
