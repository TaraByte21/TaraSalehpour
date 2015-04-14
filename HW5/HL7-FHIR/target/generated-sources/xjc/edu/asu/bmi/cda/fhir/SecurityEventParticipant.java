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
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for SecurityEvent.Participant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent.Participant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="altId" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="requestor" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="media" type="{http://hl7.org/fhir}Coding" minOccurs="0"/&gt;
 *         &lt;element name="network" type="{http://hl7.org/fhir}SecurityEvent.Network" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent.Participant", propOrder = {
    "roles",
    "reference",
    "userId",
    "altId",
    "name",
    "requestor",
    "media",
    "network"
})
public class SecurityEventParticipant
    extends BackboneElement
    implements Serializable
{

    @XmlElement(name = "role")
    protected List<CodeableConcept> roles;
    protected ResourceReference reference;
    protected edu.asu.bmi.cda.fhir.String userId;
    protected edu.asu.bmi.cda.fhir.String altId;
    protected edu.asu.bmi.cda.fhir.String name;
    @XmlElement(required = true)
    protected Boolean requestor;
    protected Coding media;
    protected SecurityEventNetwork network;

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getRoles() {
        if (roles == null) {
            roles = new ArrayList<CodeableConcept>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReference(ResourceReference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setUserId(edu.asu.bmi.cda.fhir.String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the altId property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getAltId() {
        return altId;
    }

    /**
     * Sets the value of the altId property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setAltId(edu.asu.bmi.cda.fhir.String value) {
        this.altId = value;
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
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestor(Boolean value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setMedia(Coding value) {
        this.media = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventNetwork }
     *     
     */
    public SecurityEventNetwork getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventNetwork }
     *     
     */
    public void setNetwork(SecurityEventNetwork value) {
        this.network = value;
    }

    public SecurityEventParticipant withRoles(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getRoles().add(value);
            }
        }
        return this;
    }

    public SecurityEventParticipant withRoles(Collection<CodeableConcept> values) {
        if (values!= null) {
            getRoles().addAll(values);
        }
        return this;
    }

    public SecurityEventParticipant withReference(ResourceReference value) {
        setReference(value);
        return this;
    }

    public SecurityEventParticipant withUserId(edu.asu.bmi.cda.fhir.String value) {
        setUserId(value);
        return this;
    }

    public SecurityEventParticipant withAltId(edu.asu.bmi.cda.fhir.String value) {
        setAltId(value);
        return this;
    }

    public SecurityEventParticipant withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public SecurityEventParticipant withRequestor(Boolean value) {
        setRequestor(value);
        return this;
    }

    public SecurityEventParticipant withMedia(Coding value) {
        setMedia(value);
        return this;
    }

    public SecurityEventParticipant withNetwork(SecurityEventNetwork value) {
        setNetwork(value);
        return this;
    }

    @Override
    public SecurityEventParticipant withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEventParticipant withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventParticipant withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEventParticipant withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventParticipant withId(java.lang.String value) {
        setId(value);
        return this;
    }

}