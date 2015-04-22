//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="wasNotGiven" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="reasonNotGiven" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="whenGiven" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="medication" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="device" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}MedicationStatement.Dosage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationStatement", propOrder = {
    "identifier",
    "patient",
    "wasNotGiven",
    "reasonNotGiven",
    "whenGiven",
    "medication",
    "device",
    "dosage"
})
@Entity(name = "MedicationStatement")
@Table(name = "MEDICATIONSTATEMENT")
public class MedicationStatement
    extends Resource
    implements Equals, HashCode
{

    protected List<Identifier> identifier;
    protected ResourceReference patient;
    protected Boolean wasNotGiven;
    protected List<CodeableConcept> reasonNotGiven;
    protected Period whenGiven;
    protected ResourceReference medication;
    protected List<ResourceReference> device;
    protected List<MedicationStatementDosage> dosage;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_MEDICATIONSTATEME_0")
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * 
     * 
     */
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PATIENT_MEDICATIONSTATEMENT__0")
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
     * Gets the value of the wasNotGiven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WASNOTGIVEN_MEDICATIONSTATEM_0")
    public Boolean getWasNotGiven() {
        return wasNotGiven;
    }

    /**
     * Sets the value of the wasNotGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasNotGiven(Boolean value) {
        this.wasNotGiven = value;
    }

    /**
     * Gets the value of the reasonNotGiven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonNotGiven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonNotGiven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REASONNOTGIVEN_MEDICATIONSTA_0")
    public List<CodeableConcept> getReasonNotGiven() {
        if (reasonNotGiven == null) {
            reasonNotGiven = new ArrayList<CodeableConcept>();
        }
        return this.reasonNotGiven;
    }

    /**
     * 
     * 
     */
    public void setReasonNotGiven(List<CodeableConcept> reasonNotGiven) {
        this.reasonNotGiven = reasonNotGiven;
    }

    /**
     * Gets the value of the whenGiven property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WHENGIVEN_MEDICATIONSTATEMEN_0")
    public Period getWhenGiven() {
        return whenGiven;
    }

    /**
     * Sets the value of the whenGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setWhenGiven(Period value) {
        this.whenGiven = value;
    }

    /**
     * Gets the value of the medication property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MEDICATION_MEDICATIONSTATEME_0")
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
     * Gets the value of the device property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DEVICE_MEDICATIONSTATEMENT_H_0")
    public List<ResourceReference> getDevice() {
        if (device == null) {
            device = new ArrayList<ResourceReference>();
        }
        return this.device;
    }

    /**
     * 
     * 
     */
    public void setDevice(List<ResourceReference> device) {
        this.device = device;
    }

    /**
     * Gets the value of the dosage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationStatementDosage }
     * 
     * 
     */
    @OneToMany(targetEntity = MedicationStatementDosage.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOSAGE_MEDICATIONSTATEMENT_H_0")
    public List<MedicationStatementDosage> getDosage() {
        if (dosage == null) {
            dosage = new ArrayList<MedicationStatementDosage>();
        }
        return this.dosage;
    }

    /**
     * 
     * 
     */
    public void setDosage(List<MedicationStatementDosage> dosage) {
        this.dosage = dosage;
    }

    public MedicationStatement withIdentifier(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifier().add(value);
            }
        }
        return this;
    }

    public MedicationStatement withIdentifier(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifier().addAll(values);
        }
        return this;
    }

    public MedicationStatement withIdentifier(List<Identifier> identifier) {
        setIdentifier(identifier);
        return this;
    }

    public MedicationStatement withPatient(ResourceReference value) {
        setPatient(value);
        return this;
    }

    public MedicationStatement withWasNotGiven(Boolean value) {
        setWasNotGiven(value);
        return this;
    }

    public MedicationStatement withReasonNotGiven(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getReasonNotGiven().add(value);
            }
        }
        return this;
    }

    public MedicationStatement withReasonNotGiven(Collection<CodeableConcept> values) {
        if (values!= null) {
            getReasonNotGiven().addAll(values);
        }
        return this;
    }

    public MedicationStatement withReasonNotGiven(List<CodeableConcept> reasonNotGiven) {
        setReasonNotGiven(reasonNotGiven);
        return this;
    }

    public MedicationStatement withWhenGiven(Period value) {
        setWhenGiven(value);
        return this;
    }

    public MedicationStatement withMedication(ResourceReference value) {
        setMedication(value);
        return this;
    }

    public MedicationStatement withDevice(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getDevice().add(value);
            }
        }
        return this;
    }

    public MedicationStatement withDevice(Collection<ResourceReference> values) {
        if (values!= null) {
            getDevice().addAll(values);
        }
        return this;
    }

    public MedicationStatement withDevice(List<ResourceReference> device) {
        setDevice(device);
        return this;
    }

    public MedicationStatement withDosage(MedicationStatementDosage... values) {
        if (values!= null) {
            for (MedicationStatementDosage value: values) {
                getDosage().add(value);
            }
        }
        return this;
    }

    public MedicationStatement withDosage(Collection<MedicationStatementDosage> values) {
        if (values!= null) {
            getDosage().addAll(values);
        }
        return this;
    }

    public MedicationStatement withDosage(List<MedicationStatementDosage> dosage) {
        setDosage(dosage);
        return this;
    }

    @Override
    public MedicationStatement withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MedicationStatement withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public MedicationStatement withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationStatement withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationStatement withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public MedicationStatement withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationStatement withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationStatement withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public MedicationStatement withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationStatement withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationStatement withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public MedicationStatement withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationStatement)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationStatement that = ((MedicationStatement) object);
        {
            List<Identifier> lhsIdentifier;
            lhsIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            List<Identifier> rhsIdentifier;
            rhsIdentifier = (((that.identifier!= null)&&(!that.identifier.isEmpty()))?that.getIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            ResourceReference lhsPatient;
            lhsPatient = this.getPatient();
            ResourceReference rhsPatient;
            rhsPatient = that.getPatient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "patient", lhsPatient), LocatorUtils.property(thatLocator, "patient", rhsPatient), lhsPatient, rhsPatient)) {
                return false;
            }
        }
        {
            Boolean lhsWasNotGiven;
            lhsWasNotGiven = this.getWasNotGiven();
            Boolean rhsWasNotGiven;
            rhsWasNotGiven = that.getWasNotGiven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wasNotGiven", lhsWasNotGiven), LocatorUtils.property(thatLocator, "wasNotGiven", rhsWasNotGiven), lhsWasNotGiven, rhsWasNotGiven)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsReasonNotGiven;
            lhsReasonNotGiven = (((this.reasonNotGiven!= null)&&(!this.reasonNotGiven.isEmpty()))?this.getReasonNotGiven():null);
            List<CodeableConcept> rhsReasonNotGiven;
            rhsReasonNotGiven = (((that.reasonNotGiven!= null)&&(!that.reasonNotGiven.isEmpty()))?that.getReasonNotGiven():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reasonNotGiven", lhsReasonNotGiven), LocatorUtils.property(thatLocator, "reasonNotGiven", rhsReasonNotGiven), lhsReasonNotGiven, rhsReasonNotGiven)) {
                return false;
            }
        }
        {
            Period lhsWhenGiven;
            lhsWhenGiven = this.getWhenGiven();
            Period rhsWhenGiven;
            rhsWhenGiven = that.getWhenGiven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whenGiven", lhsWhenGiven), LocatorUtils.property(thatLocator, "whenGiven", rhsWhenGiven), lhsWhenGiven, rhsWhenGiven)) {
                return false;
            }
        }
        {
            ResourceReference lhsMedication;
            lhsMedication = this.getMedication();
            ResourceReference rhsMedication;
            rhsMedication = that.getMedication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "medication", lhsMedication), LocatorUtils.property(thatLocator, "medication", rhsMedication), lhsMedication, rhsMedication)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsDevice;
            lhsDevice = (((this.device!= null)&&(!this.device.isEmpty()))?this.getDevice():null);
            List<ResourceReference> rhsDevice;
            rhsDevice = (((that.device!= null)&&(!that.device.isEmpty()))?that.getDevice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "device", lhsDevice), LocatorUtils.property(thatLocator, "device", rhsDevice), lhsDevice, rhsDevice)) {
                return false;
            }
        }
        {
            List<MedicationStatementDosage> lhsDosage;
            lhsDosage = (((this.dosage!= null)&&(!this.dosage.isEmpty()))?this.getDosage():null);
            List<MedicationStatementDosage> rhsDosage;
            rhsDosage = (((that.dosage!= null)&&(!that.dosage.isEmpty()))?that.getDosage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dosage", lhsDosage), LocatorUtils.property(thatLocator, "dosage", rhsDosage), lhsDosage, rhsDosage)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<Identifier> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "patient", thePatient), currentHashCode, thePatient);
        }
        {
            Boolean theWasNotGiven;
            theWasNotGiven = this.getWasNotGiven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wasNotGiven", theWasNotGiven), currentHashCode, theWasNotGiven);
        }
        {
            List<CodeableConcept> theReasonNotGiven;
            theReasonNotGiven = (((this.reasonNotGiven!= null)&&(!this.reasonNotGiven.isEmpty()))?this.getReasonNotGiven():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reasonNotGiven", theReasonNotGiven), currentHashCode, theReasonNotGiven);
        }
        {
            Period theWhenGiven;
            theWhenGiven = this.getWhenGiven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whenGiven", theWhenGiven), currentHashCode, theWhenGiven);
        }
        {
            ResourceReference theMedication;
            theMedication = this.getMedication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "medication", theMedication), currentHashCode, theMedication);
        }
        {
            List<ResourceReference> theDevice;
            theDevice = (((this.device!= null)&&(!this.device.isEmpty()))?this.getDevice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "device", theDevice), currentHashCode, theDevice);
        }
        {
            List<MedicationStatementDosage> theDosage;
            theDosage = (((this.dosage!= null)&&(!this.dosage.isEmpty()))?this.getDosage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dosage", theDosage), currentHashCode, theDosage);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}