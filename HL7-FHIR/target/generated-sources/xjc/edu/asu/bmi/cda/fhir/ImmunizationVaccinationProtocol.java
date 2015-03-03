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
 * Immunization event information.
 * 
 * <p>Java class for Immunization.VaccinationProtocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Immunization.VaccinationProtocol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doseSequence" type="{http://hl7.org/fhir}integer"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="authority" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="series" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="seriesDoses" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="doseTarget" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="doseStatus" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="doseStatusReason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immunization.VaccinationProtocol", propOrder = {
    "doseSequence",
    "description",
    "authority",
    "series",
    "seriesDoses",
    "doseTarget",
    "doseStatus",
    "doseStatusReason"
})
public class ImmunizationVaccinationProtocol
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Integer doseSequence;
    protected edu.asu.bmi.cda.fhir.String description;
    protected ResourceReference authority;
    protected edu.asu.bmi.cda.fhir.String series;
    protected Integer seriesDoses;
    @XmlElement(required = true)
    protected CodeableConcept doseTarget;
    @XmlElement(required = true)
    protected CodeableConcept doseStatus;
    protected CodeableConcept doseStatusReason;

    /**
     * Gets the value of the doseSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoseSequence() {
        return doseSequence;
    }

    /**
     * Sets the value of the doseSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoseSequence(Integer value) {
        this.doseSequence = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setDescription(edu.asu.bmi.cda.fhir.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setAuthority(ResourceReference value) {
        this.authority = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setSeries(edu.asu.bmi.cda.fhir.String value) {
        this.series = value;
    }

    /**
     * Gets the value of the seriesDoses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeriesDoses() {
        return seriesDoses;
    }

    /**
     * Sets the value of the seriesDoses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeriesDoses(Integer value) {
        this.seriesDoses = value;
    }

    /**
     * Gets the value of the doseTarget property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDoseTarget() {
        return doseTarget;
    }

    /**
     * Sets the value of the doseTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDoseTarget(CodeableConcept value) {
        this.doseTarget = value;
    }

    /**
     * Gets the value of the doseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDoseStatus() {
        return doseStatus;
    }

    /**
     * Sets the value of the doseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDoseStatus(CodeableConcept value) {
        this.doseStatus = value;
    }

    /**
     * Gets the value of the doseStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDoseStatusReason() {
        return doseStatusReason;
    }

    /**
     * Sets the value of the doseStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDoseStatusReason(CodeableConcept value) {
        this.doseStatusReason = value;
    }

    public ImmunizationVaccinationProtocol withDoseSequence(Integer value) {
        setDoseSequence(value);
        return this;
    }

    public ImmunizationVaccinationProtocol withDescription(edu.asu.bmi.cda.fhir.String value) {
        setDescription(value);
        return this;
    }

    public ImmunizationVaccinationProtocol withAuthority(ResourceReference value) {
        setAuthority(value);
        return this;
    }

    public ImmunizationVaccinationProtocol withSeries(edu.asu.bmi.cda.fhir.String value) {
        setSeries(value);
        return this;
    }

    public ImmunizationVaccinationProtocol withSeriesDoses(Integer value) {
        setSeriesDoses(value);
        return this;
    }

    public ImmunizationVaccinationProtocol withDoseTarget(CodeableConcept value) {
        setDoseTarget(value);
        return this;
    }

    public ImmunizationVaccinationProtocol withDoseStatus(CodeableConcept value) {
        setDoseStatus(value);
        return this;
    }

    public ImmunizationVaccinationProtocol withDoseStatusReason(CodeableConcept value) {
        setDoseStatusReason(value);
        return this;
    }

    @Override
    public ImmunizationVaccinationProtocol withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationVaccinationProtocol withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationVaccinationProtocol withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationVaccinationProtocol withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationVaccinationProtocol withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
