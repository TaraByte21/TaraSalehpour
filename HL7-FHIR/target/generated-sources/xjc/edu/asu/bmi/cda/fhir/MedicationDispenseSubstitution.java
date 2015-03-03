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
 * Dispensing a medication to a named patient.  This includes a description of the supply provided and the instructions for administering the medication.
 * 
 * <p>Java class for MedicationDispense.Substitution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense.Substitution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responsibleParty" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.Substitution", propOrder = {
    "type",
    "reasons",
    "responsibleParties"
})
public class MedicationDispenseSubstitution
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "reason")
    protected List<CodeableConcept> reasons;
    @XmlElement(name = "responsibleParty")
    protected List<ResourceReference> responsibleParties;

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
     * Gets the value of the reasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasons() {
        if (reasons == null) {
            reasons = new ArrayList<CodeableConcept>();
        }
        return this.reasons;
    }

    /**
     * Gets the value of the responsibleParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getResponsibleParties() {
        if (responsibleParties == null) {
            responsibleParties = new ArrayList<ResourceReference>();
        }
        return this.responsibleParties;
    }

    public MedicationDispenseSubstitution withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public MedicationDispenseSubstitution withReasons(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getReasons().add(value);
            }
        }
        return this;
    }

    public MedicationDispenseSubstitution withReasons(Collection<CodeableConcept> values) {
        if (values!= null) {
            getReasons().addAll(values);
        }
        return this;
    }

    public MedicationDispenseSubstitution withResponsibleParties(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getResponsibleParties().add(value);
            }
        }
        return this;
    }

    public MedicationDispenseSubstitution withResponsibleParties(Collection<ResourceReference> values) {
        if (values!= null) {
            getResponsibleParties().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
