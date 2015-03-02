//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 11:08:02 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the event of a patient being given a dose of a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.
 * 
 * Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 * 
 * <p>Java class for MedicationAdministration.Dosage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationAdministration.Dosage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="timingDateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *           &lt;element name="timingPeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="asNeededBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="asNeededCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/&gt;
 *         &lt;element name="maxDosePerPeriod" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationAdministration.Dosage", propOrder = {
    "timingPeriod",
    "timingDateTime",
    "asNeededCodeableConcept",
    "asNeededBoolean",
    "site",
    "route",
    "method",
    "quantity",
    "rate",
    "maxDosePerPeriod"
})
public class MedicationAdministrationDosage
    extends BackboneElement
    implements Serializable
{

    protected Period timingPeriod;
    protected DateTime timingDateTime;
    protected CodeableConcept asNeededCodeableConcept;
    protected Boolean asNeededBoolean;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected CodeableConcept method;
    protected Quantity quantity;
    protected Ratio rate;
    protected Ratio maxDosePerPeriod;

    /**
     * Gets the value of the timingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * Sets the value of the timingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTimingPeriod(Period value) {
        this.timingPeriod = value;
    }

    /**
     * Gets the value of the timingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * Sets the value of the timingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTimingDateTime(DateTime value) {
        this.timingDateTime = value;
    }

    /**
     * Gets the value of the asNeededCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * Sets the value of the asNeededCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAsNeededCodeableConcept(CodeableConcept value) {
        this.asNeededCodeableConcept = value;
    }

    /**
     * Gets the value of the asNeededBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * Sets the value of the asNeededBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsNeededBoolean(Boolean value) {
        this.asNeededBoolean = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSite(CodeableConcept value) {
        this.site = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setRate(Ratio value) {
        this.rate = value;
    }

    /**
     * Gets the value of the maxDosePerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    /**
     * Sets the value of the maxDosePerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = value;
    }

    public MedicationAdministrationDosage withTimingPeriod(Period value) {
        setTimingPeriod(value);
        return this;
    }

    public MedicationAdministrationDosage withTimingDateTime(DateTime value) {
        setTimingDateTime(value);
        return this;
    }

    public MedicationAdministrationDosage withAsNeededCodeableConcept(CodeableConcept value) {
        setAsNeededCodeableConcept(value);
        return this;
    }

    public MedicationAdministrationDosage withAsNeededBoolean(Boolean value) {
        setAsNeededBoolean(value);
        return this;
    }

    public MedicationAdministrationDosage withSite(CodeableConcept value) {
        setSite(value);
        return this;
    }

    public MedicationAdministrationDosage withRoute(CodeableConcept value) {
        setRoute(value);
        return this;
    }

    public MedicationAdministrationDosage withMethod(CodeableConcept value) {
        setMethod(value);
        return this;
    }

    public MedicationAdministrationDosage withQuantity(Quantity value) {
        setQuantity(value);
        return this;
    }

    public MedicationAdministrationDosage withRate(Ratio value) {
        setRate(value);
        return this;
    }

    public MedicationAdministrationDosage withMaxDosePerPeriod(Ratio value) {
        setMaxDosePerPeriod(value);
        return this;
    }

    @Override
    public MedicationAdministrationDosage withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationAdministrationDosage withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationAdministrationDosage withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationAdministrationDosage withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationAdministrationDosage withId(java.lang.String value) {
        setId(value);
        return this;
    }

}