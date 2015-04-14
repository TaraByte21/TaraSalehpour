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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationPrescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationPrescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dateWritten" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationPrescriptionStatus" minOccurs="0"/&gt;
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="prescriber" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="reasonCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *           &lt;element name="reasonResource" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="medication" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="dosageInstruction" type="{http://hl7.org/fhir}MedicationPrescription.DosageInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dispense" type="{http://hl7.org/fhir}MedicationPrescription.Dispense" minOccurs="0"/&gt;
 *         &lt;element name="substitution" type="{http://hl7.org/fhir}MedicationPrescription.Substitution" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationPrescription", propOrder = {
    "identifiers",
    "dateWritten",
    "status",
    "patient",
    "prescriber",
    "encounter",
    "reasonResource",
    "reasonCodeableConcept",
    "medication",
    "dosageInstructions",
    "dispense",
    "substitution"
})
@XmlRootElement(name = "MedicationPrescription")
public class MedicationPrescription
    extends Resource
    implements Serializable
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    protected DateTime dateWritten;
    protected MedicationPrescriptionStatus status;
    protected ResourceReference patient;
    protected ResourceReference prescriber;
    protected ResourceReference encounter;
    protected ResourceReference reasonResource;
    protected CodeableConcept reasonCodeableConcept;
    protected ResourceReference medication;
    @XmlElement(name = "dosageInstruction")
    protected List<MedicationPrescriptionDosageInstruction> dosageInstructions;
    protected MedicationPrescriptionDispense dispense;
    protected MedicationPrescriptionSubstitution substitution;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the dateWritten property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateWritten() {
        return dateWritten;
    }

    /**
     * Sets the value of the dateWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateWritten(DateTime value) {
        this.dateWritten = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationPrescriptionStatus }
     *     
     */
    public MedicationPrescriptionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationPrescriptionStatus }
     *     
     */
    public void setStatus(MedicationPrescriptionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPatient(ResourceReference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the prescriber property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPrescriber(ResourceReference value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setEncounter(ResourceReference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the reasonResource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getReasonResource() {
        return reasonResource;
    }

    /**
     * Sets the value of the reasonResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReasonResource(ResourceReference value) {
        this.reasonResource = value;
    }

    /**
     * Gets the value of the reasonCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonCodeableConcept() {
        return reasonCodeableConcept;
    }

    /**
     * Sets the value of the reasonCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonCodeableConcept(CodeableConcept value) {
        this.reasonCodeableConcept = value;
    }

    /**
     * Gets the value of the medication property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getMedication() {
        return medication;
    }

    /**
     * Sets the value of the medication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setMedication(ResourceReference value) {
        this.medication = value;
    }

    /**
     * Gets the value of the dosageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationPrescriptionDosageInstruction }
     * 
     * 
     */
    public List<MedicationPrescriptionDosageInstruction> getDosageInstructions() {
        if (dosageInstructions == null) {
            dosageInstructions = new ArrayList<MedicationPrescriptionDosageInstruction>();
        }
        return this.dosageInstructions;
    }

    /**
     * Gets the value of the dispense property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationPrescriptionDispense }
     *     
     */
    public MedicationPrescriptionDispense getDispense() {
        return dispense;
    }

    /**
     * Sets the value of the dispense property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationPrescriptionDispense }
     *     
     */
    public void setDispense(MedicationPrescriptionDispense value) {
        this.dispense = value;
    }

    /**
     * Gets the value of the substitution property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationPrescriptionSubstitution }
     *     
     */
    public MedicationPrescriptionSubstitution getSubstitution() {
        return substitution;
    }

    /**
     * Sets the value of the substitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationPrescriptionSubstitution }
     *     
     */
    public void setSubstitution(MedicationPrescriptionSubstitution value) {
        this.substitution = value;
    }

    public MedicationPrescription withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public MedicationPrescription withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public MedicationPrescription withDateWritten(DateTime value) {
        setDateWritten(value);
        return this;
    }

    public MedicationPrescription withStatus(MedicationPrescriptionStatus value) {
        setStatus(value);
        return this;
    }

    public MedicationPrescription withPatient(ResourceReference value) {
        setPatient(value);
        return this;
    }

    public MedicationPrescription withPrescriber(ResourceReference value) {
        setPrescriber(value);
        return this;
    }

    public MedicationPrescription withEncounter(ResourceReference value) {
        setEncounter(value);
        return this;
    }

    public MedicationPrescription withReasonResource(ResourceReference value) {
        setReasonResource(value);
        return this;
    }

    public MedicationPrescription withReasonCodeableConcept(CodeableConcept value) {
        setReasonCodeableConcept(value);
        return this;
    }

    public MedicationPrescription withMedication(ResourceReference value) {
        setMedication(value);
        return this;
    }

    public MedicationPrescription withDosageInstructions(MedicationPrescriptionDosageInstruction... values) {
        if (values!= null) {
            for (MedicationPrescriptionDosageInstruction value: values) {
                getDosageInstructions().add(value);
            }
        }
        return this;
    }

    public MedicationPrescription withDosageInstructions(Collection<MedicationPrescriptionDosageInstruction> values) {
        if (values!= null) {
            getDosageInstructions().addAll(values);
        }
        return this;
    }

    public MedicationPrescription withDispense(MedicationPrescriptionDispense value) {
        setDispense(value);
        return this;
    }

    public MedicationPrescription withSubstitution(MedicationPrescriptionSubstitution value) {
        setSubstitution(value);
        return this;
    }

    @Override
    public MedicationPrescription withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MedicationPrescription withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public MedicationPrescription withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationPrescription withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationPrescription withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationPrescription withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationPrescription withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationPrescription withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationPrescription withId(java.lang.String value) {
        setId(value);
        return this;
    }

}