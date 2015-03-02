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
 * <p>Java class for Conformance.Security complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Security"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cors" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="service" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="certificate" type="{http://hl7.org/fhir}Conformance.Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Security", propOrder = {
    "cors",
    "services",
    "description",
    "certificates"
})
public class ConformanceSecurity
    extends BackboneElement
    implements Serializable
{

    protected Boolean cors;
    @XmlElement(name = "service")
    protected List<CodeableConcept> services;
    protected edu.asu.bmi.cad.fhir_model_noDB.String description;
    @XmlElement(name = "certificate")
    protected List<ConformanceCertificate> certificates;

    /**
     * Gets the value of the cors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCors() {
        return cors;
    }

    /**
     * Sets the value of the cors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCors(Boolean value) {
        this.cors = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getServices() {
        if (services == null) {
            services = new ArrayList<CodeableConcept>();
        }
        return this.services;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public edu.asu.bmi.cad.fhir_model_noDB.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public void setDescription(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceCertificate }
     * 
     * 
     */
    public List<ConformanceCertificate> getCertificates() {
        if (certificates == null) {
            certificates = new ArrayList<ConformanceCertificate>();
        }
        return this.certificates;
    }

    public ConformanceSecurity withCors(Boolean value) {
        setCors(value);
        return this;
    }

    public ConformanceSecurity withServices(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getServices().add(value);
            }
        }
        return this;
    }

    public ConformanceSecurity withServices(Collection<CodeableConcept> values) {
        if (values!= null) {
            getServices().addAll(values);
        }
        return this;
    }

    public ConformanceSecurity withDescription(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        setDescription(value);
        return this;
    }

    public ConformanceSecurity withCertificates(ConformanceCertificate... values) {
        if (values!= null) {
            for (ConformanceCertificate value: values) {
                getCertificates().add(value);
            }
        }
        return this;
    }

    public ConformanceSecurity withCertificates(Collection<ConformanceCertificate> values) {
        if (values!= null) {
            getCertificates().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceSecurity withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceSecurity withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceSecurity withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceSecurity withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceSecurity withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
