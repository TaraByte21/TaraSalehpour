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
 * A reference to a document.
 * 
 * <p>Java class for DocumentReference.Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentReference.Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="address" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}DocumentReference.Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference.Service", propOrder = {
    "type",
    "address",
    "parameters"
})
public class DocumentReferenceService
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected edu.asu.bmi.cad.fhir_model_noDB.String address;
    @XmlElement(name = "parameter")
    protected List<DocumentReferenceParameter> parameters;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public edu.asu.bmi.cad.fhir_model_noDB.String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public void setAddress(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        this.address = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceParameter }
     * 
     * 
     */
    public List<DocumentReferenceParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<DocumentReferenceParameter>();
        }
        return this.parameters;
    }

    public DocumentReferenceService withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public DocumentReferenceService withAddress(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        setAddress(value);
        return this;
    }

    public DocumentReferenceService withParameters(DocumentReferenceParameter... values) {
        if (values!= null) {
            for (DocumentReferenceParameter value: values) {
                getParameters().add(value);
            }
        }
        return this;
    }

    public DocumentReferenceService withParameters(Collection<DocumentReferenceParameter> values) {
        if (values!= null) {
            getParameters().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentReferenceService withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentReferenceService withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentReferenceService withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentReferenceService withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentReferenceService withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
