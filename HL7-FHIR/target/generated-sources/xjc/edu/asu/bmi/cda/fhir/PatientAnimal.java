//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:21:42 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Demographics and other administrative information about a person or animal receiving care or other health-related services.
 * 
 * <p>Java class for Patient.Animal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient.Animal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="species" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="breed" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="genderStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient.Animal", propOrder = {
    "species",
    "breed",
    "genderStatus"
})
public class PatientAnimal
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected CodeableConcept species;
    protected CodeableConcept breed;
    protected CodeableConcept genderStatus;

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSpecies(CodeableConcept value) {
        this.species = value;
    }

    /**
     * Gets the value of the breed property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBreed() {
        return breed;
    }

    /**
     * Sets the value of the breed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBreed(CodeableConcept value) {
        this.breed = value;
    }

    /**
     * Gets the value of the genderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getGenderStatus() {
        return genderStatus;
    }

    /**
     * Sets the value of the genderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setGenderStatus(CodeableConcept value) {
        this.genderStatus = value;
    }

    public PatientAnimal withSpecies(CodeableConcept value) {
        setSpecies(value);
        return this;
    }

    public PatientAnimal withBreed(CodeableConcept value) {
        setBreed(value);
        return this;
    }

    public PatientAnimal withGenderStatus(CodeableConcept value) {
        setGenderStatus(value);
        return this;
    }

    @Override
    public PatientAnimal withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public PatientAnimal withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public PatientAnimal withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public PatientAnimal withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public PatientAnimal withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
